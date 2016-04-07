package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.itskill.bean.ClasePlanContableBean;
import org.itskill.bean.CuentaPlanContableBean;
import org.itskill.bean.GrupoPlanContableBean;
import org.itskill.bean.SubCuentaPlanContableBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.services.ClaseService;
import org.itskill.services.CuentaService;
import org.itskill.services.GrupoService;
import org.itskill.services.SubCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class PlanContableController {

	@Autowired
	ClaseService claseService;
	
	@Autowired
	GrupoService grupoService;
	
	@Autowired
	CuentaService cuentaService;
	
	@Autowired
	SubCuentaService subCuentaService;
	
	Gson gson = new Gson();
	
	@RequestMapping(value = "admin/plcta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView planCuentaMain(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		List<ClasePlanContableBean> listarClase = claseService.listarClase();
		modelMap.put("cmboClase", listarClase);
			/*List<CuentaBean> listarCuenta = cuentaService.listarAll();
		List<SubCuentaBean> listarSubCuenta;
		
		List<Object> lista ;
		for  (int i=0; i<listarCuenta.size() ; i++){
			//System.out.println(listarCuenta.get(i).getIdCuenta());
			lista.add(listarCuenta.get(i).getIdCuenta());
			listarSubCuenta=subCuentaService.listarxIdCuenta(listarCuenta.get(i));
			for  (int a=0; a<listarSubCuenta.size() ; a++){
				//System.out.println("Sub cuenta : " +listarSubCuenta.get(a).getIdSubCuenta());
				lista.add(listarSubCuenta.get(i).getIdSubCuenta());
			}
	  }
		System.out.println("Sub cuenta : " +lista.size());
	//	for  (int i=0; i<lista.size() ; i++){
			
		//}*/
		ModelAndView modelAndView = new ModelAndView("planCuentasMain", modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value = "admin/listGrupo.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listGrupo(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer idClase= Integer.parseInt(request.getParameter("idClase")); 
		List<GrupoPlanContableBean> listarGrupo = grupoService.listGrupoByIdClase(idClase);
		System.out.println(listarGrupo.size());
		for (int i=0 ; i<listarGrupo.size(); i++){
			System.out.println(listarGrupo.get(i).getDes_grupo());	
		}
		
		rpta.put("lista", listarGrupo);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}
	
	@RequestMapping(value = "admin/listCuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listCuenta(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer idGrupo= Integer.parseInt(request.getParameter("idGrupo")); 
		List<CuentaPlanContableBean> listarCuenta = cuentaService.listAllCuentaByGrupo(idGrupo);
		System.out.println(listarCuenta.size());
		for (int i=0 ; i<listarCuenta.size(); i++){
			System.out.println(listarCuenta.get(i).getDes_cuenta());	
		}
		
		rpta.put("lista", listarCuenta);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}
	@RequestMapping(value = "admin/listSubCuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listPlanSubCuenta(HttpServletRequest request, HttpServletResponse response) {

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		List<SubCuentaPlanContableBean> listarSubCuenta;
		Integer idCuenta= Integer.parseInt(request.getParameter("idPlanCuenta"));
		listarSubCuenta=subCuentaService.listarAllByCuenta(idCuenta);
			
		for  (int a=0; a<listarSubCuenta.size() ; a++){
			System.out.println("Sub cuenta : " +listarSubCuenta.get(a).getDes_sub_cuenta());	
		}
		/*for  (int i=0; i<listarCuenta.size() ; i++){
			System.out.println(listarCuenta.get(i).getIdCuenta());
			listarSubCuenta=subCuentaService.*(listarCuenta.get(i));
			for  (int a=0; a<listarSubCuenta.size() ; a++){
				System.out.println("Sub cuenta : " +listarSubCuenta.get(a).getIdSubCuenta());	
			}
	}*/
		//System.out.println(listarSubCuenta.size());
		
		
		rpta.put("listaSubCuenta", listarSubCuenta);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);
	}
	
	
	/*
	@RequestMapping(value = "admin/regcuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regCuenta (HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		System.out.println("Entro a guardar Cuenta ");

		CuentaBean cuentaBean = new CuentaBean();
		UsuarioBean usuarioBean = new UsuarioBean();
		GrupoBean grupoBean = new GrupoBean();
		try {
			usuarioBean = (UsuarioBean) request.getSession().getAttribute("usuarioBean");
			System.out.println("USUARIO: " + usuarioBean.getVar_usuario());
			Integer idCuenta = Integer.parseInt(request.getParameter("txtIdCuenta").trim());
			Integer idGrupo = Integer.parseInt(request.getParameter("cboGrupo"));
			String desCuenta = request.getParameter("txtDesCuenta");
			grupoBean.setIdGrupo(idGrupo);
			cuentaBean.setIdCuenta(idCuenta);
			cuentaBean.setDesCuenta(desCuenta);
			cuentaBean.setGrupoBean(grupoBean);
			cuentaBean.setUsuarioBean(usuarioBean);
			
		//	System.out.println("USUARIO: " + marca.getUsuarioBean().getVar_usuario());

			Integer res = cuentaService.save(cuentaBean);
			System.out.println("Cuenta registrado: " + res);
			// List<MarcaBean> listarMarca = marcaService.listarAll();
			if (res== 0) {
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
	
	@RequestMapping(value = "admin/regsubcuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regSubCuenta (HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		System.out.println("Entro a guardar SubCuenta ");

		SubCuentaBean subCuentaBean = new SubCuentaBean();
		UsuarioBean usuarioBean = new UsuarioBean();
		CuentaBean cuentaBean = new CuentaBean();
		try {
			usuarioBean = (UsuarioBean) request.getSession().getAttribute("usuarioBean");
			System.out.println("USUARIO: " + usuarioBean.getVar_usuario());
			Integer idSubCuenta = Integer.parseInt(request.getParameter("txtIdSubCuenta").trim());
			Integer idCuenta = Integer.parseInt(request.getParameter("cboCuenta"));
			String desSubCuenta = request.getParameter("txtDesSubCuenta");
			System.out.println(idSubCuenta +" "+idCuenta + " " + desSubCuenta  );
			
			cuentaBean.setIdCuenta(idCuenta);
			subCuentaBean.setIdSubCuenta(idSubCuenta);
			subCuentaBean.setDesSubCuenta(desSubCuenta);
			subCuentaBean.setCuentaBean(cuentaBean);
			subCuentaBean.setUsuarioBean(usuarioBean);
			
		//	System.out.println("USUARIO: " + marca.getUsuarioBean().getVar_usuario());

			Integer res = subCuentaService.save(subCuentaBean);
			System.out.println("Sub Cuenta registrado: " + res);
		
			if (res== 0) {
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
		request.getSession().setAttribute("usuarioBean", usuarioBean);

		return gson.toJson(rpta);
	}
	
	@RequestMapping(value = "admin/listPlanCuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listPlanCuenta(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();

		List<CuentaBean> listarCuenta = cuentaService.listarAll();
				for  (int i=0; i<listarCuenta.size() ; i++){
			System.out.println(listarCuenta.get(i).getIdCuenta());
			listarSubCuenta=subCuentaService.*(listarCuenta.get(i));
			for  (int a=0; a<listarSubCuenta.size() ; a++){
				System.out.println("Sub cuenta : " +listarSubCuenta.get(a).getIdSubCuenta());	
			}
	}
		//System.out.println(listarCuenta.size());
		
		
		rpta.put("listaCuenta", listarCuenta);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);
		
	}*/
	/*
	@RequestMapping(value = "admin/delplancuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String delPlanCuenta(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Entro a eliminar Cuenta ");
		Map<String, Object> rpta = new HashMap<String, Object>();
		CuentaBean cuentaBean = new CuentaBean();
		UsuarioBean usuarioBean = new UsuarioBean();
		try {
			Integer idCuenta = Integer.parseInt(request.getParameter("idCuenta"));
			System.out.println("idCuenta: " + idCuenta);
			cuentaBean.setIdCuenta(idCuenta);
		

			Integer res = cuentaService.delete(cuentaBean);
			System.out.println("cuenta eliminada : " + res);
			rpta.put("nCuentas", res);
			//rpta.put("status", true);
		
		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			//rpta.put("status", false);
			//rpta.put("mensaje", e.getMessage());
			
			
		}

		request.getSession().setAttribute("usuarioBean", usuarioBean);

		return gson.toJson(rpta);
	}
	
	@RequestMapping(value = "admin/pupdplancuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String pupdPlanCuenta( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer idCuenta = Integer.parseInt(request.getParameter("idCuenta"));
		CuentaBean cuentaBean = new CuentaBean();
	    cuentaBean.setIdCuenta(idCuenta);
		CuentaBean cBean = cuentaService.listxId(cuentaBean);
		//Integer idGrupo=cBean.getGrupoBean().getIdGrupo();
		
		rpta.put("cuenta", cBean);
		//rpta.put("status", true);
		
		//modelMap.put("nomMarca", marcaBean.getNomMarca());
		//modelMap.put("idMarca", marcaBean.getIdMarca());
		System.out.println("CUENTA " + cBean.getDesCuenta());
		//System.out.println("Gruo " + idGrupo);
		//ModelAndView modelAndView = new ModelAndView("marcaPupd", modelMap);
		return gson.toJson(rpta);
	}
	
	@RequestMapping(value = "admin/updplancuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updPlanCuenta( HttpServletRequest request, HttpServletResponse response) {
		System.out.println("llegó ");
		Map<String, Object> rpta = new HashMap<String, Object>();
		Integer idCuenta = Integer.parseInt(request.getParameter("txtIdCuenta"));
		String desCuenta = request.getParameter("txtDesCuenta").trim();
		CuentaBean cuentaBean = new CuentaBean();
		cuentaBean.setIdCuenta(idCuenta);
		cuentaBean.setDesCuenta(desCuenta);
		System.out.println(idCuenta + " " + desCuenta);
		Integer resul = cuentaService.update(cuentaBean);
		
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
	
	@RequestMapping(value = "admin/delplansubcuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String delPlanSubCuenta(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Entro a eliminar sub Cuenta ");
		Map<String, Object> rpta = new HashMap<String, Object>();
		SubCuentaBean subCuentaBean = new SubCuentaBean();
		try {
			Integer idSubCuenta = Integer.parseInt(request.getParameter("idSubCuenta"));
			System.out.println("idSubCuenta: " + idSubCuenta);
			subCuentaBean.setIdSubCuenta(idSubCuenta);
		

			Integer res = subCuentaService.delete(subCuentaBean);
			System.out.println("cuenta eliminada : " + res);
			rpta.put("res", res);
			//rpta.put("status", true);
		
		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			//rpta.put("status", false);
			//rpta.put("mensaje", e.getMessage());
			
			
		}

		

		return gson.toJson(rpta);
	}
	
*/
}
