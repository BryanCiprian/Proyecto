package org.itskill.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.UsuarioBean;
import org.itskill.encriptacion.Encriptacion;
import org.itskill.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class CompraController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "compra/compraCrud.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView inicioPageArticulo(ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Iniciando vista crudCompra");
		ModelAndView modelAndView = new ModelAndView("crudCompra", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "compra/executeCrudCompra.htm", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String ExecuteCrudTipoCambio(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();

		String opc = request.getParameter("opc");
		System.out.println("opc : " + opc);
		UsuarioBean usuario = new UsuarioBean();
		Integer resultado = 0;
		try {
			if (opc.equals("Listar")) {
				rpta.put("data", usuarioService.obtenerTodo());
			} else if (opc.equals("findById")) {
				System.out.println("id: " + request.getParameter("id"));
				Integer id = (Integer.parseInt(request.getParameter("id")));
				System.out.println("step 1");
				rpta.put("showItem", usuarioService.findUsuarioById(id));
				System.out.println("step 2");
			} else if (opc.equals("delete")) {
				System.out.println("id: " + request.getParameter("id"));
				System.out.println("step 1");
				resultado = usuarioService.delete(Integer.parseInt(request.getParameter("id")));
				System.out.println("step 3");
				rpta.put("id", resultado);
				System.out.println("step 4");
			} else if(opc.equals("listPersona")){
				
				rpta.put("data", usuarioService.listarPersona());
			}
			else if (opc.equals("save") || opc.equals("edit")) {
				/* data en comunn con editar y registrar */
				System.out.println("step 1");
				usuario.getPersonaBean().setIdPersona(Integer.parseInt(request.getParameter("id")));

				String pass = request.getParameter("password");
				usuario.setVar_clave(Encriptacion.Encriptar(pass));
				usuario.setVar_usuario(request.getParameter("user"));
				usuario.setFec_inicio(request.getParameter("inicio"));
				usuario.setFec_fin(request.getParameter("fin"));
				System.out.println("step 2");
				if (opc.equals("save")) {
					System.out.println("step 1");
					resultado = usuarioService.guardar(usuario);
					System.out.println("step 3");
					rpta.put("id", resultado);
					System.out.println("step 4");
				} else if (opc.equals("edit")) {
					System.out.println("step 1");
					resultado = usuarioService.editar(usuario);
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
