<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html id="extr-page">

<head>
<meta charset="utf-8">
<title>Login - Store</title>
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- #CSS Links -->
<!-- Basic Styles -->
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/font-awesome.min.css">

<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/smartadmin-production-plugins.min.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/smartadmin-production.min.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/smartadmin-skins.min.css">

<!-- SmartAdmin RTL Support -->
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/smartadmin-rtl.min.css">

<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/demo.min.css">

<!-- #FAVICONS -->
<link rel="shortcut icon" href="img/favicon/favicon.ico"
	type="image/x-icon">
<link rel="icon" href="../img/favicon/favicon.ico" type="image/x-icon">

<!-- #GOOGLE FONT -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

<!-- #APP SCREEN / ICONS -->
<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
<link rel="apple-touch-icon"
	href="../img/splash/sptouch-icon-iphone.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="../img/splash/touch-icon-ipad.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="../img/splash/touch-icon-iphone-retina.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="../img/splash/touch-icon-ipad-retina.png">

<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!-- Startup image for web apps -->
<link rel="apple-touch-startup-image"
	href="../img/splash/ipad-landscape.png"
	media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
<link rel="apple-touch-startup-image"
	href="../img/splash/ipad-portrait.png"
	media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
<link rel="apple-touch-startup-image" href="../img/splash/iphone.png"
	media="screen and (max-device-width: 320px)">

</head>
<body onload="aliniciar();" class="animated fadeInDown">

	<header id="header">

		<div id="logo-group">
			<span id="logo"> <img src="../img/logoItSkillConsulting.jpg"
				alt="It Skill Consulting">
			</span>
		</div>
		<div id="logo-group" style="float: right;">
			<span id="logo"> <img src="../img/client/logo.jpg"
				alt="Empresa">
			</span>
		</div>
	</header>
	<div id="main" role="main">
		<div id="content" class="container">
			<div class="row">

				<div
					class="col-xs-12 col-sm-12 col-md-7 col-lg-8 hidden-xs hidden-sm">
					<h1 class="txt-color-red login-header-big">Store System</h1>
					<div class="hero">

						<div class="pull-left login-desc-box-l">
							<h4 class="paragraph-header">La herramienta Store se adapta
								a tu negocio cumpliendo todas tus exigencias!</h4>
							<div class="login-app-icons">

								<a href="http://www.itskillconsulting.com/"
									class="btn btn-danger btn-sm" target="_blank">Pagina
									Oficial</a>
							</div>
						</div>

						<img src="../img/demo/iphoneview.png"
							class="pull-right display-image" alt="" style="width: 210px">

					</div>

					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<h5 class="about-heading">About SmartAdmin - Are you up to
								date?</h5>
							<p>Sed ut perspiciatis unde omnis iste natus error sit
								voluptatem accusantium doloremque laudantium, totam rem aperiam,
								eaque ipsa.</p>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<h5 class="about-heading">Not just your average template!</h5>
							<p>Et harum quidem rerum facilis est et expedita distinctio.
								Nam libero tempore, cum soluta nobis est eligendi voluptatem
								accusantium!</p>
						</div>
					</div>

				</div>

				<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
					<div class="well no-padding">
						<form action="../security/validateUser.htm" id="login-form"
							class="smart-form client-form" method="POST" autocomplete="off"
							role="form">
							<header>
								<label>Fecha : </label> <label id="reloj"> </label>
							</header>
							<fieldset>
								<label class="label"><strong>Usuario :</strong></label>
								<div class="form-group">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa-lg fa-fw"></i> </label></span> <input id="txtUsuario"
											style="padding-left: 2.3%" type="text" name="txtUsuario"
											placeholder="Ingrese Usuario" maxlength="20"
											autocomplete="off"
											onkeypress="return soloLetrasNumeros(event);"
											class="form-control" required="">
									</div>
								</div>

								<br> <label class="label"><strong>Clave :</strong></label>
								<div class="form-group">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg fa-fw"></i> </label></span> <input id="txtClave"
											type="password" name="txtClave" placeholder="Ingrese Clave"
											style="padding-left: 2.3%" maxlength="50" autocomplete="off"
											onkeypress="return soloLetrasNumeros(event);"
											class="form-control" required="">
									</div>
								</div>

								<c:if test="${mensajeLogin != null}">

									<br>
									<div class="alert alert-warning fade in error_message_div">
										<button class="close" data-dismiss="alert">×</button>
										<i class="fa-fw fa fa-warning"></i> <strong>Alerta</strong>
										${mensajeLogin}
									</div>

								</c:if>

								<!-- <div class="note">
									<a href="forgotpassword.html">¿Olvidaste tu clave?</a>

								</div>


								<section>
									<label class="checkbox"> <input type="checkbox"
										name="remember" checked=""> <i></i>Mantener Conectado
									</label>
								</section> -->
							</fieldset>
							<footer>
								<button class="btn btn-primary" type="submit" id="btnIngresar"
									name="btnIngresar">
									<span class="fa fa-arrow-circle-right"></span> Ingresar
								</button>
								<button class="btn btn-danger" type="button" id="btnCancelar"
									name="btnCancelar" onclick="cerrarSesion();">
									<span class="glyphicon glyphicon-remove"></span> Cancelar
								</button>
							</footer>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
	</div>

