package org.itskill.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itskill.bean.ConfiguracionBean;
import org.itskill.bean.MenuBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.bean.VistaBean;
import org.itskill.encriptacion.Encriptacion;
import org.itskill.services.ConfiguracionService;
import org.itskill.services.MenuService;
import org.itskill.services.TipoCambioService;
import org.itskill.services.UsuarioService;
import org.itskill.services.VistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private VistaService vistaService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private ConfiguracionService configService;

	@Autowired
	private TipoCambioService tcService;

	@RequestMapping(value = "seguridad/cerrarSesion.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView cerrarSesion(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();
		ModelAndView modelAndView = new ModelAndView("loginInicio", modelMap);
		return modelAndView;
	}

	@RequestMapping(value = "security/validateUser.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView validarUsuario(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model;
		String var_usu_usuario = request.getParameter("txtUsuario");
		String var_usu_clave = request.getParameter("txtClave");
		HttpSession SessionIntentos = request.getSession();
		List<VistaBean> vistas;
		List<MenuBean> vistasHijo;
		List<MenuBean> vistasMenu = new ArrayList<MenuBean>();
		String pag_sal = "";
		UsuarioBean usuarioBean;

		try {
			System.out.println("Validando nombre de usuario... ");
			usuarioBean = usuarioService.findUsuarioByName(var_usu_usuario.trim());
			if (usuarioBean == null) {
				System.out.println("usuario no existe - redireccionar... ");
				pag_sal = "loginInicio";
				modelMap.addAttribute("mensajeLogin", "Usuario no existe.");
				model = new ModelAndView(pag_sal, modelMap);
				return model;
			} else {
				System.out.println("Validacion OK :" + usuarioBean.getVar_usuario());
				Boolean VerificatePass = Encriptacion.Encriptar(var_usu_clave).equals(usuarioBean.getVar_clave());
				System.out.println("Encriptacion de clave :" + Encriptacion.Encriptar(var_usu_clave));
				if (!VerificatePass) {
					pag_sal = "loginInicio";
					modelMap.addAttribute("mensajeLogin", "Clave incorrecta.");
				} else {
					// Add Atributes
					request.getSession().setAttribute("usuarioBean", usuarioBean);
					HttpSession sesion = request.getSession(true);
					ConfiguracionBean config = new ConfiguracionBean();

					config = configService.showConfiguration();

					if (config == null) {
						pag_sal = "mainStore";

					} else {
						sesion.setAttribute("configuracion", config);
						if (config.getFlag_bimoneda().trim().equals("1")) {
							pag_sal = "opcionTipoCambio";

							Integer canTC = tcService.verificarTC();
							System.out.println("Tipo de cambio :" + canTC);
							if (canTC > 0) {
								Double valTC = tcService.obtenerTC();
								String longitudTC = String.valueOf(valTC);
								String cero = "";
								if (longitudTC.length() == 3) {
									cero = "0";
								}
								sesion.setAttribute("valTC", valTC + cero);
							}
							sesion.setAttribute("canTC", canTC);

						} else {

							pag_sal = "mainStore";
						}
					}

					// Get Options of menu
					vistas = vistaService.getVistasXRol(1);
					for (VistaBean s : vistas) {
						vistasHijo = menuService.getVistasXRolXPadre(1, s.getId_vista());
						if (!vistasHijo.isEmpty()) {
							for (MenuBean m : vistasHijo) {
								vistasMenu.add(m);
							}
						}
					}
					sesion.setAttribute("vistas", vistas);
					sesion.setAttribute("vistasMenu", vistasMenu);

					sesion.setAttribute("usuario", usuarioBean.getVar_usuario());
					sesion.setAttribute("nombres", usuarioBean.getNombres());

					modelMap.addAttribute("vistas", vistas);
					modelMap.addAttribute("vistasMenu", vistasMenu);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			pag_sal = "loginInicio";
			modelMap.addAttribute("mensajeLogin", "Hubo un problema en el Sistema, intentelo nuevamente.");
		}

		model = new ModelAndView(pag_sal, modelMap);
		return model;
	}

	@RequestMapping(value = "login/access.htm", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView accesToLogin(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("loginInicio", modelMap);
		return modelAndView;
	}

}
