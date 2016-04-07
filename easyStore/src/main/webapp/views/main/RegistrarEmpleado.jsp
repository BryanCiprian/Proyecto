<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="widget-body no-padding">
						
						<form id="checkout-form" class="smart-form" novalidate="novalidate">
                          
                             
							<fieldset>
							    
							    <div class="row">
								<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
									    <input class="form-control txtNomPer" id="txtNomPer"
							         	name="txtNomPer"  type="text"
								        placeholder="Ingrese Nombre de la Persona" required 
								        data-fv-notempty-message=" es necesario"> 
										</label>
								</section>
								<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtApePatPer" id="txtApePatPer" 
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
								<label class="select">
                                <select class="form-control2 cboTipoDocumento" id="cboTipoDocumento" name="cboTipoDocumento" >
								<option value="" selected="selected">Seleccione Tipo de documento</option>
								<c:forEach items="${cmboTipoDocumento}" var="cmbo">
							    <option value="${cmbo.id_doc_inventario}">${cmbo.des_doc}</option>
								</c:forEach>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
								</div>
								
								<div class="row">
								
								<section class="col col-6">
								   <label class="input"> <i class="icon-prepend fa fa-user"></i>
								   <input class="form-control txtNumDocumento" id="txtNumDocumento"
								   name="txtNumDocumento" maxlength="30" type="text"
								   placeholder="Ingrese Número de documento de la Persona" required
								   data-fv-notempty-message=" es necesario"> 
								   </label>
								</section>
								<label >Fecha de Nacimiento</label>
								<section class="col col-1">
								<label class="select">
                                <select class="form-control2 cboDia" id="cboDia" name="cboDia" >
								<option value="" selected="selected">Día</option>
								<option value='01'>01</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-1">
						     	<label class="select">
                                <select class="form-control2 cboMes" id="cboMes" name="cboMes" >
								<option value="" selected="selected">Mes</option>
								<option value='01'>Enero</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-1">
						     	<label class="select">
                                <select class="form-control2 cboYear" id="cboYear" name="cboYear" >
								<option value="" selected="selected">Año</option>
								<option value='2000'>2000</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
							    </div>
							    
							    <div class="row">
							    <section class="col col-6">
								<label class="select">
                                <select class="form-control2 cboCargo" id="cboCargo" name="cboCargo" >
								<option value="" selected="selected">Seleccione Cargo</option>
								<c:forEach items="${cmboCargo}" var="cmbo">
							    <option value="${cmbo.idCargo}">${cmbo.desCargo}</option>
								</c:forEach>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
								<label >Fecha de Inicio de contrato</label>
								<section class="col col-1">
								<label class="select">
                                <select class="form-control2 cboDiaInicioContrato" id="cboDiaInicioContrato" name="cboDiaInicioContrato" >
								<option value="" selected="selected">Día</option>
								<option value='01'>01</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-1">
						     	<label class="select">
                                <select class="form-control2 cboMesInicioContrato" id="cboMesInicioContrato" name="cboMesInicioContrato" >
								<option value="" selected="selected">Mes</option>
								<option value='01'>Enero</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-1">
						     	<label class="select">
                                <select class="form-control2 cboYearInicioContrato" id="cboYearInicioContrato" name="cboYearInicioContrato" >
								<option value="" selected="selected">Año</option>
								<option value='2000'>2000</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
								</div>
								
								<div class="row">
								<!--  <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtRuc" id="txtRuc" 
								name="txtApePatPer"  type="text"
								placeholder="Ingrese su RUC" required
								data-fv-notempty-message=" es necesario"> 
										</label>
								</section> -->
								<label >Fecha de Fin de contrato</label>
								<section class="col col-1">
								<label class="select">
                                <select class="form-control2 cboDiaFinContrato" id="cboDiaFinContrato" name="cboDiaFinContrato" >
								<option value="" selected="selected">Día</option>
								<option value='01'>01</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-1">
						     	<label class="select">
                                <select class="form-control2 cboMesFinContrato" id="cboMesFinContrato" name="cboMesFinContrato" >
								<option value="" selected="selected">Mes</option>
								<option value='01'>Enero</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-1">
						     	<label class="select">
                                <select class="form-control2 cboYearFinContrato" id="cboYearFinContrato" name="cboYearFinContrato" >
								<option value="" selected="selected">Año</option>
								<option value='2000'>2000</option>
								</select>
						     	<i></i>
						     	</label>
						     	</section>
							    </div>
							    
							    <div class="row">
                                 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtTelefono1" id="txtTelefono1"  data-mask="(999)999-9999"
								name="txtTelefono1"  type="text"
								placeholder="Ingrese Primer teléfono de la Persona" > 
										</label>
								</section>
								<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtTelefono2" id="txtTelefono2"  data-mask="(999)999-9999"
								name="txtTelefono2"  type="text"
								placeholder="Ingrese segundo teléfono de la Persona" > 
										</label>
								</section>
                                </div>
                                
                                 <div class="row">
                                 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtTelefono3" id="txtTelefono3"  data-mask="(999)999-9999"
								name="txtTelefono3"  type="text"
								placeholder="Ingrese tercer teléfono de la Persona" > 
										</label>
								</section>
								<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCelular1" id="txtCelular1" data-mask="(999)999-999-999"
								name="txtCelular1" type="text"
								placeholder="Ingrese Priner celular de la Persona" > 
										</label>
								</section>
                                </div>
                                
                                 <div class="row">
                                 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCelular2" id="txtCelular2" data-mask="(999)999-999-999"
								name="txtCelular2" type="text"
								placeholder="Ingrese Segundo celular de la Persona" > 
										</label>
								</section>
								<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCelular3" id="txtCelular3" data-mask="(999)999-999-999"
								name="txtCelular3" type="text"
								placeholder="Ingrese Tercer celular de la Persona" > 
										</label>
								</section>
                                </div>
                                
                                <div class="row">
                                <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCorreo1" id="txtCorreo1"
								name="txtCorreo1" type="text"
								placeholder="Ingrese Primer correo de la Persona" > 
										</label>
								</section>
								 <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCorreo2" id="txtCorreo2"
								name="txtCorreo2" type="text"
								placeholder="Ingrese Segundo correo de la Persona" > 
										</label>
								</section>
                                </div>
                                
                                <div class="row">
                                <section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtCorreo3" id="txtCorreo3"
								name="txtCorreo3" type="text"
								placeholder="Ingrese tercer correo de la Persona" > 
										</label>
								</section>
								<section class="col col-6">
										<label class="input"> <i class="icon-prepend fa fa-user"></i>
										<input class="form-control txtDireccion" id="txtDirec"
								name="txtDirec"  type="text"
								placeholder="Ingrese direccion de la Persona" required
								data-fv-notempty-message=" es necesario"> 
										</label>
							    </section>
                                </div>
								
                                <div class="row">
                                <section class="col col-6">
								<label class="select">
                                
                                 <select class="form-control2 cboDepartamento" id="cboDepartamento" name="cboDepartamento" >
								  <option value="" selected="selected">Seleccione Departamento</option>
									<c:forEach items="${cmboDepartamento}" var="cmbo">
									   <option value="${cmbo.idDepartamento}">${cmbo.desDepartamento}</option>
									</c:forEach>
						     	</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-6">
								<label class="select">
                                
                                 <select class="form-control2 cboProvincia" id="cboProvincia" name="cboProvincia" >
								  <option value="" selected="selected">Seleccione Provincia</option>
						     	</select>
						     	<i></i>
						     	</label>
						     	</section>
						        </div>
						         <div class="row">
						        <section class="col col-6">
								<label class="select">
                                <select class="form-control2 cboDistrito" id="cboDistrito" name="cboDistrito" >
								<option value="" selected="selected">Seleccione Distrito</option>
						     	</select>
						     	<i></i>
						     	</label>
						     	</section>
						     	<section class="col col-6">
								<label class="select">
                                <select class="form-control2 cboZona" id="cboZona" name="cboZona" >
								<option value="" selected="selected">Seleccione Zona</option>
						     	</select>
						     	<i></i>
						     	</label>
						     	</section>
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
		$(".cboDepartamento").change(
				function() {
					var cboProvincia = $(".cboProvincia");
					cboProvincia.empty();
					var text_html = "";
							$.ajax({
										url : "../emple/listProvincia.htm",
										type : "POST",
										data : "idDepartamento="+ $(this).val(),
										success : function(objJson) {
											var json = JSON.parse(objJson);
											var lista = json.cmboProvincia;
											for (var i = 0; i < lista.length; i++) {
												text_html += "<option value='"+lista[i].idProvincia+"'>"+lista[i].desProvincia+"</option>";
												 }
											cboProvincia.append(text_html);
                                        }
									});
				});
		$(".cboProvincia").change(
				function() {
					var cboDistrito = $(".cboDistrito");
					cboDistrito.empty();
					var text_html = "";
							$.ajax({
										url : "../emple/listDistrito.htm",
										type : "POST",
										data : "idProvincia="+ $(this).val(),
										success : function(objJson) {
											var json = JSON.parse(objJson);
											var lista = json.cmboDistrito;
											for (var i = 0; i < lista.length; i++) {
												text_html += "<option value='"+lista[i].idDistrito+"'>"+lista[i].desDistrito+"</option>";
												 }
											cboDistrito.append(text_html);
                                        }
									});
				});
		$(".cboDistrito").change(
				function() {
					var cboDistrito = $(".cboZona");
					cboDistrito.empty();
					var text_html = "";
							$.ajax({
										url : "../emple/listZona.htm",
										type : "POST",
										data : "idDistrito="+ $(this).val(),
										success : function(objJson) {
											var json = JSON.parse(objJson);
											var lista = json.cmboZona;
											for (var i = 0; i < lista.length; i++) {
												text_html += "<option value='"+lista[i].idZona+"'>"+lista[i].desZona+"</option>";
												 }
											cboDistrito.append(text_html);
											
                                        }
									});
				});
		$(".btnSubmit").click(
    		    function() {
                            $.ajax({
    							       url : "../main/regempleado.htm",
    								   type : "POST",
    								   data : $(".smart-form").serialize(),
    								   success : function(data) {
    								        data = JSON.parse(data);
    								        //$(".smart-form")[0].reset();
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
    									
    								
    							});
	}
	pagefunction();
</script>
				