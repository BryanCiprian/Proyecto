package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.ClienteBean;
import org.itskill.bean.ContactoBean;
import org.itskill.bean.DepartamentoBean;
import org.itskill.bean.DistritoBean;
import org.itskill.bean.InventarioDocumentoBean;
import org.itskill.bean.MarcaBean;
import org.itskill.bean.PersonaBean;
import org.itskill.bean.ProveedorBean;
import org.itskill.bean.ProvinciaBean;
import org.itskill.bean.TipoClienteBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.bean.ZonaBean;
import org.itskill.services.ClienteService;
import org.itskill.services.ContactoService;
import org.itskill.services.DepartamentoService;
import org.itskill.services.DistritoService;
import org.itskill.services.InventarioDocumentoService;
import org.itskill.services.PersonaService;
import org.itskill.services.ProveedorService;
import org.itskill.services.ProvinciaService;
import org.itskill.services.TipoClienteService;
import org.itskill.services.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.sun.org.glassfish.gmbal.DescriptorFields;

@Controller
public class ProveedorController {
    
	@Autowired
	private DepartamentoService departamentoService;
		
	@Autowired
	private ProvinciaService provinciaService;
	
	@Autowired
	private DistritoService distritoService;
	
	@Autowired
	private ZonaService zonaService;
	
	@Autowired
	private PersonaService personaService;
	
	@Autowired
	private ContactoService contactoService;
	
	@Autowired
	private InventarioDocumentoService inventarioDocumentoService;
	
	
	@Autowired
	private ProveedorService proveedorService;
	Gson gson = new Gson();
	

	@RequestMapping(value = "admin/prove.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView proveedorMain(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		List<DepartamentoBean> listDepartamento = departamentoService.listarAll();
	    modelMap.put("cmboDepartamento", listDepartamento);
	
	    List<InventarioDocumentoBean> listDocumento = inventarioDocumentoService.listarTipoDocumentoIdentidad();
	    modelMap.put("cmboTipoDocumento", listDocumento);
		//System.out.println(listDepartamento.get(0).getDesDepartamento());
		ModelAndView modelAndView = new ModelAndView("proveedorMain", modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value = "prove/listProvincia.htm", method = { RequestMethod.GET, RequestMethod.POST })
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
	
	@RequestMapping(value = "prove/listDistrito.htm", method = { RequestMethod.GET, RequestMethod.POST })
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
	
	@RequestMapping(value = "prove/listZona.htm", method = { RequestMethod.GET, RequestMethod.POST })
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
	@RequestMapping(value = "main/regproveedor.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regProveedor(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> rpta = new HashMap<String, Object>();
		    System.out.println("Entro a guardar cliente ");

			PersonaBean personaBean = new PersonaBean();
			ProveedorBean proveedorBean= new ProveedorBean();
			ContactoBean contactoBean = new ContactoBean();
			UsuarioBean usuarioBean = new UsuarioBean();
			ZonaBean zonaBean = new ZonaBean();
			InventarioDocumentoBean inventarioDocumentoBean= new InventarioDocumentoBean();
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
				
				String numRuc = request.getParameter("txtNumRuc").trim(); 
				String nomRazSo = request.getParameter("txtNomRazSo").trim();
				String nomCom = request.getParameter("txtNomCom").trim();
				String urlWeb = request.getParameter("txtUrlWeb");
				
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
				System.out.println(numRuc);
				System.out.println(nomRazSo);
				System.out.println(nomCom);
				System.out.println(urlWeb);
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
                proveedorBean.setIdPersona(idPersona);
                proveedorBean.setNumRuc(numRuc);
                proveedorBean.setNomRazSo(nomRazSo);
                proveedorBean.setNomCom(nomCom);
                proveedorBean.setUrlWeb(urlWeb);
                proveedorBean.setUsuarioBean(usuarioBean);
                
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
                
				Integer resProveedor =proveedorService.save(proveedorBean); 
				Integer resContacto= contactoService.save(contactoBean);
				
				if (resProveedor != 0) {
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

