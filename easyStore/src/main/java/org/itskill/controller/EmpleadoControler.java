package org.itskill.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.CargoBean;
import org.itskill.bean.ClienteBean;
import org.itskill.bean.ContactoBean;
import org.itskill.bean.DepartamentoBean;
import org.itskill.bean.DistritoBean;
import org.itskill.bean.EmpleadoBean;
import org.itskill.bean.InventarioDocumentoBean;
import org.itskill.bean.PersonaBean;
import org.itskill.bean.ProvinciaBean;
import org.itskill.bean.TipoClienteBean;
import org.itskill.bean.TipoPersonaBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.bean.ZonaBean;
import org.itskill.services.CargoService;
import org.itskill.services.ClienteService;
import org.itskill.services.ContactoService;
import org.itskill.services.DepartamentoService;
import org.itskill.services.DistritoService;
import org.itskill.services.EmpleadoService;
import org.itskill.services.InventarioDocumentoService;
import org.itskill.services.PersonaService;
import org.itskill.services.ZonaService;
import org.itskill.services.ProvinciaService;
import org.itskill.services.TipoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class EmpleadoControler {

	@Autowired
	DepartamentoService departamentoService;
	
	@Autowired
	TipoClienteService tipoClienteService;
	
	@Autowired
	ProvinciaService provinciaService;
	
	@Autowired
	DistritoService distritoService;
	
	@Autowired
	ZonaService zonaService;
	
	@Autowired
	CargoService cargoService;
	
	@Autowired
	PersonaService personaService;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@Autowired
	ContactoService contactoService;
	
	@Autowired
	InventarioDocumentoService inventarioDocumentoService;
	
	Gson gson = new Gson();
	@RequestMapping(value = "admin/empleado.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView mainCliente(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
	
		List<DepartamentoBean> listDepartamento = departamentoService.listarAll();
	    modelMap.put("cmboDepartamento", listDepartamento);
	    List<CargoBean> listCargo = cargoService.listarAll();
	    modelMap.put("cmboCargo", listCargo);
	   
	    List<InventarioDocumentoBean> listDocumento = inventarioDocumentoService.listarTipoDocumentoIdentidad();
	    modelMap.put("cmboTipoDocumento", listDocumento);
		//System.out.println(listDepartamento.get(0).getDesDepartamento());
		ModelAndView modelAndView = new ModelAndView("empleadoMain", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "emple/listProvincia.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listProvincia(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		DepartamentoBean departamentoBean= new DepartamentoBean();
		Integer idDepartamento= Integer.parseInt(request.getParameter("idDepartamento")); 
		departamentoBean.setIdDepartamento(idDepartamento);
		System.out.println(departamentoBean.getIdDepartamento());
		List<ProvinciaBean> listProvincia = provinciaService.listarProvinciaPorIdDepartamento(departamentoBean);
		System.out.println(listProvincia.size());
		for (int i=0 ; i<listProvincia.size(); i++){
			System.out.println(listProvincia.get(i).getDesProvincia());	
		}
		
		rpta.put("cmboProvincia", listProvincia);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}
	
	@RequestMapping(value = "emple/listDistrito.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listDistrito(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		ProvinciaBean provinciaBean= new ProvinciaBean();
		Integer idProvincia= Integer.parseInt(request.getParameter("idProvincia")); 
		provinciaBean.setIdProvincia(idProvincia);
		System.out.println(provinciaBean.getIdProvincia());
		List<DistritoBean> listDistrito = distritoService.listarDistritoPorIdProvincia(provinciaBean);
		System.out.println(listDistrito.size());
		for (int i=0 ; i<listDistrito.size(); i++){
			System.out.println(listDistrito.get(i).getDesDistrito());	
		}
		
		rpta.put("cmboDistrito", listDistrito);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}
	
	@RequestMapping(value = "emple/listZona.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String listZona(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> rpta = new HashMap<String, Object>();
		DistritoBean distritoBean= new DistritoBean();
		Integer idDistrito= Integer.parseInt(request.getParameter("idDistrito")); 
		distritoBean.setIdDistrito(idDistrito);
		System.out.println(distritoBean.getIdDistrito());
		List<ZonaBean> listZona = zonaService.listarZonaPorIdDistrito(distritoBean);
		System.out.println(listZona.size());
		for (int i=0 ; i<listZona.size(); i++){
			System.out.println(listZona.get(i).getDesZona());	
		}
		
		rpta.put("cmboZona", listZona);
		//rpta.put("rpta", "1");
		return gson.toJson(rpta);

	}
	
	@RequestMapping(value = "main/regempleado.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regCliente(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> rpta = new HashMap<String, Object>();
		    System.out.println("Entro a guardar empleado ");

			PersonaBean personaBean = new PersonaBean();
			EmpleadoBean empleadoBean = new EmpleadoBean();
			ContactoBean contactoBean = new ContactoBean();
			UsuarioBean usuarioBean = new UsuarioBean();
			ZonaBean zonaBean = new ZonaBean();
			InventarioDocumentoBean inventarioDocumentoBean= new InventarioDocumentoBean();
			CargoBean cargoBean = new CargoBean();
		try {
			    usuarioBean = (UsuarioBean) request.getSession().getAttribute("usuarioBean");
			    System.out.println(usuarioBean.getVar_usuario());
			    Integer zona = Integer.parseInt(request.getParameter("cboZona"));
			    String nombre = request.getParameter("txtNomPer").trim();
				String apePat = request.getParameter("txtApePatPer").trim();
				String apeMat = request.getParameter("txtApeMatPer").trim();
				System.out.println("llegò");
				Integer idTipoDocumento = Integer.parseInt(request.getParameter("cboTipoDocumento"));
				System.out.println(idTipoDocumento);
				String numDocumento= request.getParameter("txtNumDocumento").trim();
				String dia=request.getParameter("cboDia");
				String mes=request.getParameter("cboMes");
				String año=request.getParameter("cboYear");
				String fecNacimiento=año+"-"+mes+"-"+dia;
				String desDireccion = request.getParameter("txtDirec").trim();
				
				Integer idCargo = Integer.parseInt(request.getParameter("cboCargo"));
				String diaInicioContrato=request.getParameter("cboDiaInicioContrato");
				String mesInicioContrato=request.getParameter("cboMesInicioContrato");
				String yearInicioContrato=request.getParameter("cboYearInicioContrato");
				String fecInicioContrato = yearInicioContrato+"-"+mesInicioContrato+"-"+diaInicioContrato;
				String diaFinContrato=request.getParameter("cboDiaInicioContrato");
				String mesFinContrato=request.getParameter("cboMesInicioContrato");
				String yearFinContrato=request.getParameter("cboYearInicioContrato");
				String fecFinContrato = yearFinContrato+"-"+mesFinContrato+"-"+diaFinContrato;
				
				
				
				
				String telFijo1 = request.getParameter("txtTelefono1").trim();
				String telFijo2= request.getParameter("txtTelefono2").trim();
				String telFijo3 = request.getParameter("txtTelefono3").trim();
				
				String telCel1 = request.getParameter("txtCelular1").trim();
				String telCel2 = request.getParameter("txtCelular2").trim();
				String telCel3 = request.getParameter("txtCelular3").trim();
				
				String correo1 = request.getParameter("txtCorreo1").trim();
				String correo2 = request.getParameter("txtCorreo2").trim();
				String correo3 = request.getParameter("txtCorreo3").trim();
				
				
			    
				System.out.println(usuarioBean.getVar_usuario());
				System.out.println(nombre);
				System.out.println(apePat);
				System.out.println(apeMat);
				System.out.println(idTipoDocumento);
				System.out.println(numDocumento);
				System.out.println(fecNacimiento);
				System.out.println(desDireccion);
				System.out.println(idCargo);
				System.out.println(fecInicioContrato);
				System.out.println(fecFinContrato);
				System.out.println(telFijo1);
				System.out.println(telFijo2);
				System.out.println(telFijo3);
				System.out.println(telCel1);
				System.out.println(telCel2);
				System.out.println(telCel3);
				System.out.println(correo1);
				System.out.println(correo2);
				System.out.println(correo3);
			
				zonaBean.setIdZona(zona);
				inventarioDocumentoBean.setId_doc_inventario(idTipoDocumento);
				personaBean.setZonaBean(zonaBean);
                personaBean.setDescNombre(nombre);
                personaBean.setApePaterno(apePat);
                personaBean.setApeMaterno(apeMat);
                personaBean.setInventarioDocumentoBean(inventarioDocumentoBean);
				personaBean.setNumDocumento(numDocumento);
				personaBean.setFecNacimiento(fecNacimiento);
				personaBean.setDesDireccion(desDireccion);
				personaBean.setUsuarioBean(usuarioBean);
				
				Integer idPersona=personaService.save(personaBean);
				System.out.println("id registrado: " + idPersona);
				
				cargoBean.setIdCargo(idCargo);
                empleadoBean.setIdPersona(idPersona);
                empleadoBean.setCargoBean(cargoBean);
                empleadoBean.setFecInicioContrato(fecInicioContrato);
                empleadoBean.setFecFinContrato(fecFinContrato);
                empleadoBean.setUsuarioBean(usuarioBean);
                
				contactoBean.setIdPersona(idPersona);
				contactoBean.setTelFijo1(telFijo1);
				contactoBean.setTelFijo2(telFijo2);
				contactoBean.setTelFijo3(telFijo3);
				contactoBean.setTelCel1(telCel1);
				contactoBean.setTelCel2(telCel2);
				contactoBean.setTelCel3(telCel3);
				contactoBean.setCorreo1(correo1);
				contactoBean.setCorreo2(correo2);
				contactoBean.setCorreo3(correo3);
                contactoBean.setUsuarioBean(usuarioBean);
                
				Integer resEmpleado =empleadoService.save(empleadoBean);
				Integer resContacto= contactoService.save(contactoBean);
				
				if (resEmpleado != 0) {
					System.out.println("Registro con exito: ");
					rpta.put("status", true);
					rpta.put("mensaje", "Se registro con exito");
				} else {
					rpta.put("status", false);

				}
				rpta.put("rpta", "1");
				// modelMap.put("listaMarca", listarMarca);
			} catch (Exception e) {
				System.out.println("1ER - ERROR " + e.getStackTrace());
				System.out.println("2DO - ERROR " + e.getMessage());
				rpta.put("rpta", "-1");
				rpta.put("mensaje", e.getMessage());

			}

			return gson.toJson(rpta);
		}
}
