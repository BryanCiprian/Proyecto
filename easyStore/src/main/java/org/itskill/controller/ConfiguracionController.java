package org.itskill.controller;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.itskill.bean.ConfiguracionBean;
import org.itskill.services.ConfiguracionService;
import org.itskill.util.Renombrar;
import org.itskill.util.defaultList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class ConfiguracionController {

	@Autowired
	private ConfiguracionService configService;
	private Map<String, Object> rpta = new HashMap<String, Object>();
	Gson gson = new Gson();

	@RequestMapping(value = "main/config.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView accesConfigMain(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		rpta.clear();

		ModelAndView modelAndView = new ModelAndView("configMain", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "mainConfig/getCofiguration.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String getCofiguration(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		rpta.clear();
		Gson gson = new Gson();
		rpta.put("showConfiguracion", configService.showConfiguration());
		return gson.toJson(rpta);
	}

	@RequestMapping(value = "mainConfig/showListFormConfiguracion.htm", method = { RequestMethod.GET,
			RequestMethod.POST })
	public @ResponseBody String showListFormConfiguracion(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		rpta.clear();
		defaultList listas = new defaultList();

		rpta.put("lista", listas.tipoNavegacion());
		return gson.toJson(rpta);
	}

	@RequestMapping(value = "mainConfig/showTipoDiseno.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String showTipoDiseno(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		rpta.clear();
		defaultList listas = new defaultList();

		rpta.put("lista", listas.tipoDiseno());
		return gson.toJson(rpta);
	}

	@RequestMapping(value = "mainConfig/saveImageLogo.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String saveImageLogo(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		rpta.clear();
		// String ubicacion = "/Archivos/";
		String ubicacion = "E:/EclipseProjects/GitVersion/SysStore/easyStore/src/main/webapp/Archivo/imageLogo/";
		DiskFileItemFactory f = new DiskFileItemFactory();
		f.setSizeThreshold(1024);
		f.setRepository(new File(ubicacion));
		ServletFileUpload upload = new ServletFileUpload(f);
		try {
			List<FileItem> p = upload.parseRequest(request);
			String id = null;
			String nombre_archivo = null;
			String no_original = null;
			long sizeInBytes = 0;
			Iterator it = p.iterator();
			while (it.hasNext()) {
				FileItem item = (FileItem) it.next();
				if (item.isFormField()) {
					String nombre = item.getFieldName();
					String valor = item.getString();
					if (nombre.equals("id") & id == null) {
						id = valor;
					}

				} else {
					String fieldName = item.getFieldName();
					sizeInBytes = item.getSize();
					// Calendar fecha = new GregorianCalendar();
					// int hora = fecha.get(Calendar.HOUR_OF_DAY);
					// int min = fecha.get(Calendar.MINUTE);
					// int sec = fecha.get(Calendar.SECOND);
					if (fieldName.equals("archivo")) {
						/*
						 * nombre_archivo = String.valueOf(hora) +
						 * String.valueOf(min) + String.valueOf(sec) + "_" + id
						 * + "_" + item.getName().toUpperCase();
						 */

						nombre_archivo = "imgLogo.png";
						no_original = item.getName();
						Thread thread = new Thread(new Renombrar(item, ubicacion, nombre_archivo));
						thread.start();
					} else {
						no_original = no_original;
						nombre_archivo = nombre_archivo;
					}
				}
			}
			// Insertar
			rpta.put("status", true);

		} catch (Exception e) {
			// TODO: handle exception
			rpta.put("status", false);
		}

		return gson.toJson(rpta);
	}

	@RequestMapping(value = "mainConfig/crud.htm", method = { RequestMethod.GET,
			RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String resultado(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		rpta.clear();
		ConfiguracionBean c = new ConfiguracionBean();
		Integer id = 0;
		String opc = request.getParameter("opc");
		try {

			c.setNom_empresa(request.getParameter("textNombre"));
			c.setRuc_empresa(request.getParameter("textRuc"));
			c.setDir_empresa(request.getParameter("txtDirEmpresa"));
			c.setDoc_emision(request.getParameter("inputDocEmision"));
			c.setAct_economica(request.getParameter("selectActEcono"));
			c.setUrl_logo_empresa(request.getParameter("imgLogo"));
			c.setCod_act_economica(request.getParameter("textCodActEcon"));
			String valor1 = "0";
			if (request.getParameter("cbkSoles") != null) {
				valor1 = "1";
			} else {
				valor1 = "2";
			}

			String valor2 = "0";
			if (request.getParameter("cbkDolar") != null) {
				valor2 = "1";
			} else {
				valor2 = "2";
			}

			c.setMon_sol(valor1);
			c.setMon_dolar(valor2);
			String valorBiMoneda = (valor1.equals("1") && valor2.equals("1")) ? "1" : "2";
			c.setFlag_bimoneda(valorBiMoneda);

			c.setTipo_navegacion(request.getParameter("selectTipoNav"));
			c.setTipo_diseno(request.getParameter("selectDiseno"));
			c.setColor_base(request.getParameter("selectColorBase"));
			c.setColor_alterno(request.getParameter("selectColorAlt"));
			c.setPos_header(request.getParameter("selectPosHeader"));
			c.setPos_menu(request.getParameter("selectPosNav"));
			c.setPos_footer(request.getParameter("selectPosFooter"));
			c.setId_tipo_impresora(Integer.parseInt(request.getParameter("selectTipoImpr")));
			c.setIdioma(Integer.parseInt(request.getParameter("selectTipoIdioma")));
			c.setComando_voz(Integer.parseInt(request.getParameter("selectCommandoVoz")));
			c.setUsu_crea((String) request.getSession().getAttribute("usuario"));
			if (opc.equals("Registrar")) {
				id = configService.save(c);
			} else {
				c.setId_config(Integer.parseInt(request.getParameter("id")));
				id = configService.editConfiguracion(c);
			}

		} catch (Exception e) {
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
			rpta.put("error", e.getStackTrace());
			rpta.put("message", e.getMessage());

		}
		rpta.put("status", true);
		rpta.put("id", id);
		return gson.toJson(rpta);

	}

}