</body>

<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
<script data-pace-options='{ "restartOnRequestAfter": true }'
	src="../js/plugin/pace/pace.min.js"></script>

<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script>
	if (!window.jQuery) {
		document
				.write('<script src="../js/libs/jquery-2.1.1.min.js"><\/script>');
	}
</script>

<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
<script>
	if (!window.jQuery.ui) {
		document
				.write('<script src="../js/libs/jquery-ui-1.10.3.min.js"><\/script>');
	}
</script>

<!-- IMPORTANT: APP CONFIG -->
<script src="../js/app.config.js"></script>

<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
<script src="../js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script>

<!-- BOOTSTRAP JS -->
<script src="../js/bootstrap/bootstrap.min.js"></script>

<!-- CUSTOM NOTIFICATION -->
<script src="../js/notification/SmartNotification.min.js"></script>

<!-- JARVIS WIDGETS -->
<script src="../js/smartwidgets/jarvis.widget.min.js"></script>

<!-- EASY PIE CHARTS -->
<script src="../js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>

<!-- SPARKLINES -->
<script src="../js/plugin/sparkline/jquery.sparkline.min.js"></script>

<!-- JQUERY VALIDATE -->
<script src="../js/plugin/jquery-validate/jquery.validate.min.js"></script>

<!-- JQUERY MASKED INPUT -->
<script src="../js/plugin/masked-input/jquery.maskedinput.min.js"></script>

<!-- JQUERY SELECT2 INPUT -->
<script src="../js/plugin/select2/select2.min.js"></script>

<!-- JQUERY UI + Bootstrap Slider -->
<script src="../js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

<!-- browser msie issue fix -->
<script src="../js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

<!-- FastClick: For mobile devices -->
<script src="../js/plugin/fastclick/fastclick.min.js"></script>

<!--[if IE 8]>

		<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

		<![endif]-->

<!-- Demo purpose only 
<script src="../js/demo.min.js"></script>-->

<!-- MAIN APP JS FILE -->
<script src="../js/app.min.js"></script>

<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
<!-- Voice command : plugin -->
<script src="../js/speech/voicecommand.min.js"></script>

<!-- SmartChat UI : plugin -->
<script src="../js/smart-chat-ui/smart.chat.ui.min.js"></script>
<script src="../js/smart-chat-ui/smart.chat.manager.min.js"></script>

<!-- PAGE RELATED PLUGIN(S) 
		<script src="..."></script>-->

<script src="../js/plugin/bootstrapvalidator/bootstrapValidator.min.js"></script>
<script type="text/javascript">
	function soloLetrasNumeros(e) {
		var tecla = (document.all) ? e.keyCode : e.which;
		if ((tecla > 47 && tecla < 58) || (tecla >= 97 && tecla <= 122)
				|| (tecla >= 65 && tecla <= 90))
			return true;
		else
			return false;
	}
	function aliniciar() {
		document.getElementById("txtUsuario").focus();
	}
	function antiSqlInjection(txt) {
		//	var txt = elemento.val();
		var txt2 = txt.replace(/^\s*|\s*$/g, "");
		var txt3 = txt2.toUpperCase();
		if (txt3 == "INSERT" || txt3 == "INTO" || txt3 == "SELECT"
				|| txt3 == "WHERE") {
			return false;
		}
		return true;
	}

	$(document).ready(
			function() {
				$("#login-form")[0].reset();
				pageSetUp();
				// movie form
				var $validator = $("#login-form").validate(
						{
							rules : {
								txtUsuario : {
									required : true,
									val_injection : true
								},
								txtClave : {
									required : true,
									val_injection : true
								}
							},
							messages : {
								txtUsuario : {
									required : "Porfavor ingresar usuario."
								},
								txtClave : {
									required : "Porfavor ingresar clave."
								}
							},
							highlight : function(element) {
								$(element).closest('.form-group').removeClass(
										'has-success').addClass('has-error');
							},
							unhighlight : function(element) {
								$(element).closest('.form-group').removeClass(
										'has-error').addClass('has-success');
							},
							errorElement : 'span',
							errorClass : 'help-block',
							errorPlacement : function(error, element) {
								$(".error_message_div").empty();
								if (element.parent('.input-group').length) {
									error.insertAfter(element.parent());

								} else {
									error.insertAfter(element);
								}
							}
						});

				jQuery.validator.addMethod("val_injection", function(value,
						element) {
					return this.optional(element) || antiSqlInjection(value);
				}, "Caracteres no permitidos.");

			});
</script>

<script type="text/JavaScript">
	var f = new Date();
	var mes = "";
	if ((f.getMonth() + 1) < 10)
		mes = "0" + (f.getMonth() + 1);
	else
		mes = (f.getMonth() + 1);
	document.getElementById("reloj").innerHTML = f.getDate() + "/" + mes + "/"
			+ f.getFullYear();
</script>
</html>
