<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<title>Tipo de Cambio - Store</title>
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



<body onload="aliniciar();">
	<div id="main" role="main" style="margin: 0px;">
		<div id="content" class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4"
					style="float: none; margin: 0 auto;">
					<div class="well no-padding slideInRight fast animated">
						<form action="../tc/tipoCambio.htm" method="post" id="login-form"
							onsubmit="return validarCampoTC();" autocomplete="off"
							class="smart-form client-form" role="form">
							<header class="titulo_req">
							<div class="spacing">
								<center>
									<h1 class="spacing" style="font-weight: bold; margin: 0px;">
										Valor Tipo de Cambio</h1>
								</center>
							</div>
							</header>
							<fieldset>
								<label id="reloj"></label> <br> <br>
								<div class="row" style="margin: 2px;">

									<c:if test="${canTC==0}">
										<section> <label class="input"> <i
											class="icon-prepend glyphicon glyphicon-usd"></i> <input
											type="text" id="txtTipoCambio" name="compra"
											maxlength="4" placeholder="Compra Tipo de cambio"
											onkeypress="validarNumeros();">
										</label> </section>
										<section> <label class="input"> <i
											class="icon-prepend glyphicon glyphicon-usd"></i> <input
											type="text" id="txtTipoCambio" name="venta"
											maxlength="4" placeholder="Venta Tipo de cambio"
											onkeypress="validarNumeros();">
										</label> </section>
									</c:if>
									<c:if test="${canTC>0}">
										<section> <label class="input"> <i
											class="icon-prepend glyphicon glyphicon-usd"></i> <input
											type="text" id="txtTipoCambio" name="txtTipoCambio"
											maxlength="4" placeholder="Ingrese Tipo de cambio"
											onkeypress="validarNumeros();" disabled="disabled"
											readonly="readonly" value="${valTC}">
										</label> </section>
									</c:if>
									<div>
										<div id="div_mensaje_error"
											style="color: #F80909; text-align: center;"></div>
									</div>
								</div>
							</fieldset>
							<footer>
							<button class="btn btn-danger" type="button" id="btnCancelar"
								name="btnCancelar" onclick="cerrarSesion();">
								<span class="btn-label"><i
									class="glyphicon glyphicon-remove"></i></span>Cancelar
							</button>
							<button class="btn btn-primary" type="submit" id="btnEnviar"
								name="btnIngresar">
								<span class="btn-label"><i class="glyphicon glyphicon-ok"></i></span>
								Ingresar
							</button>
							</footer>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>

</body>
<script type="text/JavaScript">
	var f = new Date();
	var mes = "";
	if ((f.getMonth() + 1) < 10)
		mes = "0" + (f.getMonth() + 1);
	else
		mes = (f.getMonth() + 1);
	document.getElementById("reloj").innerHTML = "Tipo de Cambio a la fecha: "
			+ f.getDate() + "/" + mes + "/" + f.getFullYear();
</script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<script type="text/javascript">
	function aliniciar() {
		document.getElementById("txtTipoCambio").focus();
	}
	function validarCampoTC() {
		var tc = document.getElementById("txtTipoCambio").value;
		document.getElementById("div_mensaje_error").innerHTML = "";
		if (tc.length == 0) {
			document.getElementById("div_mensaje_error").innerHTML = "Ingrese Tipo de Cambio";
			document.getElementById("txtTipoCambio").focus();
			return false;
		}
		if (tc.length < 4
				&& document.getElementById("txtTipoCambio").value.length >= 1) {
			document.getElementById("div_mensaje_error").innerHTML = "Tipo de cambio no Valido";
			document.getElementById("txtTipoCambio").focus();
			return false;
		}
		return true;
	}
	function validarNumeros() {
		if ((event.keyCode < 46) || (event.keyCode > 57))
			event.returnValue = false;
	}
	function cerrarSesion() {
		location.href = "../seguridad/cerrarSesion.htm";
	}
</script>
</html>