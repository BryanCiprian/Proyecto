<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
<div class="container">
	<div class="col-md-6">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h5 style="text-align: center;">REGISTRO DE PERSONAS</h5>
			</div>
		
			<form class="form-config">
				<div class="panel-body">
					<div>
					        <div class="form-group2">
					     	<fieldset class="fields2">
                            <dl>
                             <dt><label>Seleccione Cargo de la persona </label></dt>
                             <dd>
                             <c:forEach items="${listTipo}" var="tipo">
		                     <input type="radio" name="tipoPersona" onclick="toggle(this)" value="${tipo.idTipoPersona}">${tipo.descTipoPersona}
			                 </c:forEach>
					         </dd>
                             </dl>
                             </fieldset>
                             </div>
						<div class="form-group2">
						  
							<input class="form-control txtNomPer" id="txtNomPer"
								name="txtNomPer" maxlength="30" type="text"
								placeholder="Ingrese Nombre de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtApePatPer" id="txtApePatPer"
								name="txtApePatPer" maxlength="30" type="text"
								placeholder="Ingrese Apellido paterno de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtApeMatPer" id="txtApeMatPer"
								name="txtApeMatPer" maxlength="30" type="text"
								placeholder="Ingrese Apellido materno de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtDni" id="txtDni"
								name="txtDni" maxlength="30" type="text"
								placeholder="Ingrese DNI de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtDireccion" id="txtDirec"
								name="txtDirec" maxlength="30" type="text"
								placeholder="Ingrese direccion de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtCelular" id="txtCelular"
								name="txtCelular" maxlength="30" type="text"
								placeholder="Ingrese Celular de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtTelefono" id="txtTelefono"
								name="txtTelefono" maxlength="30" type="text"
								placeholder="Ingrese Telefono de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">
						  
							<input class="form-control txtCorreo" id="txtCorreo"
								name="txtCorreo" maxlength="30" type="text"
								placeholder="Ingrese Correo de la Persona" required
								data-fv-notempty-message=" es necesario"> 
						</div>
						<div class="form-group2">				
							 <select class="form-control2" id="cboZona" name="cboZona" required data-fv-notempty-message="Zona es necesario">
								  <option value="" selected="selected">Seleccione Zona</option>
									<c:forEach items="${cmboZona}" var="zona">
									   <option value="${zona.idZona}">${zona.nomZona}</option>
									</c:forEach>
							</select>
                        </div>
                        <div class="form-group2" id="divCargo" style="display:none">				
							 <select class="form-control2" id="cboCargo" name="cboCargo" required data-fv-notempty-message="Zona es necesario">
								  <option value="0" selected="selected">Seleccione Cargo</option>
									<c:forEach items="${cmboCargo}" var="cargo">
									   <option value="${cargo.idCargo}">${cargo.descCargo}</option>
									</c:forEach>
							</select>
                        </div>
							
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
	</div>
	

</div>

        <div class="form-group2">				
							 <select class="form-control2" id="cboMarca" name="cboMarca" required data-fv-notempty-message="Marca es necesario">
								  <option value="" selected="selected">Seleccione Zona</option>
									<c:forEach items="${cmboZona}" var="zona">
									   <option value="${zona.idZona}">${zona.nomZona}</option>
									</c:forEach>
								</select>
      </div>
--->
<div class="widget-body no-padding">
						
						<form id="checkout-form" class="smart-form" novalidate="novalidate">
                          
                             
							<fieldset>
							<div class="row">
							<section>
							<div class="inline-group">
							<fieldset class="fields2">
                            <dl>
                             <dt><label>Seleccione Cargo de la persona </label></dt>
                             <dd>
                             <c:forEach items="${listTipo}" var="tipo">
                             <label class="radio">
		                     <input type="radio" name="tipoPersona" class="tipoPersona" onclick="toggle(this)" value="${tipo.idTipoPersona}"><i></i>${tipo.descTipoPersona}
			                 </label>
			                 </c:forEach>
					         </dd>
                             </dl>
                             </fieldset>
                             </div>
                            </section>
                             </div>
								<div class="row">
									<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
									    <input class="form-control txtNomPer" id="txtNomPer"
							         	name="txtNomPer"  type="text"
								        placeholder="Ingrese Nombre de la Persona" required onkeypress="return soloLetras(event)"
								        data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
								    <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
											<input class="form-control txtApePatPer" id="txtApePatPer" onkeypress="return soloLetras(event)"
								name="txtApePatPer"  type="text"
								placeholder="Ingrese Apellido paterno de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
									
								</div>
								<div class="row">
									<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>  
									  <input class="form-control txtApeMatPer" id="txtApeMatPer" onkeypress="return soloLetras(event)"
								name="txtApeMatPer"  type="text"
								placeholder="Ingrese Apellido materno de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
								    <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtDni" id="txtDni"
								name="txtDni" maxlength="30" type="text"
								placeholder="Ingrese DNI de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
									
								</div>
                                <div class="row">
                                 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtDireccion" id="txtDirec"
								name="txtDirec"  type="text"
								placeholder="Ingrese direccion de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
									 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCelular" id="txtCelular" data-mask="(999)999-999-999"
								name="txtCelular" type="text"
								placeholder="Ingrese Celular de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
                                </div>
                                <div class="row">
                                 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtTelefono" id="txtTelefono"  data-mask="(999)999-9999"
								name="txtTelefono"  type="text"
								placeholder="Ingrese Telefono de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
									 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCorreo" id="txtCorreo"
								name="txtCorreo" type="text"
								placeholder="Ingrese Correo de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
									</section>
                                </div>
                                <div class="row">
                                <section class="col col-6">
										<label class="select">
                                
                                 <select class="form-control2" id="cboZona" name="cboZona" required data-fv-notempty-message="Zona es necesario">
								  <option value="" selected="selected">Seleccione Zona</option>
									<c:forEach items="${cmboZona}" var="zona">
									   <option value="${zona.idZona}">${zona.nomZona}</option>
									</c:forEach>
						     	</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<div class="form-group2" id="divCargo" style="display:none">	
						     	 <section class="col col-6">
										<label class="select">
                                
                                  <select class="form-control2" id="cboCargo" name="cboCargo" required data-fv-notempty-message="Zona es necesario">
								  <option value="0" selected="selected">Seleccione Cargo</option>
									<c:forEach items="${cmboCargo}" var="cargo">
									   <option value="${cargo.idCargo}">${cargo.descCargo}</option>
									</c:forEach>
							</select>
							<i></i>
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
 


