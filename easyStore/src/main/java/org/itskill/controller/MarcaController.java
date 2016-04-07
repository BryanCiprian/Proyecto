package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.MarcaBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.bean.VistaBean;
import org.itskill.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class MarcaController {
	@Autowired
	private MarcaService marcaService;
	Gson gson = new Gson();
	

	@RequestMapping(value = "admin/marca.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView marcaMain(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		List<MarcaBean> listarMarca = marcaService.listarAll();
		modelMap.put("listaMarca", listarMarca);
		ModelAndView modelAndView = new ModelAndView("marcaMain", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "admin/listMarca.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listMarca(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		List<MarcaBean> listarMarca = marcaService.listarAll();
		rpta.put("lista", listarMarca);
		rpta.put("data", listarMarca);
		rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}

	@RequestMapping(value = "admin/regmarca.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regMarca(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		System.out.println("Entro a guardarMarca ");

		MarcaBean marca = new MarcaBean();
		UsuarioBean usuarioBean = new UsuarioBean();
		try {
			String nomMarca = request.getParameter("txtNomMarca").trim();
			System.out.println("nomMarca: " + nomMarca);
			marca.setNomMarca(nomMarca);
			System.out.println("nomMarca: " + marca.getNomMarca());

			usuarioBean = (UsuarioBean) request.getSession().getAttribute("usuarioBean");
			System.out.println("USUARIO: " + usuarioBean.getVar_usuario());
			marca.setUsuarioBean(usuarioBean);
		//	System.out.println("USUARIO: " + marca.getUsuarioBean().getVar_usuario());

			Integer resMarca = marcaService.save(marca);
			System.out.println("MARCA registrado: " + resMarca);
			// List<MarcaBean> listarMarca = marcaService.listarAll();
			if (resMarca == 0) {
				System.out.println("Registro con exito: ");
				rpta.put("status", true);
				rpta.put("mensaje", "Se registro con exito");
				rpta.put("rpta", "1");
			} else {
				System.out.println("NO SE PUDO REGISTRAR POR DUPLICIDAD: ");
				rpta.put("status", false);
				rpta.put("rpta", "-1");

			}
			
			// modelMap.put("listaMarca", listarMarca);
		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			rpta.put("rpta", "-1");
			rpta.put("mensaje", e.getMessage());

		}
		request.getSession().setAttribute("usuarioBean", usuarioBean);

		return gson.toJson(rpta);
	}

	@RequestMapping(value = "admin/delmarca.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String delMarca(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Entro a eliminar Marca ");
		// ModelAndView modelAndView = new ModelAndView("marcaMain", modelMap);
		Map<String, Object> rpta = new HashMap<String, Object>();
		MarcaBean marca = new MarcaBean();
		UsuarioBean usuarioBean = new UsuarioBean();
		try {
			String nomMarca = request.getParameter("descMarca");
			System.out.println("nomMarca: " + nomMarca);
			marca.setNomMarca(nomMarca);
			System.out.println("nomMarca: " + marca.getNomMarca());

			usuarioBean = (UsuarioBean) request.getSession().getAttribute("usuarioBean");
			System.out.println("USUARIO: " + usuarioBean.getVar_usuario());
			marca.getUsuarioBean().setVar_usuario(usuarioBean.getVar_usuario());
			System.out.println("USUARIO: " + marca.getUsuarioBean().getVar_usuario());

			Integer resMarca = marcaService.delete(marca);
			System.out.println("MARCA eliminada : " + resMarca);
			rpta.put("id", resMarca);
			rpta.put("status", true);
			// List<MarcaBean> listarMarca = marcaService.listarAll();

			// modelMap.put("listaMarca", listarMarca);
		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			rpta.put("status", false);
			rpta.put("mensaje", e.getMessage());
			// return modelAndView;
		}

		request.getSession().setAttribute("usuarioBean", usuarioBean);

		return gson.toJson(rpta);
	}

	@RequestMapping(value = "admin/pupdmarca.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String pupdmarca( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer id = Integer.parseInt(request.getParameter("idMarca"));
		MarcaBean marca = new MarcaBean();
		marca.setIdMarca(id);
		MarcaBean marcaBean = marcaService.listxid(marca);
		rpta.put("marca", marcaBean);
		rpta.put("status", true);
		
		//modelMap.put("nomMarca", marcaBean.getNomMarca());
		//modelMap.put("idMarca", marcaBean.getIdMarca());
		System.out.println("Marca " + marcaBean.getNomMarca());
		//ModelAndView modelAndView = new ModelAndView("marcaPupd", modelMap);
		return gson.toJson(rpta);
	}

	@RequestMapping(value = "admin/updmarca.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updMarca(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("llegó ");
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer id = Integer.parseInt(request.getParameter("idMarca"));
		String nombre = request.getParameter("txtNomMarca").trim();
		MarcaBean marca = new MarcaBean();
		marca.setIdMarca(id);
		marca.setNomMarca(nombre);
		System.out.println("Marca " + marca.getNomMarca());
		System.out.println("id " + marca.getIdMarca());
		Integer resul = marcaService.update(marca);
		
		System.out.println(resul);
		if (resul == 0) {
			System.out.println("Registro con exito: ");
			rpta.put("status", true);
			rpta.put("rpta", "1");
		} else {
			rpta.put("status", true);
			System.out.println("NO SE PUDO REGISTRAR POR DUPLICIDAD: ");
			rpta.put("mensjae", "NO SE PUDO REGISTRAR POR DUPLICIDAD: ");
			rpta.put("rpta", "-1");
		}
		//ModelAndView modelAndView = new ModelAndView("marcaUpd", modelMap);
		return  gson.toJson(rpta);
	}

}
