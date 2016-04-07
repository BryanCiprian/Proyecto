package org.itskill.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itskill.bean.CategoriaBean;
import org.itskill.bean.InventarioDocumentoBean;
import org.itskill.services.InventarioDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class DocumentoInventarioController {

	@Autowired
	private InventarioDocumentoService inventarioService;

	@RequestMapping(value = "documentoInventario/executeCrudDocInvent.htm", method = { RequestMethod.GET,
			RequestMethod.POST })
	@ResponseBody
	public String ExecuteCrudTipoCambio(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();
		String opc = request.getParameter("opc");
		System.out.println("Controllador Categoria");
		System.out.println("opc : " + opc);
		InventarioDocumentoBean inventarioDoc = new InventarioDocumentoBean();
		Integer resultado = 0;
		try {
			if (opc.equals("listUnidadMedida")) {
				rpta.put("data", inventarioService.listarUnidadMedida());
			}
			if (opc.equals("listExistencia")) {
				rpta.put("data", inventarioService.listarTipoExistencia());
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
