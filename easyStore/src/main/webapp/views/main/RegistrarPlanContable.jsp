<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="widget-body no-padding">
						
						<form id="checkout-form" class="smart-form" novalidate="novalidate">

							<fieldset>
								  	<div class="row">
				 <section>
					<div class="inline-group">
						<fieldset class="fields2">
                            <dl>
                             <dt><label>Seleccione plan a registrar</label></dt>
                             <dd>
                          
                             <label class="radio">
		                     <input type="radio" name="planContable" class="planContable" onclick="toggle(this)" value="1"><i></i>Cuenta
			                 </label>
			                 <label class="radio">
			                 <input type="radio" name="planContable" class="planContable" onclick="toggle(this)" value="2"><i></i>SubCuenta
			                 </label>
			               
					         </dd>
                             </dl>
                        </fieldset>
                  </div>
               </section>
           </div>
        
		   <div class="row" id="cbos">
              <section class="col col-6">
					<label class="select">
                          <select class="form-control2 cboClase" id="cboClase" name="cboClase" required data-fv-notempty-message="Zona es necesario">
						      <option value="" selected="selected">Seleccione Clase</option>
							  <c:forEach items="${cmboClase}" var="clase">
							  <option value="${clase.idClase}">${clase.desClase}</option>
							  </c:forEach>
						 </select>
						   <i></i>
				   </label>
			 </section>
		  
			 <section class="col col-6">
					<label class="select">
                          <select class="form-control2 cboGrupo" id="cboGrupo" name="cboGrupo" required data-fv-notempty-message="Zona es necesario">
						      <option value="" selected="selected">Seleccione Grupo</option>
							  
						 </select>
						   <i></i>
				   </label>
			 </section>
		
       </div>
       <div class="form-group2" id="divCuenta" style="display:none">
       <div class="row">
           <section class="col col-6">
						 <label class="input"> <i class="icon-prepend fa fa-user"></i>
							 <input class="form-control txtIdCuenta" id="txtIdCuenta"
							  name="txtIdCuenta"  type="text"
						      placeholder="Ingrese código de la cuenta" >
						</label>
			</section>
			<section class="col col-6">
						 <label class="input"> <i class="icon-prepend fa fa-user"></i>
							 <input class="form-control txtDesCuenta" id="txtDesCuenta"
							  name="txtDesCuenta"  type="text"
						      placeholder="Ingrese descripción de la cuenta" >
						</label>
			</section>
       </div>
       </div>
       <div class="form-group2" id="divSubCuenta" style="display:none">
       <div class="row">
              <section class="col col-6">
					<label class="select">
                          <select class="form-control2 cboCuenta" id="cboCuenta" name="cboCuenta" disabled="disabled">
						      <option value="" selected="selected">Seleccione Cuenta</option>
						 </select>
						   <i></i>
				   </label>
			 </section>
			 <section class="col col-6">
			 <label class="input"> <i class="icon-prepend fa fa-user"></i>
							 <input class="form-control txtIdSubCuenta" id="txtIdSubCuenta"
							  name="txtIdSubCuenta"  type="text"
						      placeholder="Ingrese código de la Subcuenta" >
		     </label>
		     </section>
		    
	  </div>
	  <div class="row">
	    <section class="col col-6">
	    <label class="input"> <i class="icon-prepend fa fa-user"></i>
							 <input class="form-control txtDesSubCuenta" id="txtDesSubCuenta"
							  name="txtDesSubCuenta"  type="text"
						      placeholder="Ingrese descripción de la Subcuenta" >
	    </label>
	    </section>
	  </div>
	  </div>
								
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
					<th>Còdigo</th>
					<th>Descripciòn</th>
					<th>Eliminar</th>
					<th>Editar</th>
					
				
				</tr>
			</thead>
			<tbody class="tbodyPlanCuenta">
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
	function listarPlanCuenta() {
			var tbody = $(".tbodyPlanCuenta");
			tbody.empty();
			var text_html = "";
			$
					.ajax({
						url : "../admin/listPlanCuenta.htm",
						data : "",
						type : "post",
						success : function(objJson) {

							var json = JSON.parse(objJson);
							var lista = json.listaCuenta;
							//var idCuenta;
								for (var i = 0; i < lista.length; i++) {
									text_html= "";
									text_html += "<tr>";
									text_html += "<td>" + lista[i].idCuenta
											+ "</td>";
									text_html += "<td>" + lista[i].desCuenta
											+ "</td>";
								    text_html += "<td><button type='button' class='btnEliminar' value='"+lista[i].idCuenta+"'>Eliminar</button></td><td><button type='button' class='btnEditar' value='"+lista[i].idCuenta+"'>Editar</button></td>";
									text_html += "</tr>";
									
									//alert(lista[i].idCuenta);
									$
									.ajax({
										
										url : "../admin/listPlanSubCuenta.htm",
										data : "idPlanCuenta=" + lista[i].idCuenta  ,
										type : "post",
										
										success : function(objJson) {
											    
											var json = JSON.parse(objJson);
											var listaSub = json.listaSubCuenta;
											var text ="";
												for (var a = 0; a < listaSub.length; a++) {
													text ="";
													text += "<tr>";
													text += "<td>" + listaSub[a].idSubCuenta+ "</td>";
													text += "<td>" + listaSub[a].desSubCuenta+ "</td>";
													text += "<td><button type='button' class='btnEliminarSubCuenta' value='"+listaSub[a].idSubCuenta+"'>Eliminar</button></td>";
													text += "</tr>";
													//alert(text);
													tbody.append(text);
												}
												
												$(".btnEliminarSubCuenta")
												.click(
														function() {
															$
																	.ajax({
																		url : "../admin/delplansubcuenta.htm",
																		type : "POST",
																		data : "idSubCuenta="
																				+ $(this)
																						.val(),
																		success : function(
																				data) {
																		
																			data = JSON.parse(data);
																			//	alert(data.rpta)
																				if (data.res == "1") {
																				 $(".smart-form")[0].reset();
																				 listarPlanCuenta()
																					//alert(data.nCuentas+"czxczc");
																					$.smallBox({
																						title : "Notificacion",
																						content : "<i class='fa fa-clock-o'></i> <i>Se ha eliminado correctamente ...</i>",																			
																						color : "#296191",
																						iconSmall : "fa fa-thumbs-up bounce animated",
																						timeout : 4000
																					});
																				} else {
																					alert(data.nCuentas);
																					//alert(data.mensaje)
																					//listarMarca();
																				     $(".smart-form")[0].reset();
																					$
																							.smallBox({
																								title : "Notificacion",
																								content : "<i class='fa fa-clock-o'></i> <i> No se puede eliminar</i>",
																								color : "#F80011",
																								iconSmall : "fa fa-thumbs-down bounce animated",
																								timeout : 4000
																							});

																				}
		 
																		}
																	});

														});
										
								
											
											

										}

									});
									
									
									tbody.append(text_html);
								}
								

								$(".btnEliminar")
										.click(
												function() {
													$
															.ajax({
																url : "../admin/delplancuenta.htm",
																type : "POST",
																data : "idCuenta="
																		+ $(this)
																				.val(),
																success : function(
																		data) {
																
																	data = JSON.parse(data);
																	//	alert(data.rpta)
																		if (data.nCuentas == "0") {
																		 $(".smart-form")[0].reset();
																		 listarPlanCuenta()
																			alert(data.nCuentas+"czxczc");
																			$.smallBox({
																				title : "Notificacion",
																				content : "<i class='fa fa-clock-o'></i> <i>Se ha eliminado correctamente ...</i>",																			
																				color : "#296191",
																				iconSmall : "fa fa-thumbs-up bounce animated",
																				timeout : 4000
																			});
																		} else {
																			alert(data.nCuentas);
																			//alert(data.mensaje)
																			//listarMarca();
																		     $(".smart-form")[0].reset();
																			$
																					.smallBox({
																						title : "Notificacion",
																						content : "<i class='fa fa-clock-o'></i> <i>La cuenta seleccionada tiene registrada "+ data.nCuentas + " subcuentas debe elimnarlas ants de proceder</i>",
																						color : "#F80011",
																						iconSmall : "fa fa-thumbs-down bounce animated",
																						timeout : 4000
																					});

																		}
 
																}
															});

												});
								
								$(".btnEditar")
								.click(
										function() {
											$
													.ajax({
														url : "../admin/pupdplancuenta.htm",
														type : "POST",
														data : "idCuenta="
																+ $(this)
																		.val(),
														success : function(
																data) {
															data = JSON
																	.parse(data);
															$('input[class=planContable][value=1]').attr('checked', true); 
															
															$('input[class=planContable]').attr("disabled",true);
															
															$("#divCuenta").show();
															$("#cbos").hide();
															
															$(".txtIdCuenta")
																	.val(
																			data.cuenta["idCuenta"]);
															$(".txtIdCuenta")
															.attr("disabled",true);
															$(".txtDesCuenta")
															.val(
																	data.cuenta["desCuenta"]);
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
	listarPlanCuenta();
		
		$(".cboClase")
				.change(
						function() {
							$('.cboGrupo').prop('disabled', false);
							$('.cboCuenta').prop('disabled', true);
					
						//$(".cboCuenta").val("0");
							//cboCuenta.empty();
							var cboGrupo = $(".cboGrupo");
							cboGrupo.empty();
							var text_html = "";
							//alert($(this).val()),
									$
											.ajax({
												url : "../admin/listGrupo.htm",
												type : "POST",
												data : "idClase="+ $(this).val(),
												success : function(objJson) {
													var json = JSON.parse(objJson);
													var lista = json.lista;
													
										//	alert(lista.length);
													for (var i = 0; i < lista.length; i++) {
														text_html += "<option value='"+lista[i].idGrupo+"'>"+lista[i].desGrupo+"</option>";
														 
													}

													cboGrupo.append(text_html);
										
														//$(".smart-form")[0].reset();
														
												

												}
											});
									
						
						});
              
		$(".cboGrupo")
		.change(
				function() {
				   $('.cboCuenta').prop('disabled', false);
					var cboCuenta = $(".cboCuenta");
					cboCuenta.empty();
					var text_html = "";
					//alert($(this).val()),
							$
									.ajax({
										url : "../admin/listCuenta.htm",
										type : "POST",
										data : "idGrupo="+ $(this).val(),
										success : function(objJson) {
											var json = JSON.parse(objJson);
											var lista = json.lista;
											
											//alert(lista.length);
											for (var i = 0; i < lista.length; i++) {
												text_html += "<option value='"+lista[i].idCuenta+"'>"+lista[i].desCuenta+"</option>";
												 
											}

											cboCuenta.append(text_html);
								
												//$(".smart-form")[0].reset();
												
										

										}
									});
						
				
				});
		
		/*$(document).ready(function()
				{
				$(".planContable").change(function () {	 
					alert($('input:radio[name=planContable]:checked').val());
					
					});
				 });
		$(".planContable").change(function () {
			$(".smart-form")[0].reset();
		});*/
	};

	$(".btnSubmit")
	.click(
			function() {
				
				if ($(".smart-form").valid()) {
					if ($(this).val() === "Registrar") {
					if ($('input:radio[name=planContable]:checked').val() === "1") {

						$
								.ajax({
									url : "../admin/regcuenta.htm",
									type : "POST",
									data : $(".smart-form")
											.serialize(),
									success : function(data) {
										data = JSON.parse(data);
									//	alert(data.rpta)
										if (data.rpta === "-1") {
											
											
											$.smallBox({
												title : "Notificacion",
												content : "<i class='fa fa-clock-o'></i> <i>Marca ya registrada ...</i>",
												color : "#F80011",
												iconSmall : "fa fa-thumbs-down bounce animated",
												timeout : 4000
											});
											$(".smart-form")[0].reset();
											$(".cboGrupo").reset();
										} else {
											//alert(data.mensaje)
											
										
											$
													.smallBox({
														title : "Notificacion",
														content : "<i class='fa fa-clock-o'></i> <i>Se ha registrado correctamente ...</i>",
														color : "#296191",
														iconSmall : "fa fa-thumbs-up bounce animated",
														timeout : 4000
													});
											$(".smart-form")[0].reset();
											$(".cboGrupo").reset();
										}

									}
								});
					} else {
						
						$
								.ajax({
									url : "../admin/regsubcuenta.htm",
									type : "POST",
									data : $(".smart-form")
											.serialize(),
									success : function(data) {
										data = JSON.parse(data);
										if (data.rpta === "-1") {
											
											$.smallBox({
												title : "Notificacion",
												content : "<i class='fa fa-clock-o'></i> <i>Marca ya registrada ...</i>",
												color : "#F80011",
												iconSmall : "fa fa-thumbs-down bounce animated",
												timeout : 4000
											});
											$(".smart-form")[0].reset();
										} else {
											//alert(data.mensaje)
											
											$
													.smallBox({
														title : "Notificacion",
														content : "<i class='fa fa-clock-o'></i> <i>Se ha editado correctamente ...</i>",
														color : "#296191",
														iconSmall : "fa fa-thumbs-up bounce animated",
														timeout : 4000
													});
											$(".smart-form")[0].reset();
										}

									}
								});
					}
					}else {
						$
						.ajax({
							url : "../admin/updplancuenta.htm",
							type : "POST",
							data : $(".smart-form")
									.serialize(),
							success : function(data) {
								data = JSON.parse(data);
								alert(data.rpta);
								if (data.rpta === "-1") {
								
									$(".smart-form")[0].reset();
									$.smallBox({
										title : "Notificacion",
										content : "<i class='fa fa-clock-o'></i> <i>Cuenta ya registrada ...</i>",
										color : "#F80011",
										iconSmall : "fa fa-thumbs-down bounce animated",
										timeout : 4000
									});
								} else {
									//alert(data.mensaje)
									//$(".btnSubmit").empty();
								//	$(".btnSubmit")
									//		.append(
										//			"<span class='glyphicon glyphicon-ok'></span> Registrar");
									//$(".btnSubmit").val(
										//	"Registrar");
									 //$(".smart-form")[0].reset();
									// 
								//	$(".smart-form")[0].reset();
								//	listarPlanCuenta();
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
	

	 function toggle(elemento) {
         if(elemento.value=="1") {
             document.getElementById("divCuenta").style.display = "block";
             document.getElementById("divSubCuenta").style.display = "none";
          
          }else{
        	  document.getElementById("divCuenta").style.display = "none";
              document.getElementById("divSubCuenta").style.display = "block";
            
           }
       }
	pagefunction();
</script>