<script type="text/javascript">

    	    
    	    
    	    
    	    
    		pageSetUp();
    		var pagefunction = function() {
    			
    			$(".btnSubmit").click(
    		    function() {if ($(".smart-form").valid()) {
                               
    										$.ajax({
    													url : "../main/regpersona.htm",
    													type : "POST",
    													data : $(".smart-form")
    															.serialize(),
    													success : function(data) {
    														data = JSON.parse(data);
    														$(".smart-form")[0].reset();
    														//alert (data.rpta)
    														$.smallBox({
    															title : "Notificacion",
    															content : "<i class='fa fa-clock-o'></i> <i>Persona registrada correctamente ...</i>",
    															color : "#296191",
    															iconSmall : "fa fa-thumbs-up bounce animated",
    															timeout : 4000
    														});

    													}
    												});
    									
    								}
    							});

    		};
    		
    		   var $checkoutForm = $('#checkout-form').validate({
    			
    	    		// Rules for form validation
    	    			rules : {
    	    				tipoPersona :{
    	    					required : true 
    	    				} ,
    	    				txtNomPer: {
    	    					 
    	    					required : true , 
    	    					validateNullOrWhiteSpace : true,
    	    					maxlength : 30
    	    				},
    	    				txtApePatPer: {
    	   					 
    	    					required : true , 
    	    					validateNullOrWhiteSpace : true,
    	    					maxlength : 30
    	    				},
    	    				txtApeMatPer : {
    	    					required : true,
    	    					validateNullOrWhiteSpace : true,
    	    					maxlength : 30
    	    								
    	    				},
    	    		
    	    				txtDni: {
                             
    	    					required : true ,
    	    					validateNullOrWhiteSpace : true,
    	    					digits : true ,
    	    					minlength : 8,
    	    					maxlength : 8
    	    				},
    	    				txtDirec: {
    	    					required : true ,
    	    					validateNullOrWhiteSpace : true, 
    	    					maxlength : 30
    	    				},
    	    				txtCelular: {
    	    					required : true ,
    	    					validateNullOrWhiteSpace : true, 
    	    					maxlength : 16,
    	    					maxlength : 16
    	    				},
    	    				txtTelefono: {
    	    					required : true ,
    	    					validateNullOrWhiteSpace : true,  
    	    					maxlength : 14,
    	    					maxlength : 14
    	    				},
    	    				txtCorreo: {
    	    					required : true ,
    	    					validateNullOrWhiteSpace : true, 
    	    					maxlength : 30, 
    	    					email : true
    	    				} , 
    	    				cboZona:{
    	    					required : true ,
    	    				}
    	    				
    	    				
    	    			},
    	    	
    	    			// Messages for form validation
    	    			messages : {
    	    				tipoPersona :{
    	    					required : 'Debe seleccionar el tipo de persona a crear' 
    	    				} ,
    	    				txtNomPer: {
    	   					 
    	    					required : 'El nombre es necesario' , 
    	    					maxlength : 'No debe exceder los 30 caracteres'
    	    				},
    	    				txtApePatPer: {
    	   					 
    	    					required : 'El apellido paterno es necesario' , 
    	    					maxlength :  'No debe exceder los 30 caracteres'
    	    				},
    	    				txtApeMatPer : {
    	    					required : 'El apellido materno es necesario' , 
    	    					maxlength :  'No debe exceder los 30 caracteres'
    	    								
    	    				},
    	    				txtDni: {
    	    					required : 'El DNI es necesario' , 
    	    					digits : 'Solo números',
    	    					maxlength :  'No debe exceder los 8 caracteres',
    	    					minlength :  'No debe ser menor a los 8 caracteres'
    	    					
    	    								
    	    				},
    	    				txtDirec: {
    	    					required : 'La dirección es necesaria' , 
    	    					maxlength :  'No debe exceder los 30 caracteres'
    	    				},
    	    				txtCelular: {
    	    					required : 'El celular es necesario' , 
    	    				
    	    				},
    	    				txtTelefono: {
    	    					required : 'El celular es necesario' , 
    	    					maxlength :  'No debe exceder los 30 caracteres'
    	    				},
    	    				txtCorreo: {
    	    					required : 'El correo es necesario' , 
    	    					maxlength :  'No debe exceder los 30 caracteres',
    	    					email : 'Ingrese una dirección de correo válida'
    	    				} ,
    	    				cboZona:{
    	    					required : 'Debe seleccionar alguna zona' ,
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
    		
    		 function toggle(elemento) {
    	            if(elemento.value=="1") {
    	                document.getElementById("divCargo").style.display = "block";
    	               
    	             }else{
    	          	   document.getElementById("divCargo").style.display = "none";
    	              }
    	          }
    		 
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