package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.IgvBean;
import org.itskill.bean.TipoCambioBean;
import org.itskill.mapper.IgvMapper;
import org.itskill.services.IgvService;
import org.itskill.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class IgvController {

	@Autowired
	private IgvService igvService;

	@RequestMapping(value = "igv/igvCrud.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView inicioPageArticulo(ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Iniciando vista crudIgv");
		ModelAndView modelAndView = new ModelAndView("igvCrud", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "igv/executeCrudIgv.htm", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String ExecuteCrudTipoCambio(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();
		String opc = request.getParameter("opc");
		System.out.println("opc : " + opc);
		IgvBean igv = new IgvBean();
		Integer resultado = 0;
		try {

			System.out.println("USUARIO: " + (String) request.getSession().getAttribute("usuario"));
			String usuario = (String) request.getSession().getAttribute("usuario");
			igv.getUsu_crea().setVar_usuario(usuario);
			System.out.println("USUARIO: " + igv.getUsu_crea().getVar_usuario());
			if (opc.equals("Listar")) {
				rpta.put("data", igvService.listarIgv());
			} else if (opc.equals("findById")) {
				System.out.println("id: " + request.getParameter("id"));
				Integer id = (Integer.parseInt(request.getParameter("id")));
				System.out.println("step 1");
				rpta.put("showItem", igvService.encontrarIgv(id));
				System.out.println("step 2");
			} else if (opc.equals("delete")) {
				System.out.println("id: " + request.getParameter("id"));
				igv.setId_igv(Integer.parseInt(request.getParameter("id")));
				igv.getUsu_eli().setVar_usuario(usuario);
				System.out.println("step 1");
				resultado = igvService.eliminar(igv);
				System.out.println("step 3");
				rpta.put("id", resultado);
				System.out.println("step 4");
			} else if (opc.equals("Registrar") || opc.equals("edit")) {
				
				System.out.println("IGV: " + request.getParameter("igv"));
				igv.setVal_igv(Util.validarDouble(Double.parseDouble(Util.validarString(request.getParameter("igv")))));
				System.out.println("step 1");
				System.out.println("anno : " + request.getParameter("anno"));
				igv.setAnno_vigencia(Util.validarString(request.getParameter("anno")));
				System.out.println("step 1");
				
				if (opc.equals("Registrar")) {
					System.out.println("step 1");
					resultado = igvService.save(igv);
					System.out.println("step 3");
					rpta.put("id", resultado);
					System.out.println("step 4");
				} else if (opc.equals("edit")) {
					System.out.println("id: " + request.getParameter("id"));
					igv.setId_igv(Integer.parseInt(request.getParameter("id")));
					System.out.println("step 1");
					resultado = igvService.editar(igv);
					System.out.println("step 3");
					rpta.put("id", resultado);
					System.out.println("step 4");
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
