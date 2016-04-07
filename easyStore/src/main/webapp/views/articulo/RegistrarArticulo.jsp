<%-- 
    Document   : Impresion
    Created on : 05-feb-2016, 12:43:52
    Author     : Maydeline Chanchari Yumbato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<c:url value="/js/jquery.js" />"></script>
<script src="<c:url value="/js/validator.js" />" type="text/javascript"></script>  

</head>
<body>
<div class="container"> 
<!-- div class="col-md-8">	</div -->
<!-- div class="col-sm-6 col-md-12 col-md-offset-4"-->
<div class="col-md-12">
		<div class="panel panel-primary">
			<div class="panel-heading">
					<h5 style="text-align: center;">REGISTRO DE ARTICULO</h5>
		    </div> 
			<div class="panel-body">
<form id="ArticuloForm" method="post" action="../proc/manArt.htm" autocomplete="off" class="form-horizontal" role="form" >
 			<div class="col-md-12">	
 				<div class="col-md-3">
	 				<div class="form-group2">				
						 <input class="form-control2" type="text" id="txtCodigo" name="txtCodigo" maxlength="18" 
			                    placeholder="Ingrese Codigo" autocomplete="off" required data-fv-notempty-message="Codigo es necesario"/>
					</div>
					<div class="form-group2">				
							 <select class="form-control2" id="cboClasif" name="cboClasif" required data-fv-notempty-message="Clasificacion es necesario">
								  <option value="" >Seleccione Clasificacion</option>
								  <c:forEach items="${cmboTipExi}" var="tex">
									   <option value="${tex.id_inv_doc}">${tex.des_doc}</option>
									</c:forEach>
								</select>
					</div>
					<div class="form-group2">				
					 		<select class="form-control2" id="cboUnMed" name="cboUnMed" required data-fv-notempty-message="Unidad Medida es necesario">
							  <option value="0" selected="selected">Seleccione Unid.Medida</option>
							  	<c:forEach items="${cmboUniMed}" var="ume">
									   <option value="${ume.id_inv_doc}">${ume.des_doc}</option>
									</c:forEach>
							</select>
					</div>
 				</div>
 				<div class="col-md-3">
 					 	<div class="form-group2">				
					 		<textarea  class="form-control" rows="4" id="txtDescripcion" name="txtDescripcion" maxlength="120" 
		                    placeholder="Ingrese Descripcion" required data-fv-notempty-message="Descripcion is necesario" ></textarea>
						</div>
 				</div>
 				<div class="col-md-3"> 	
 							<div class="form-group2">				
					 			<textarea  class="form-control" rows="4" id="txtCaracteristica" name="txtCaracteristica" maxlength="120" 
		                    	placeholder="Ingrese Caracteristica"  ></textarea>
							</div>			
 				</div>
				<div class="col-md-3">
								<div class="form-group2">				
							 		<textarea  class="form-control" rows="4" id="txtDiseno" name="txtDiseno" maxlength="120" 
				                    placeholder="Ingrese Diseño" autocomplete="off"></textarea>
								</div>	
						
				</div>
				
		</div>		
		<div class="col-md-12">		
				<div class="col-md-3">
						<div class="form-group2">				
					 			<textarea  class="form-control" rows="4" id="txtModelo" name="txtModelo" maxlength="120" 
		                    	placeholder="Ingrese Modelo"></textarea>
							</div>	
				</div>
				<div class="col-md-3">
							<div class="form-group2">				
							 <select class="form-control2" id="cboMarca" name="cboMarca" required data-fv-notempty-message="Marca es necesario">
								  <option value="" selected="selected">Seleccione Marca</option>
									<c:forEach items="${cmboMarca}" var="mar">
									   <option value="${mar.idMarca}">${mar.nomMarca}</option>
									</c:forEach>
								</select>
							</div>
						<div class="form-group2">				
							 	<select class="form-control2" id="cboClase" name="cboClase" required data-fv-notempty-message="Clase es necesario">
								  <option value="" selected="selected">Seleccione Clase</option>
								 <c:forEach items="${cmboClase}" var="cla">
									   <option value="${cla.idClase}">${cla.desClase}</option>
									</c:forEach>
								</select>
						</div>
						
						<div class="form-group2" >				
							 	<select   class="form-control2" id="cboGrupo" name="cboGrupo">
								  <option value="" >Seleccione Grupo</option>
								  <c:forEach items="${cmboGrupo}" var="gpo">
									   <option value="${gpo.idGrupo}">${gpo.desGrupo}</option>
								  </c:forEach>
								</select>
								
								<c:if test="${fn:length(cmboGrupo) == 0}"><p>l  vacio</p></c:if>
								<p>${fn:length(cmboGrupo)}</p>
						</div>
				<span id="descripcion"></span>
					<select   id="test" name="test">
								  <option value="" >Seleccione test</option>
								  <c:forEach items="${cmboGrupo}" var="gpo">
									   <option value="${gpo.idGrupo}">${gpo.desGrupo}</option>
								  </c:forEach>
					</select>
				
				</div>
					
				<div class="col-md-3">
						<div class="form-group2">				
							 	<select class="form-control2" id="cboProced" name="cboProced" required data-fv-notempty-message="Procedencia es necesario">
								  <option value="">Seleccione Procedencia</option>
								  <c:forEach items="${cmboProced}" var="pro">
									   <option value="${pro.idProcedencia}">${pro.desProcedencia}</option>
									</c:forEach>
								</select>
						</div>
						<div class="form-group2">				
							 	<select class="form-control2" id="cboCta" name="cboCta">
								  <option value="0">Seleccione Cuenta</option>
								 <c:forEach items="${cmboCuent}" var="cta">
									   <option value="${cta.idCuenta}">${cta.desCuenta}</option>
									</c:forEach>
								</select>
						</div>
						<div class="form-group2">				
							 	<select class="form-control2" id="cboSubCta" name="cboSubCta">
								  <option value="0">Seleccione Sub Cuenta</option>
								  <c:forEach items="${cmboSCnta}" var="sct">
									   <option value="${sct.idSubCuenta}">${sct.desSubCuenta}</option>
									</c:forEach>
								</select>
						</div> 						
				</div>
				
				<div class="col-md-3">
							<div class="form-group2">				
							 <input class="form-control2" id="txtStkMin" name="txtStkMin" maxlength="10" type="text"	placeholder="Ingrese Stock Minimo" onkeypress="validarNumeros();" required data-fv-notempty-message="Stk Minimo es necesario">    
							</div>
							<div class="form-group2">				
							 <input class="form-control2" id="txtStkMax" name="txtStkMax" maxlength="10" type="text"	placeholder="Ingrese Stock Maximo" onkeypress="validarNumeros();">    
							</div>
							<div class="form-group2">				
							 <input class="form-control2" id="txtFoto" name="txtFoto" type="file"	placeholder="Subir foto Articulo" >    
							</div>
				</div>

				
		</div>
				<hr>
				<DIV style="text-align: center;">		
					<button class="btn btn-success" type="button" id="btnCancelar" name="btnCancelar" onclick="cerrarSesion();"><span class="glyphicon glyphicon-remove"></span> Cancelar</button>
					<button class="btn btn-primary" type="submit" id="btnEnviar" name="btnIngresar"><span class="glyphicon glyphicon-ok"></span> Ingresar</button>
				<p><br> </p>
				</DIV>	

</form>
 			</div>
			</div>
</div>
</div>  
 
</body>
</html>
