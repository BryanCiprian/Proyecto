
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="widget-body no-padding">
						
						<form id="checkout-form" class="smart-form" novalidate="novalidate">

							<fieldset>
								<div class="row">
									<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
											<input class="form-control txtNomMarca" id="txtNomMarca" onkeypress="return soloLetras(event)"
								            name="txtNomMarca"  type="text"
								          placeholder="Ingrese Nombre Marca" required
								         data-fv-notempty-message="Marca es necesario">
										</label>
									</section>
									
								</div>
                                  <input
								type="hidden" name="idMarca" class="idMarca" />
								
							</fieldset>

						

							<footer>
							    <button class="btn btn-success" type="button" id="btnCancelar"
				                name="btnCancelar" onclick="formReset()" value="Reset">
			                 	<span class="glyphicon glyphicon-remove"></span> Limpiar
			                    </button>
								
								<button class="btn btn-primary btnSubmit" value="Registrar"
			                  	type="button" id="btnEnviar" name="btnIngresar">
		                  		<span class="glyphicon glyphicon-ok"></span> Ingresar
			                  </button>
							</footer>
						</form>

					</div>
					<!-- end widget content -->
					
			
<!--

<div class="container">
	<div class="col-md-6">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h5 style="text-align: center;">REGISTRO DE MARCA</h5>
			</div>
			<form class="form-config">
				<div class="panel-body">
					<div>
						<div class="form-group2">
							<input class="form-control txtNomMarca" id="txtNomMarca"
								name="txtNomMarca" maxlength="30" type="text"
								placeholder="Ingrese Nombre Marca" required
								data-fv-notempty-message="Marca es necesario"> <input
								type="hidden" name="idMarca" class="idMarca" />
						</div>

					</div>
			</form>
		</div>
		<DIV style="text-align: center;">
			<button class="btn btn-success" type="button" id="btnCancelar"
				name="btnCancelar" onclick="cerrarSesion();">
				<span class="glyphicon glyphicon-remove"></span> Cancelar
			</button>
			<button class="btn btn-primary btnSubmit" value="Registrar"
				type="button" id="btnEnviar" name="btnIngresar">
				<span class="glyphicon glyphicon-ok"></span> Ingresar
			</button>


			<p>
				<br>
			</p>
		</DIV>
	</div>-->
	<div class="table-responsive">
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>Item</th>
					<th>Nombre</th>
					<th>Eliminar</th>
					<th>Editar</th>
					
				
				</tr>
			</thead>
			<tbody class="tbodyMarca">
				<c:forEach var="marca" items="${listaMarca}">
					<tr>
						<td>${marca.idMarca}</td>
						<td>${marca.nomMarca}</td>
						<td><a
							href="../admin/delmarca.htm?descMarca=${marca.nomMarca}"
							id="idEliminar"><img width="25px" height="25px"
								src="<c:url value="/imagenes/botones/delete.jpg" />"></a></td>
						<td><a
							href="../admin/pupdmarca.htm?descMarca=${marca.nomMarca}&&idMarca=${marca.idMarca}"
							id="idActualizar"><img width="25px" height="25px"
								src="<c:url value="/imagenes/botones/delete.jpg" />"></a></td>
						<td>
							<button class="btnEliminar" value="${marca.nomMarca}">Eliminar</button>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>



