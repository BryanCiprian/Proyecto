package org.itskill.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.CategoriaBean;
import org.itskill.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class CuentaController {

	@Autowired
	private CuentaService cuentaService;

	@RequestMapping(value = "cuenta/executeCrudCuenta.htm", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String ExecuteCrudTipoCambio(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();
		String opc = request.getParameter("opc");
		System.out.println("::Iniciar Controllador Clase");
		System.out.println("::opc : " + opc);
		// CategoriaBean categoria = new CategoriaBean();
		Integer resultado = 0;
		try {
			if (opc.equals("listCuentaByIdGrupo")) {
				Integer id = Integer.parseInt(request.getParameter("id"));
				rpta.put("data", cuentaService.listAllCuentaByGrupo(id));
			} else if (opc.equals("findById")) {
			} else if (opc.equals("delete")) {
			} else if (opc.equals("save") || opc.equals("edit")) {
				/* data en comunn con editar y registrar */
				if (opc.equals("save")) {
				} else if (opc.equals("edit")) {
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
