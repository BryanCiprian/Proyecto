package org.itskill.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.itskill.bean.ArticuloBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.services.ArticuloService;
import org.itskill.util.Renombrar;
import org.itskill.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import java.util.Map;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Controller
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;

	@RequestMapping(value = "admin/artic.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView inicioPageArticulo(ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("Entro a inicio Pagina inicioPageArticulo ");
		UsuarioBean usuarioBean = new UsuarioBean();

		request.getSession().setAttribute("usuarioBean", usuarioBean);
		ModelAndView modelAndView = new ModelAndView("crudArticulo", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "articulo/regArt.htm", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String guardarArticulo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Entro a registrar Articulo ");
		ArticuloBean articulo = new ArticuloBean();
		UsuarioBean usuarioBean = new UsuarioBean();
		HttpSession sesion = request.getSession(true);
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();
		String opc = "";
		try {
			opc = request.getParameter("opc");

			if (opc.equals("save")) {
				Integer categoria = Integer.parseInt(request.getParameter("categoria"));
				System.out.println("categoria: " + categoria);
				articulo.getCategoriaBean().setId_categoria((categoria));
				// System.out.println("categoria: " + articulo.getCodArt());

				Integer existencia = Integer.parseInt(request.getParameter("existencia"));
				System.out.println("existencia: " + existencia);
				articulo.getId_tipo_existencia().setId_doc_inventario((existencia));
				// System.out.println("existencia: " + articulo.getCodArt());

				String codigo = request.getParameter("codigoArticulo");
				System.out.println("CODIGO: " + codigo);
				articulo.setCodArt(codigo);
				System.out.println("CODIGO: " + articulo.getCodArt());

				String uniMedida = request.getParameter("unidadMedida");
				System.out.println("UNIDAD MEDIDA: " + uniMedida);
				articulo.getId_unidad_medida().setId_doc_inventario((Integer.parseInt(uniMedida)));

				String descripcion = request.getParameter("nombreArticulo");
				System.out.println("DESCRIPCION: " + descripcion);
				articulo.setDesArt(descripcion);
				System.out.println("DESCRIPCION: " + articulo.getDesArt());

				String caracteristica = request.getParameter("descripcion");
				System.out.println("DESCRIPCION: " + caracteristica);
				articulo.setCarArt(Util.validarString(caracteristica));
				System.out.println("CARACTERISTICAS: " + articulo.getCarArt());

				String dise = request.getParameter("diseno");
				System.out.println("DISEÑO: " + dise);
				articulo.setDisArt(Util.validarString(dise));
				System.out.println("DISEÑO: " + articulo.getDisArt());

				String modelo = request.getParameter("modelo");
				System.out.println("MODELO: " + modelo);
				articulo.setModArt(Util.validarString(modelo));
				System.out.println("MODELO: " + articulo.getModArt());

				String marca = request.getParameter("marca");
				System.out.println("MARCA: " + marca);
				articulo.getMarcaBean().setIdMarca(Util.validarEntero(Integer.parseInt(marca)));
				// System.out.println("MARCA: " +
				// articulo.getMarcaBean().getId_marca());

				String clase = request.getParameter("clase");
				System.out.println("CLASE: " + clase);

				articulo.getClaseBean().setId_clase(Util.validarEntero(Integer.parseInt(clase)));
				System.out.println("CLASE: " + articulo.getClaseBean().getId_clase());

				String grupo = request.getParameter("grupo");
				System.out.println("GRUPO: " + grupo);
				articulo.getGrupoBean().setId_grupo(Util.validarEntero(Integer.parseInt(grupo)));
				System.out.println("GRUPO: " + articulo.getGrupoBean().getId_grupo());

				String procedencia = request.getParameter("procedencia");
				System.out.println("PROCEDENCIA: " + procedencia);
				articulo.getProcedenciaBean().setId_proc(Util.validarEntero(Integer.parseInt(procedencia)));
				System.out.println("PROCEDENCIA: " + articulo.getProcedenciaBean().getId_proc());

				String cuenta = request.getParameter("cuenta");
				System.out.println("CUENTA: " + cuenta);
				articulo.getCtaBean().setId_cuenta(Util.validarEntero(Integer.parseInt(cuenta)));
				System.out.println("CUENTA: " + articulo.getCtaBean().getId_cuenta());

				String subCta = request.getParameter("subCuenta");
				System.out.println("SUB CUENTA: " + subCta);

				articulo.getSubCtaBean().setId_sub_cuenta(Util.validarEntero(Integer.parseInt(subCta)));
				System.out.println("SUB CUENTA: " + articulo.getSubCtaBean().getId_sub_cuenta());

				String stkMinimo = request.getParameter("stockMin");
				System.out.println("STOCK MINIMO: " + stkMinimo);
				articulo.setStkMinArt(Util.validarDouble(Double.parseDouble(stkMinimo)));
				System.out.println("STOCK MINIMO: " + articulo.getStkMinArt());

				String stkMaxim = request.getParameter("stockMax");
				System.out.println("STOCK MAXIMO: " + stkMaxim);
				articulo.setStkMaxArt(Util.validarDouble(Double.parseDouble(stkMaxim)));
				System.out.println("STOCK MAXIMO: " + articulo.getStkMaxArt());

				String foto = request.getParameter("txtFoto");
				System.out.println("URL FOTO: " + foto);
				/*
				 * articulo.setUrlFotoArt(Util.validarString(foto));
				 * System.out.println("URL FOTO: " + articulo.getUrlFotoArt());
				 */
				System.out.println("USUARIO: " + (String) sesion.getAttribute("usuario"));
				articulo.getUsu_crea().setVar_usuario((String) sesion.getAttribute("usuario"));
				System.out.println("USUARIO: " + articulo.getUsu_crea().getVar_usuario());

				Integer resArticulo = articuloService.save(articulo);
				System.out.println("Articulo registrado: " + resArticulo);

				rpta.put("id", resArticulo);
			} else if (opc.equals("listarProcedencia")) {
				rpta.put("data", articuloService.listarProcedencia());
			} else if (opc.equals("list")) {
				rpta.put("data", articuloService.listarArticulo());
			} else if (opc.equals("delete")) {
				Integer id = Integer.parseInt(request.getParameter("id"));
				articulo.setIdArticulo(id);
				articulo.getUsu_eli().setVar_usuario((String) sesion.getAttribute("usuario"));
				articuloService.deleteArticulo(articulo);
			} else if (opc.equals("")) {

			}

			rpta.put("status", true);
		} catch (Exception e) {
			rpta.put("status", false);
			System.out.println("1ER - ERROR " + e.getStackTrace());
			System.out.println("2DO - ERROR " + e.getMessage());
		}
		request.getSession().setAttribute("usuarioBean", usuarioBean);
		return gson.toJson(rpta);
	}

	@RequestMapping(value = "articulo/saveImageArticulo.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String saveImageLogo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("::Iniciar SaveImage" );
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Map<String, Object> rpta = new HashMap<String, Object>();
		
		String ubicacion = "C:/proy-easyStore-2016/filesEasyStore/imageArticulo/";
		DiskFileItemFactory f = new DiskFileItemFactory();
		f.setSizeThreshold(1024);
		f.setRepository(new File(ubicacion));
		ServletFileUpload upload = new ServletFileUpload(f);
		try {
			List<FileItem> p = upload.parseRequest(request);
			String id = null;
			String nombre_archivo = null;
			String no_original = null;
			String concatDataFile = null;
			// long sizeInBytes = 0;
			Iterator it = p.iterator();
			while (it.hasNext()) {
				FileItem item = (FileItem) it.next();
				if (item.isFormField()) {
					String nombre = item.getFieldName();
					String valor = item.getString();
					if (nombre.equals("id") & id == null) {
						id = valor;
					}
					if (nombre.equals("concatDataFile") & concatDataFile == null) {
						concatDataFile = valor;
					}
				} else {
					String fieldName = item.getFieldName();
					// sizeInBytes = item.getSize();
					if (fieldName.equals("archivo")) {
						nombre_archivo = concatDataFile + item.getName();
						no_original = item.getName();
						Thread thread = new Thread(new Renombrar(item, ubicacion, nombre_archivo));
						thread.start();
					} else {
						no_original = no_original;
						nombre_archivo = nombre_archivo;
					}
				}
			}
			// make a insert or update

			rpta.put("status", true);

		} catch (Exception e) {
			// TODO: handle exception
			rpta.put("status", false);
		}
		System.out.println("::Fin SaveImage" );
		return gson.toJson(rpta);
		
	}

}
