package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.AlmacenBean;
import org.itskill.bean.MarcaBean;
import org.itskill.services.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class AlmacenController {

	@Autowired
	private AlmacenService almacenService;
	Gson gson = new Gson();
	
	@RequestMapping(value = "admin/almac.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView almacenMain(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		List<AlmacenBean> listarAlmacen = almacenService.listarAll();
		modelMap.put("listAlmacen", listarAlmacen);
		ModelAndView modelAndView = new ModelAndView("almacenMain", modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value = "admin/listAlmacen.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listMarca(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		List<AlmacenBean> listAlmacen = almacenService.listarAll();
		rpta.put("lista", listAlmacen);
		rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}
	
	@RequestMapping(value = "admin/regalmacen.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regAlmacen(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		System.out.println("Entro a guardar Almacèn ");

		AlmacenBean almacenBean = new AlmacenBean();
		try {
			String nomAlmacen = request.getParameter("txtNomAlmacen").trim();
			String dirAlmacen = request.getParameter("txtDirAlmacen").trim();
			
			almacenBean.setNomAlmacen(nomAlmacen);
			almacenBean.setDirAlmacen(dirAlmacen);
		
			
			Integer res = almacenService.save(almacenBean);
			System.out.println("registrado: " + res);
			if (res == 0) {
				System.out.println("Registro con exito: ");
				rpta.put("status", true);
				rpta.put("mensaje", "Se registro con exito");
				rpta.put("rpta", "1");
			} else {
				System.out.println("NO SE PUDO REGISTRAR POR DUPLICIDAD: ");
				rpta.put("status", false);
				rpta.put("rpta", "-1");

			}
			
		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			rpta.put("rpta", "-1");
			rpta.put("mensaje", e.getMessage());

		}

		return gson.toJson(rpta);
	}
	
	@RequestMapping(value = "admin/delalmacen.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String delAlmacen(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Entro a eliminar Almacen ");
		// ModelAndView modelAndView = new ModelAndView("marcaMain", modelMap);
		Map<String, Object> rpta = new HashMap<String, Object>();
		AlmacenBean almacenBean = new AlmacenBean();
		try {
			Integer idAlmacen = Integer.parseInt(request.getParameter("idAlmacen"));
			
			almacenBean.setIdAlmacen(idAlmacen);

			Integer res = almacenService.delete(almacenBean);
			System.out.println(" eliminada : " + res);

		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			rpta.put("status", false);
			rpta.put("mensaje", e.getMessage());
			// return modelAndView;
		}


		return gson.toJson(rpta);
	}
	
	@RequestMapping(value = "admin/pupdalmacen.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String pupdAlmacen( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer idAlmacen = Integer.parseInt(request.getParameter("idAlmacen"));
		AlmacenBean almacBean = new AlmacenBean(); 
		almacBean.setIdAlmacen(idAlmacen);
		AlmacenBean almacenBean = almacenService.listxid(almacBean);
		rpta.put("almacen", almacenBean);
		//rpta.put("status", true);
		//modelMap.put("nomMarca", marcaBean.getNomMarca());
		//modelMap.put("idMarca", marcaBean.getIdMarca());
		System.out.println("Almacèn " + almacenBean.getNomAlmacen());
		//ModelAndView modelAndView = new ModelAndView("marcaPupd", modelMap);
		return gson.toJson(rpta);
	}
	
	@RequestMapping(value = "admin/updalmacen.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updMarca(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		System.out.println("Entro a actualizar Almacen ");
		Integer idAlmacen = Integer.parseInt(request.getParameter("idAlmacen"));
		String nomAlmacen = request.getParameter("txtNomAlmacen").trim();
		String dirAlmacen = request.getParameter("txtDirAlmacen").trim();
		AlmacenBean almacenBean= new AlmacenBean();
		almacenBean.setIdAlmacen(idAlmacen);
		almacenBean.setNomAlmacen(nomAlmacen);
		almacenBean.setDirAlmacen(dirAlmacen);
		System.out.println(almacenBean.getIdAlmacen());
		System.out.println(almacenBean.getNomAlmacen());
		System.out.println(almacenBean.getDirAlmacen());
		
		Integer resul = almacenService.update(almacenBean);
		
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
