/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.itskill.bean.*;
import org.itskill.services.*;

import org.itskill.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class MantenimientoController {

    private final static Logger logger = Logger.getLogger(MantenimientoController.class.getName());
    @Autowired
    private VistaService vistaService;
  /*  @Autowired
    private PersonaService personaService;
    @Autowired
    private AlmacenService almacenService;
    @Autowired
    private InventarioDocumentoService inventarioDocumentoService;*/
   
   /* @Autowired
    private MarcaService marcaService;
    @Autowired
    private EscuchaService escuchaService;
    @Autowired
    private PlanContableService cuentaContableService;*/
    
    
    @RequestMapping(value = "proc/vta.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView inicioPageVenta(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a inicioPageVenta ");
        ModelAndView modelAndView = new ModelAndView("inicioVenta", modelMap);
        return modelAndView;
    }
    
    /*
    
    @RequestMapping(value = "proc/opcionCompra.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView inicioPageCompra(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a opcionCompra ");
        ModelAndView modelAndView = new ModelAndView("opcionCompra", modelMap);
       
        List<AlmacenBean> listaAlmacen =  new ArrayList<>();
        listaAlmacen= almacenService.listarAlmacen();
        for( AlmacenBean s : listaAlmacen){
        System.out.println(" id_almacen: "+s.getId_almacen()+" nom_almacen: "+s.getNom_almacen() +" direccion_almacen: "+s.getDir_almacen());
        }

        List<InventarioDocumentoBean> listaTipoComprobante = new ArrayList<>();
        listaTipoComprobante = inventarioDocumentoService.listarTipoComprobantePagoComercial();
        
        List<InventarioDocumentoBean> listaTipoExistencia = new ArrayList<>();
        listaTipoExistencia = inventarioDocumentoService.listarTipoExistenciaComercial();
        
        List<InventarioDocumentoBean> listaUnidadMedida = new ArrayList<>();
        listaUnidadMedida = inventarioDocumentoService.listarUnidadMedidaComercial();
        
        
        System.out.println("cantidad de Almacen " +listaAlmacen.size());
        request.getSession().setAttribute("listaAlmacen", listaAlmacen);
        modelMap.addAttribute("listaAlmacen", listaAlmacen);
        
        request.getSession().setAttribute("listaTipoComprobante", listaTipoComprobante);
        modelMap.addAttribute("listaTipoComprobante", listaTipoComprobante);
        
        request.getSession().setAttribute("listaTipoExistencia", listaTipoExistencia);
        modelMap.addAttribute("listaTipoExistencia", listaTipoExistencia);
        
        request.getSession().setAttribute("listaUnidadMedida", listaUnidadMedida);
        modelMap.addAttribute("listaUnidadMedida", listaUnidadMedida);
        
        return modelAndView;
    }  
    */
  
    /*
    @RequestMapping(value = "proc/regVta.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView registrarVenta(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a registrarVenta ");
        
        String nom = request.getParameter("txtNombre");
        String pat = request.getParameter("txtPaterno");
        String mat = request.getParameter("txtMaterno");
        String dir = request.getParameter("txtDireccion");
        String dni ="41774651";// request.getParameter("txtDni");
        String zona = request.getParameter("txtZona");

        System.out.println("registrarVenta.nom: "+nom);
        System.out.println("registrarVenta.pat: "+pat);
        System.out.println("registrarVenta.mat: "+mat);
        System.out.println("registrarVenta.dir: "+dir);
        System.out.println("registrarVenta.DNI: "+dni);
        
        PersonaBean personaBean = new PersonaBean();
        personaBean.setDes_nombre(nom);
        personaBean.setApe_paterno(pat);
        personaBean.setApe_materno(mat);
        personaBean.setDni(dni);
        personaBean.getZonaBean().setId_zona(1);
        personaBean.setDireccion(dir);
        
       Integer valor= personaService.guardarPersona(personaBean);
       System.out.println(" .valor: "+valor);
        
        
        ModelAndView modelAndView = new ModelAndView("inicioVenta", modelMap);
        return modelAndView;
    }
    *//*
    @RequestMapping(value = "proc/manMca.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView guardarMarca(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a guardarMarca ");
        ModelAndView modelAndView = new ModelAndView("regMarca", modelMap);
        MarcaBean marca =  new MarcaBean();
        UsuarioBean usuarioBean = new UsuarioBean();
        try {
        	 String nomMarca=request.getParameter("nombreMarca");
         	System.out.println("nomMarca: "+nomMarca);
         	marca.setNomMarca(nomMarca);
         	System.out.println("nomMarca: "+marca.getNomMarca());
         	
         	usuarioBean= (UsuarioBean) request.getSession().getAttribute("usuarioBean");	
            System.out.println("USUARIO: "+usuarioBean.getVar_usuario());
            marca.getUsuarioBean().setVar_usuario(usuarioBean.getVar_usuario());            
            System.out.println("USUARIO: "+marca.getUsuarioBean().getVar_usuario());
         	
         	
         	Integer resMarca = marcaService.save(marca);
         	System.out.println("MARCA registrado: "+resMarca);
         	List<MarcaBean> listarMarca = marcaService.listarAll();
         	if(resMarca==0){
         		System.out.println("Registro con exito: ");
         	}else{
         		System.out.println("NO SE PUDO REGISTRAR POR DUPLICIDAD: ");
         	}
         	 modelMap.put("listaMarca", listarMarca);
		} catch (Exception e) {
			System.out.println("1ER - ERROR "+e.getStackTrace());
			System.out.println("2DO - ERROR "+e.getMessage());
			return modelAndView;
		}
       
        request.getSession().setAttribute("usuarioBean", usuarioBean);
    	
        return modelAndView;
    }
    
    @RequestMapping(value = "proc/delMca.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView deleteMarca(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a deleteMarca ");
        ModelAndView modelAndView = new ModelAndView("regMarca", modelMap);
        MarcaBean marca =  new MarcaBean();
        UsuarioBean usuarioBean = new UsuarioBean();
        usuarioBean= (UsuarioBean) request.getSession().getAttribute("usuarioBean");
        List<MarcaBean> listarMarca = marcaService.listarAll();
        modelMap.put("listaMarca", listarMarca);
        return modelAndView;
        }
    
    @RequestMapping(value = "proc/updMca.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView updateMarca(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a deleteMarca ");
        ModelAndView modelAndView = new ModelAndView("regMarca", modelMap);
        MarcaBean marca =  new MarcaBean();
        UsuarioBean usuarioBean = new UsuarioBean();
        usuarioBean= (UsuarioBean) request.getSession().getAttribute("usuarioBean");
        List<MarcaBean> listarMarca = marcaService.listarAll();
        modelMap.put("listaMarca", listarMarca);
        return modelAndView;
        }
   
    @RequestMapping(value = "proc/manPcta.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView guardarPlanCuenta(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a guardarPlanCuenta ");
        ModelAndView modelAndView = new ModelAndView("regPlanCta", modelMap);         
        CuentaPlanContableBean 		cuenta 		= new CuentaPlanContableBean();
//        SubCuentaPlanContableBean 	subCuenta 	= new SubCuentaPlanContableBean();        
        UsuarioBean usuarioBean = new UsuarioBean();
        try {
        	String idClase=request.getParameter("idClase");
        	String idGrupo=request.getParameter("idGrupo");
        	String idCodCt=request.getParameter("idCuenta");
        	String nomCta =request.getParameter("nomCuenta");
        	
        	System.out.println("idClase:     "+idClase);
        	System.out.println("idGrupo:     "+idGrupo);
        	System.out.println("idCodCuenta: "+idCodCt);
        	System.out.println("nomCta:      "+nomCta);
        	
         	cuenta.getGrupo().getClase().setIdClase(Integer.parseInt(idClase));
         	System.out.println("idClase: "+cuenta.getGrupo().getClase().getIdClase());
         	
         	
         	cuenta.getGrupo().setIdGrupo(Integer.parseInt(idGrupo));
         	System.out.println("CodGrupo: "+cuenta.getGrupo().getIdGrupo());        	
        	
        	
         	cuenta.setIdCuenta(Integer.parseInt(idCodCt));
         	System.out.println("CodCuenta: "+cuenta.getIdCuenta());
        	
         	
         	cuenta.setDesCuenta(nomCta);
         	System.out.println("DescripcionCuenta: "+cuenta.getIdCuenta());
         	
         	usuarioBean= (UsuarioBean) request.getSession().getAttribute("usuarioBean");	
            System.out.println("USUARIO: "+usuarioBean.getVar_usuario());
            cuenta.getUsuarioBean().setVar_usuario(usuarioBean.getVar_usuario());            
            System.out.println("USUARIO: "+cuenta.getUsuarioBean().getVar_usuario());
         	
         	
        	Integer resCuenta = cuentaContableService.save(cuenta);
         	System.out.println("CUENTA CONTABLE registrado: "+resCuenta);
         	List<CuentaPlanContableBean> listarCuenta = cuentaContableService.listarAll();
         	if(resCuenta==0){
         		System.out.println("Registro con exito: "+resCuenta);
         	}else{
         		System.out.println("NO SE PUDO REGISTRAR POR DUPLICIDAD: "+resCuenta);
         	}
         	 modelMap.put("listarCuenta", listarCuenta);
            
            List<ClasePlanContableBean> clp =  escuchaService.listarClase();
	        List<GrupoPlanContableBean> grp =  escuchaService.listarGrupo();
	        List<CuentaPlanContableBean> ctp = escuchaService.listarCuenta();
	        System.out.println(" inicioPagePlanCta.clase: "+clp.size());
	        System.out.println(" inicioPagePlanCta.grupo: "+grp.size());
	        System.out.println(" inicioPagePlanCta.cuenta: "+ctp.size());
	        
	        modelMap.put("cmboClase", clp);
	      //  modelMap.put("cmboGrupo", grp);
	        modelMap.put("cmboCuent", ctp);
            
		} catch (Exception e) {
			System.out.println("1ER -guardarPlanCuenta. ERROR "+e.getStackTrace());
			System.out.println("2DO -guardarPlanCuenta. ERROR "+e.getMessage());
			return modelAndView;
		}
       
        request.getSession().setAttribute("usuarioBean", usuarioBean);
    	
        return modelAndView;
    }
    @RequestMapping(value = "proc/delCta.htm", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView deleteCuenta(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Entro a deleteCuenta ");
        ModelAndView modelAndView = new ModelAndView("regMarca", modelMap);
        MarcaBean marca =  new MarcaBean();
        UsuarioBean usuarioBean = new UsuarioBean();
        
        
        
        usuarioBean= (UsuarioBean) request.getSession().getAttribute("usuarioBean");       
        return modelAndView;
        }
    */
}
