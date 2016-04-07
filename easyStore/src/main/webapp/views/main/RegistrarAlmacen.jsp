<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="widget-body no-padding">
						
						<form id="checkout-form" class="smart-form" novalidate="novalidate">

							<fieldset>
								<div class="row">
									<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
											<input class="form-control txtNomAlmacen" id="txtNomAlmacen" onkeypress="return soloLetras(event)"
								            name="txtNomAlmacen"  type="text"
								          placeholder="Ingrese Nombre del Almacen" >
										</label>
									</section>
									
									<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
											<input class="form-control txtDirAlmacen" id="txtDirAlmacen"
								            name="txtDirAlmacen"  type="text"
								          placeholder="Ingrese direcciòn del Almacèn" >
										</label>
									</section>
								</div>
                                  <input
								type="hidden" name="idAlmacen" class="idAlmacen" />
								
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

<div class="table-responsive">
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					
					<th>Nombre</th>
					<th>Direccion</th>
					<th>Eliminar</th>
					<th>Editar</th>
					
				
				</tr>
			</thead>
			<tbody class="tbodyAlmacen">
				
			</tbody>
		</table>

	</div>
	
	
<script type="text/javascript">
	pageSetUp();
	var pagefunction = function() {
		function listar() {
			var tbody = $(".tbodyAlmacen");
			tbody.empty();
			var text_html = "";
			$
					.ajax({
						url : "../admin/listAlmacen.htm",
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
									text_html += "<td>" + lista[i].nomAlmacen
											+ "</td>";
									text_html += "<td>" + lista[i].dirAlmacen
											+ "</td>";
									text_html += "<td><button type='button' class='btnEliminar' value='"+lista[i].idAlmacen+"'>Eliminar</button></td><td><button type='button' value='"+lista[i].idAlmacen+"' class='btnEditar'>Editar</button></td>";
									text_html += "</tr>";
								}

								tbody.append(text_html);
							}
							$(".btnEliminar")
							.click(
									function() {
										$
												.ajax({
													url : "../admin/delalmacen.htm",
													type : "POST",
													data : "idAlmacen="
															+ $(this)
																	.val(),
													success : function(
															data) {
														
														listar();

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
													url : "../admin/pupdalmacen.htm",
													type : "POST",
													data : "idAlmacen="
															+ $(this)
																	.val(),
													success : function(
															data) {
														data = JSON
																.parse(data);
														$(".idAlmacen").val(data.almacen["idAlmacen"]);
														$(".txtNomAlmacen")
																.val(
																		data.almacen["nomAlmacen"]);
														$(".txtDirAlmacen")
																.val(
																		data.almacen["dirAlmacen"]);
													
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

		listar();
		$(".btnSubmit")
				.click(
						function() {
							if ($(".smart-form").valid()) {
								if ($(this).val() === "Registrar") {

									$
											.ajax({
												url : "../admin/regalmacen.htm",
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
															content : "<i class='fa fa-clock-o'></i> <i>Almacèn ya registrado ...</i>",
															color : "#F80011",
															iconSmall : "fa fa-thumbs-down bounce animated",
															timeout : 4000
														});
													} else {
														//alert(data.mensaje)
														listar();
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
										url : "../admin/updalmacen.htm",
										type : "POST",
										data : $(".smart-form")
												.serialize(),
										success : function(data) {
											data = JSON.parse(data);
											if (data.rpta === "-1") {
												$(".smart-form")[0].reset();
												$.smallBox({
													title : "Notificacion",
													content : "<i class='fa fa-clock-o'></i> <i>Almacen ya registrado ...</i>",
													color : "#F80011",
													iconSmall : "fa fa-thumbs-down bounce animated",
													timeout : 4000
												});
											} else {
												//alert(data.mensaje)
												listar();
												$(".btnSubmit").empty();
												$(".btnSubmit")
														.append(
																"<span class='glyphicon glyphicon-ok'></span> Registrar");
												$(".btnSubmit").val(
														"Registrar");
												 $(".smart-form")[0].reset();
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
				txtNomAlmacen : {
					 
					required : true , 
					validateNullOrWhiteSpace : true,
					sqlWords: true , 
					maxlength : 30
				},
				txtDirAlmacen : {
					 
					required : true , 
					validateNullOrWhiteSpace : true,
					sqlWords: true , 
					maxlength : 30
				}
		
		       
			},
	
			// Messages for form validation
			messages : {
				txtNomAlmacen : {
					required : 'Debe ingresar el nombre del almacen ',
					maxlength :'No debe exceder los 30 caracteres'
				},
			   txtNomAlmacen : {
				required : 'Debe ingresar una direcciòn para el almacen ',
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
