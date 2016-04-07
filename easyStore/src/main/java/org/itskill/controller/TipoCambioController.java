package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itskill.bean.UsuarioBean;
import org.itskill.bean.VistaBean;
import org.itskill.bean.MenuBean;
import org.itskill.bean.TipoCambioBean;
import org.itskill.services.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class TipoCambioController {

	@Autowired
	private TipoCambioService tcService;

	@RequestMapping(value = "tc/tipoCambio.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView registrarTipoCambio(ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Entro a registrarTipoCambio ");
		HttpSession sesion = request.getSession(true);

		TipoCambioBean tCambio = new TipoCambioBean();
		System.out.println("Compra: " + request.getParameter("compra"));
		tCambio.setVal_tc_compra(Double.parseDouble(request.getParameter("compra")));
		System.out.println("Venta: " + request.getParameter("venta"));
		tCambio.setVal_tc_venta(Double.parseDouble(request.getParameter("venta")));
		// System.out.println("Fecha: " + request.getParameter("fecha"));
		 tCambio.setFec_tc("10/10/10");
		System.out.println("USUARIO: " + (String) sesion.getAttribute("usuario"));
		String usuario = (String) sesion.getAttribute("usuario");
		tCambio.getUsu_crea().setVar_usuario(usuario);
		System.out.println("USUARIO: " + tCambio.getUsu_crea().getVar_usuario());
		Integer resulInTC = 0;

		Integer canTC = (Integer) sesion.getAttribute("canTC");
		List<VistaBean> vista = (List<VistaBean>) sesion.getAttribute("vistas");
		List<MenuBean> vistasMenu = (List<MenuBean>) sesion.getAttribute("vistasMenu");
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean = (UsuarioBean) sesion.getAttribute("usuarioBean");
		if (canTC == 0) {
			String tc = request.getParameter("txtTipoCambio");
			resulInTC = tcService.save(tCambio);
			System.out.println("Resultado de Tipo de cambio Insertado" + resulInTC);
		}
		sesion.setAttribute("vistas", vista);
		sesion.setAttribute("vistasMenu", vistasMenu);
		sesion.setAttribute("usuarioBean", usuarioBean);
		ModelAndView modelAndView = new ModelAndView("mainStore", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "caja/crudTipoCambio.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView AccesTocrudTipoCambio(ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("crudTipoCambio", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "caja/executeCrudTipoCambio.htm", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String ExecuteCrudTipoCambio(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();
		String opc = request.getParameter("opc");
		System.out.println("opc : " + opc);
		TipoCambioBean tCambio = new TipoCambioBean();
		HttpSession sesion = request.getSession(true);
		try {
			if (opc.equals("Listar")) {
				String html = "";
				List<TipoCambioBean> lista = tcService.listarTipoCambio();

				for (int i = 0; i < lista.size(); i++) {
					html += "<tr>";
					html += "<td>" + (i + 1) + " </td>";
					html += "<td>" + lista.get(i).getVal_tc_venta() + " </td>";
					html += "<td>" + lista.get(i).getVal_tc_compra() + " </td>";
					html += "<td>" + lista.get(i).getFec_tc() + " </td>";
					html += "<td><button >Editar<button></button>Eliminar</button> </td>";
					html += "</tr>";
				}
				rpta.put("tbody", html);

			} else {
				System.out.println("Compra: " + request.getParameter("compra"));
				tCambio.setVal_tc_compra(Double.parseDouble(request.getParameter("compra")));
				System.out.println("Venta: " + request.getParameter("venta"));
				tCambio.setVal_tc_venta(Double.parseDouble(request.getParameter("venta")));
				System.out.println("Fecha: " + request.getParameter("fecha"));
				tCambio.setFec_tc("" + request.getParameter("fecha"));
				System.out.println("USUARIO: " + (String) sesion.getAttribute("usuario"));
				String usuario = (String) sesion.getAttribute("usuario");
				tCambio.getUsu_crea().setVar_usuario(usuario);
				System.out.println("USUARIO: " + tCambio.getUsu_crea().getVar_usuario());
				Integer resulInTC = 0;
				if (opc.equals("Registrar")) {
					resulInTC = tcService.save(tCambio);
					rpta.put("id", resulInTC);
				} else {

				}
			}
			rpta.put("status", true);
		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			rpta.put("status", false);
		}

		return gson.toJson(rpta);
	}
}
