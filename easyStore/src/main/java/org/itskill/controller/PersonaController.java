package org.itskill.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.CargoBean;
import org.itskill.bean.MarcaBean;
import org.itskill.bean.PersonaBean;
import org.itskill.bean.TipoPersonaBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.bean.ZonaBean;
import org.itskill.services.CargoService;
import org.itskill.services.TipoPersonaService;
import org.itskill.services.ZonaService;
import org.itskill.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class PersonaController {
/*	
	@Autowired
	ZonaService zonaService;
	
	@Autowired
	CargoService cargoService;
	
	@Autowired
	TipoPersonaService tipoPersonaService;
	
	@Autowired
	PersonaService personaService;
	
	Gson gson = new Gson();
	@RequestMapping(value = "main/persona.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView mainPersona(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
	
		List<ZonaBean> listZona = zonaService.listarAll();
		List<CargoBean> listCargo = cargoService.listarAll();
		List<TipoPersonaBean> listTipo=tipoPersonaService.listarAll();
		
		modelMap.put("listTipo", listTipo);
		System.out.println(listTipo.get(0).getDescTipoPersona());
		modelMap.put("cmboZona", listZona);
		System.out.println(listZona.get(0).getNomZona());
	    modelMap.put("cmboCargo", listCargo);
	    System.out.println(listCargo.get(0).getDescCargo());
		ModelAndView modelAndView = new ModelAndView("personaMain", modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value = "main/regpersona.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String regPersona(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> rpta = new HashMap<String, Object>();
		    System.out.println("Entro a guardarPersona ");

			PersonaBean personaBean = new PersonaBean();
			ZonaBean zonaBean = new ZonaBean();
			TipoPersonaBean tipoPersonaBean = new TipoPersonaBean();
			CargoBean cargoBean= new CargoBean(); 
		try {
				String nombre = request.getParameter("txtNomPer").trim();
				String apePat = request.getParameter("txtApePatPer").trim();
				String apeMat = request.getParameter("txtApeMatPer").trim();
				String dni = request.getParameter("txtDni").trim();
				String direccion = request.getParameter("txtDirec").trim();
				String celular = request.getParameter("txtCelular").trim();
				String telefono = request.getParameter("txtTelefono").trim();
				String correo = request.getParameter("txtCorreo").trim();
				String zona = request.getParameter("cboZona");
				String cargo = request.getParameter("cboCargo");
				String tipo = request.getParameter("tipoPersona");
				System.out.println(nombre);
				System.out.println(apePat);
				System.out.println(apeMat);
				System.out.println(dni);
				System.out.println(direccion);
				System.out.println(celular);
				System.out.println(telefono);
				System.out.println(correo);
				System.out.println(zona);
				System.out.println(cargo);
				System.out.println(tipo);
				
                personaBean.setDescNombre(nombre);
                personaBean.setApePaterno(apePat);
                personaBean.setApeMaterno(apeMat);
                personaBean.setDni(dni);
                personaBean.setDireccion(direccion);
                personaBean.setCelular(celular);
                personaBean.setTelefono(telefono);
                personaBean.setCorreo(correo);
                zonaBean.setIdZona(Integer.parseInt(zona));
                personaBean.setZonaBean(zonaBean);
                cargoBean.setIdCargo(Integer.parseInt(cargo));
                personaBean.setCargoBean(cargoBean);
                tipoPersonaBean.setIdTipoPersona(Integer.parseInt(tipo));
                personaBean.setTipoPersonaBean(tipoPersonaBean);
      
				Integer resPersona = personaService.save(personaBean);
				System.out.println("Persona registrado: " + resPersona);
				
				if (resMarca == 0) {
					System.out.println("Registro con exito: ");
					rpta.put("status", true);
					rpta.put("mensaje", "Se registro con exito");
				} else {
					System.out.println("NO SE PUDO REGISTRAR POR DUPLICIDAD: ");
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
	*/
	
}