<script type="text/javascript">
	pageSetUp();
	var pagefunction = function() {
		function listarMarca() {
			var tbody = $(".tbodyMarca");
			tbody.empty();
			var text_html = "";
			$
					.ajax({
						url : "../admin/listMarca.htm",
						data : "",
						type : "post",
						success : function(objJson) {

							var json = JSON.parse(objJson);
							var lista = json.lista;
							if (objJson.rpta === "-1") {
								alert("error");
							} else {
								for (var i = 0; i < lista.length; i++) {
									text_html += "<tr>";
									text_html += "<td>" + lista[i].idMarca
											+ "</td>";
									text_html += "<td>" + lista[i].nomMarca
											+ "</td>";
									text_html += "<td><button type='button' class='btnEliminar' value='"+lista[i].nomMarca+"'>Eliminar</button></td><td><button type='button' value='"+lista[i].idMarca+"' class='btnEditar'>Editar</button></td>";
									text_html += "</tr>";
								}

								tbody.append(text_html);
							}

							$(".btnEliminar")
									.click(
											function() {
												$
														.ajax({
															url : "../admin/delmarca.htm",
															type : "POST",
															data : "descMarca="
																	+ $(this)
																			.val(),
															success : function(
																	data) {
																//validas si se elimnino con el status
																listarMarca();

																$
																		.smallBox({
																			title : "Notificacion",
																			content : "<i class='fa fa-clock-o'></i> <i>Se ha eliminado correctamente...</i>",
																			color : "#296191",
																			iconSmall : "fa fa-thumbs-up bounce animated",
																			timeout : 4000
																		});

															}
														});

											});
							$(".btnEditar")
									.click(
											function() {
												$
														.ajax({
															url : "../admin/pupdmarca.htm",
															type : "POST",
															data : "idMarca="
																	+ $(this)
																			.val(),
															success : function(
																	data) {
																data = JSON
																		.parse(data);
																$(
																		".txtNomMarca")
																		.val(
																				data.marca["nomMarca"]);
																$(".idMarca")
																		.val(
																				data.marca["idMarca"]);
																//validas si se elimnino con el status
																//$(".btnSubmit").text("Modificar");
																$(".btnSubmit")
																		.empty();
																$(".btnSubmit")
																		.append(
																				"<span class='glyphicon glyphicon-edit'></span> Modificar");
																$(".btnSubmit")
																		.val(
																				"Modificar");
															}
														});

											});

						}

					});

		}

		listarMarca();
		$(".btnSubmit")
				.click(
						function() {
							if ($(".smart-form").valid()) {
								if ($(this).val() === "Registrar") {

									$
											.ajax({
												url : "../admin/regmarca.htm",
												type : "POST",
												data : $(".smart-form")
														.serialize(),
												success : function(data) {
													data = JSON.parse(data);
												//	alert(data.rpta)
													if (data.rpta === "-1") {
														$(".smart-form")[0].reset();
														
														$.smallBox({
															title : "Notificacion",
															content : "<i class='fa fa-clock-o'></i> <i>Marca ya registrada ...</i>",
															color : "#F80011",
															iconSmall : "fa fa-thumbs-down bounce animated",
															timeout : 4000
														});
													} else {
														//alert(data.mensaje)
														listarMarca();
														$(".smart-form")[0].reset();
														$
																.smallBox({
																	title : "Notificacion",
																	content : "<i class='fa fa-clock-o'></i> <i>Se ha registrado correctamente ...</i>",
																	color : "#296191",
																	iconSmall : "fa fa-thumbs-up bounce animated",
																	timeout : 4000
																});

													}

												}
											});
								} else {
									$
											.ajax({
												url : "../admin/updmarca.htm",
												type : "POST",
												data : $(".smart-form")
														.serialize(),
												success : function(data) {
													data = JSON.parse(data);
													if (data.rpta === "-1") {
														$(".smart-form")[0].reset();
														$.smallBox({
															title : "Notificacion",
															content : "<i class='fa fa-clock-o'></i> <i>Marca ya registrada ...</i>",
															color : "#F80011",
															iconSmall : "fa fa-thumbs-down bounce animated",
															timeout : 4000
														});
													} else {
														//alert(data.mensaje)
														$(".btnSubmit").empty();
														$(".btnSubmit")
																.append(
																		"<span class='glyphicon glyphicon-ok'></span> Registrar");
														$(".btnSubmit").val(
																"Registrar");
														 $(".smart-form")[0].reset();
														listarMarca();
														$(".smart-form")[0].reset();
														$
																.smallBox({
																	title : "Notificacion",
																	content : "<i class='fa fa-clock-o'></i> <i>Se ha editado correctamente ...</i>",
																	color : "#296191",
																	iconSmall : "fa fa-thumbs-up bounce animated",
																	timeout : 4000
																});

													}

												}
											});
								}
							}
						});

	};
	
var $checkoutForm = $('#checkout-form').validate({
		
		// Rules for form validation
			rules : {
				txtNomMarca : {
					 
					required : true , 
					validateNullOrWhiteSpace : true,
					sqlWords: true , 
					maxlength : 30
				}
			},
	
			// Messages for form validation
			messages : {
				txtNomMarca : {
					required : 'Ingrese el nombre de la marca ',
					maxlength :'No debe exceder los 30 caracteres'
				}
			},
	
			// Do not change code below
			errorPlacement : function(error, element) {
				error.insertAfter(element.parent());
			}
		});
		
function isNullOrWhitespace(input) {
    if (typeof input === 'undefined' || input == null) 
        return true;
    return input.replace(/\s/g, '').length < 1;
}
 jQuery.validator.addMethod("validateNullOrWhiteSpace", function (value, element) {        
	    return !isNullOrWhitespace(value);
	 }, "Espacios en blanco no permitidos");
 function formReset(){
 $(".smart-form")[0].reset();
 }
 function isSql(input) {
	    if (typeof input == 'select' || input == 'insert'|| input == 'update' || input == 'delete'|| input == 'select *') 
	        return true;
	    return input.replace(/\s/g, '').length < 1;
	}
	 jQuery.validator.addMethod("sqlWords", function (value, element) {        
		    return !isSql(value);
		 }, "Cadenas no permitidas");
	 
	 
	 function soloLetras(e){
	       key = e.keyCode || e.which;
	       tecla = String.fromCharCode(key).toLowerCase();
	       letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
	       especiales = "8-37-39-46";

	       tecla_especial = false
	       for(var i in especiales){
	            if(key == especiales[i]){
	                tecla_especial = true;
	                break;
	            }
	        }

	        if(letras.indexOf(tecla)==-1 && !tecla_especial){
	            return false;
	        }
	    }
	pagefunction();
</script>
