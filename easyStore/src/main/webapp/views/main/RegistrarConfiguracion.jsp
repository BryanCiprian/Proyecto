<div class="row">
	<article class="col-sm-12">
		<!-- Widget ID (each widget will need unique ID)-->
		<div class="jarviswidget jarviswidget-color-darken" id="wid-id-0"
			data-widget-editbutton="false" data-widget-deletebutton="false">
			<!-- widget options:
								usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
				
								data-widget-colorbutton="false"
								data-widget-editbutton="false"
								data-widget-togglebutton="false"
								data-widget-deletebutton="false"
								data-widget-fullscreenbutton="false"
								data-widget-custombutton="false"
								data-widget-collapsed="true"
								data-widget-sortable="false"
				
								-->
			<header>
				<span class="widget-icon"> <i class="fa fa-cog"></i>
				</span>
				<h2>Configuracion Inicial del Sistema</h2>

			</header>

			<!-- widget div-->
			<div>

				<!-- widget edit box -->
				<div class="jarviswidget-editbox">
					<!-- This area used as dropdown edit box -->

				</div>
				<!-- end widget edit box -->

				<!-- widget content -->
				<div class="widget-body">

					<div class="row">
						<form id="wizard-1" novalidate="novalidate">
							<div id="bootstrap-wizard-1" class="col-sm-12">
								<div class="form-bootstrapWizard">
									<ul class="bootstrapWizard form-wizard">
										<li class="active" data-target="#step1"><a href="#tab1"
											data-toggle="tab"> <span class="step">1</span> <span
												class="title">Empresa</span>
										</a></li>
										<li data-target="#step2"><a href="#tab2"
											data-toggle="tab"> <span class="step">2</span> <span
												class="title">Moneda</span>
										</a></li>
										<li data-target="#step3"><a href="#tab3"
											data-toggle="tab"> <span class="step">3</span> <span
												class="title">Diseño</span>
										</a></li>
										<li data-target="#step4"><a href="#tab4"
											data-toggle="tab"> <span class="step">4</span> <span
												class="title">Información Adicional</span>
										</a></li>
									</ul>
									<div class="clearfix"></div>
								</div>
								<div class="tab-content">
									<div class="tab-pane active" id="tab1">
										<br>
										<h3>
											<strong>Paso 1 </strong> - Datos de la Empresa
										</h3>
										<div class="row">
											<div class="col-sm-6">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-user fa-lg fa-fw"></i></span> <input
															class="form-control input-group-sm textNombre"
															placeholder="Nombre Empresa" type="text"
															name="textNombre" maxlength="30">

													</div>
												</div>
											</div>
											<div class="col-sm-6">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-briefcase fa-lg fa-fw"></i></span> <input
															class="form-control input-group-sm textRuc"
															placeholder="Numero de ruc" type="text" name="textRuc"
															maxlength="30">

													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-building fa-lg fa-fw"></i></span> <input
															class="form-control input-group-sm txtDirEmpresa"
															placeholder="Direccion de la empresa" type="text"
															name="txtDirEmpresa" maxlength="30">

													</div>
												</div>

											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-building fa-lg fa-fw"></i></span> <input
															class="form-control input-group-sm inputDocEmision"
															placeholder="Documento de Emisión" type="text"
															name="inputDocEmision" maxlength="30">

													</div>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-building fa-lg fa-fw"></i></span> <input
															type="text" name="selectActEcono"
															placeholder="Actividad Económica" maxlength="100"
															class="form-control input-group-sm selectActEcono">
													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-6">
												<div class="form-group">
													<label class="col-md-2 control-label">Subir Logo</label>
													<div class="col-md-10">
														<input type="file" class="btn btn-default imgLogo"
															name="imgLogo">
														<p class="help-block">de prefferencia en formato png.
														</p>
													</div>
												</div>
											</div>
											<div class="col-sm-6">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-building fa-lg fa-fw"></i></span> <input
															class="form-control input-group-sm textCodActEcon"
															placeholder="Código Actividad Económica" maxlength="6"
															type="text" name="textCodActEcon">
													</div>
												</div>

											</div>

										</div>

									</div>
									<div class="tab-pane" id="tab2">
										<br>
										<h3>
											<strong>Paso 2</strong> - Configuración Moneda
										</h3>
										<div class="row">
											<div class="col-md-6" style="display: block;">
												<div class="input-group">
													<span class="form-control"
														style="padding: 5px; padding-left: 10px"> ¿Moneda
														en Soles?</span> <span class="input-group-addon"> <span
														class="onoffswitch"> <input type="checkbox"
															name="cbkSoles" value="1" checked=""
															class="onoffswitch-checkbox cbkSoles" id="st1"> <label
															class="onoffswitch-label" for="st1"> <span
																class="onoffswitch-inner" data-swchon-text="SI"
																data-swchoff-text="NO"></span> <span
																class="onoffswitch-switch"></span>
														</label>
													</span>
													</span>
												</div>
											</div>
											<div class="col-md-6" style="display: block;">
												<div class="input-group">
													<span class="form-control"
														style="padding: 5px; padding-left: 10px"> ¿Moneda
														en Dólares?</span> <span class="input-group-addon"> <span
														class="onoffswitch"> <input type="checkbox"
															name="cbkDolar" value="1" checked=""
															class="onoffswitch-checkbox cbkDolar" id="st3"> <label
															class="onoffswitch-label" for="st3"> <span
																class="onoffswitch-inner" data-swchon-text="SI"
																data-swchoff-text="NO"></span> <span
																class="onoffswitch-switch"></span>
														</label>
													</span>
													</span>
												</div>
											</div>
										</div>
									</div>
									<div class="tab-pane" id="tab3">
										<br>
										<h3>
											<strong>Paso 3</strong> - Layout
										</h3>
										<div class="alert alert-info fade in">
											<button class="close" data-dismiss="alert">×</button>
											<i class="fa-fw fa fa-info"></i> <strong>Info!</strong> usted
											puede ver un vista previa de todos los cambios.
										</div>
										<div class="row">
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-flag fa-lg fa-fw"></i></span> <select
															name="selectTipoNav"
															class="form-control input-group-sm selectTipoNav">
															<option value="" selected="selected">[Tipo de
																Navegacion]</option>

															<option value="minified">Navigation Minified</option>
															<option value="hidden-menu">Hidden Navigation</option>
															<option value="top-navigation container">Menu on
																Top with center content</option>
															<option value="minified container">Center
																content with minified nav</option>
															<option value="smart-rtl">RTL Layout</option>
															<option value="smart-rtl top-navigation menu-on-top">RTL
																with Menu on Top</option>

														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-map-marker fa-lg fa-fw"></i></span> <select
															name="selectDiseno"
															class="form-control input-group-sm selectDiseno">
															<option value="" selected="selected">[Tipo de
																Diseño]</option>
															<option value="1">Habilitado</option>
															<option value="2">Deshabilitar</option>

														</select>
													</div>
												</div>
											</div>

											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-flag fa-lg fa-fw"></i></span> <select
															name="selectPosNav"
															class="form-control input-group-sm selectPosNav">
															<option value="" selected="selected">[Posicion
																de Privilegios]</option>
															<option value="1">Arriba</option>
															<option value="2">Izquierda</option>
															<option value="3">Derecha</option>
														</select>
													</div>
												</div>
											</div>
										</div>
										<div class="row" style="display: none">
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-map-marker fa-lg fa-fw selectColorBase"></i></span>
														<select name="selectColorBase"
															class="form-control input-group-sm">
															<option value="" selected="selected">[Color
																Base]</option>
															<option value="1">Soles</option>
															<option value="2">Dolares</option>
															<option value="3">Peso</option>
															<option value="4">Euro</option>
														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-map-marker fa-lg fa-fw"></i></span> <select
															name="selectColorAlt"
															class="form-control input-group-sm selectColorAlt">
															<option value="" selected="selected">[Color
																Alterno]</option>
															<option value="1">Soles</option>
															<option value="2">Dolares</option>
															<option value="3">Peso</option>
															<option value="4">Euro</option>
														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-flag fa-lg fa-fw"></i></span> <select
															name="selectPosFooter"
															class="form-control input-group-sm selectPosFooter">
															<option value="" selected="selected">[Fijar
																Elementos]</option>
															<option value="1">Cabecera</option>
															<option value="2">Navegacion</option>
															<option value="3">Cinta</option>
															<option value="4">Pie de Página</option>
														</select>
													</div>
												</div>
											</div>
										</div>

									</div>
									<div class="tab-pane" id="tab4">
										<br>
										<h3>
											<strong>Paso 4</strong> - Informacion Adicional
										</h3>
										<br>
										<div class="row">
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-map-marker fa-lg fa-fw"></i></span> <select
															name="selectTipoImpr"
															class="form-control input-group-sm selectTipoImpr">
															<option value="" selected="selected">[Tipo de
																Impresora]</option>
															<option value="1">Epson</option>
															<option value="2">Brother</option>
															<option value="3">Canon</option>
															<option value="4">Packard</option>
														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-map-marker fa-lg fa-fw"></i></span> <select
															name="selectTipoIdioma"
															class="form-control input-group-sm selectTipoIdioma">
															<option value="" selected="selected">[Idioma]</option>
															<option value="1">Ingles</option>
															<option value="2">Español</option>
														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<div class="input-group">
														<span class="input-group-addon"><i
															class="fa fa-map-marker fa-lg fa-fw"></i></span> <select
															name="selectCommandoVoz"
															class="form-control input-group-sm selectCommandoVoz">
															<option value="" selected="selected">[Activar
																Comando de Voz]</option>
															<option value="1">Si</option>
															<option value="2">No</option>
														</select>
													</div>
												</div>
											</div>
											<input type="hidden" value="Registrar" class="opc"  name="opc"/>
											<input type="hidden" value="" class="idConfig"  name="id"/>
											<center>

												<button class="btn btn-primary" type="submit"
													style="width: 30%">Aceptar</button>
											</center>
										</div>
									</div>

									<div class="form-actions">
										<div class="row">
											<div class="col-sm-12">
												<ul class="pager wizard no-margin">
													<!--<li class="previous first disabled">
																		<a href="javascript:void(0);" class="btn btn-lg btn-default"> First </a>
																		</li>-->
													<li class="previous disabled"><a
														href="javascript:void(0);" class="btn btn-lg btn-default">
															Anterior </a></li>
													<!--<li class="next last">
																		<a href="javascript:void(0);" class="btn btn-lg btn-primary"> Last </a>
																		</li>-->
													<li class="next"><a href="javascript:void(0);"
														class="btn btn-lg txt-color-darken"> Siguiente </a></li>
												</ul>
											</div>
										</div>
									</div>

								</div>
							</div>
						</form>
					</div>

				</div>
				<!-- end widget content -->

			</div>
			<!-- end widget div -->

		</div>
		<!-- end widget -->


	</article>
</div>




<script type="text/javascript">
	/* DO NOT REMOVE : GLOBAL FUNCTIONS!
	 *
	 * pageSetUp(); WILL CALL THE FOLLOWING FUNCTIONS
	 *
	 * // activate tooltips
	 * $("[rel=tooltip]").tooltip();
	 *
	 * // activate popovers
	 * $("[rel=popover]").popover();
	 *
	 * // activate popovers with hover states
	 * $("[rel=popover-hover]").popover({ trigger: "hover" });
	 *
	 * // activate inline charts
	 * runAllCharts();
	 *
	 * // setup widgets
	 * setup_widgets_desktop();
	 *
	 * // run form elements
	 * runAllForms();
	 *
	 ********************************
	 *
	 * pageSetUp() is needed whenever you load a page.
	 * It initializes and checks for all basic elements of the page
	 * and makes rendering easier.
	 *
	 */

	pageSetUp();

	// PAGE RELATED SCRIPTS

	// pagefunction

	var pagefunction = function() {

		function getConfiguracion() {
			$.ajax({
				url : "../mainConfig/getCofiguration.htm",
				type : "POST",
				success : function(objJson) {
					objJson = JSON.parse(objJson);
					config = objJson.showConfiguracion;
					$(".textNombre").val(config["nom_empresa"]);
					$(".textRuc").val(config["ruc_empresa"]);
					$(".txtDirEmpresa").val(config["dir_empresa"]);
					$(".inputDocEmision").val(config["doc_emision"]);
					$(".selectActEcono").val(config["act_economica"]);
					$(".selectDiseno").val(config["tipo_diseno"]);
					$(".textCodActEcon").val(config["cod_act_economica"]);
					$(".cbkSoles").val(config["mon_sol"]);
					$(".cbkDolar").val(config["mon_dolar"]);
					$(".selectTipoNav").val(config["tipo_navegacion"]);
					$(".selectTipoImpr").val(config["id_tipo_impresora"]);
					$(".selectTipoIdioma").val(config["idioma"]);
					$(".selectPosNav").val(config["pos_menu"]);
					$(".idConfig").val(config["id_config"]);
					
					$(".opc").val("Modificar");

				}

			});
		}
		function callFunction(lista) {
			$(".selectTipoNav").change(function() {

				for (var r = 0; r < lista.length; r++) {
					//alert(lista[r].nombre);
					$("#body-main").removeClass(String(lista[r].id));
				}
				$("#body-main").addClass($(this).val());
			});
			//alert("putraazooo" + lista.length)
		}
		function callFunctionDiseno(lista) {
			$(".selectDiseno").change(function() {
				for (var r = 0; r < lista.length; r++) {
					//alert(lista[r].nombre);
					$("#body-main").removeClass(String(lista[r].id));
				}
				$("#body-main").addClass($(this).val());
			});

		}
		function loadFormValues() {
			list_select(callFunction, $(".selectTipoNav"),
					"../mainConfig/showListFormConfiguracion.htm");
			list_select(callFunctionDiseno, $(".selectDiseno"),
					"../mainConfig/showTipoDiseno.htm");

		}
		function SubmitForm() {
			var opc = "";
			var url = "../mainConfig/crud.htm";
			if ($(".opc").val() === "Modificar") {
				opc = "Modificar";
			} else {
				opc = "Registrar";
			}
			$
					.ajax({
						url : url,
						type : "POST",
						data : $("#wizard-1").serialize() + "&opc=" + opc,
						success : function(data) {
							$
									.smallBox({
										title : "Notificacion",
										content : "<i class='fa fa-clock-o'></i> <i>Se ha registrado correctamente la configuracion...</i>",
										color : "#296191",
										iconSmall : "fa fa-thumbs-up bounce animated",
										timeout : 4000
									});

							if ($('.imgLogo').get(0).files[0].size <= 500000) {
								var jForm = new FormData();
								jForm.append("id", "");
								jForm.append("archivo",
										$('.imgLogo').get(0).files[0]);
								$
										.ajax(
												{
													type : "POST",
													url : "../mainConfig/saveImageLogo.htm",
													cache : false,
													processData : false,
													contentType : false,
													data : jForm,
													async : false,
													success : function(objJson) {
														objJson = JSON
																.parse(objJson);
														console.log(objJson);
														if (!objJson.status) {
															$
																	.smallBox({
																		title : "¡Alerta!",
																		content : "<i class='fa fa-clock-o'></i> <i>Ha ocurrido un error al procesar su logo...</i>",
																		color : "#C46A69",
																		iconSmall : "fa fa-cloud bounce animated",
																		timeout : 7000
																	});
														} else if (objJson.status) {
															$
																	.smallBox({
																		title : "¡Felicitaciones!",
																		content : "<i class='fa fa-clock-o'></i> <i>Su logo se ha subido con éxito...</i>",
																		color : "#296191",
																		iconSmall : "fa fa-cloud bounce animated",
																		timeout : 6000
																	});

														}
													}
												}).fail(function(objJson) {
										});
							} else {
								alert("Archivo no permitido, su tamaño debe ser menor a 500 KB");
								$(this).val('');
							}

						}
					});

		}

		loadScript(
				"../js/plugin/bootstrap-wizard/jquery.bootstrap.wizard.min.js",
				runBootstrapWizard);

		//Bootstrap Wizard Validations

		function runBootstrapWizard() {
			getConfiguracion();

			function addImage(e) {
				var file = e.target.files[0], imageType = /image.*/;
				if (!file.type.match(imageType))
					return;
				var reader = new FileReader();
				reader.onload = fileOnload;
				reader.readAsDataURL(file);
				$('.ver_foto').hide(200);
			}
			function precarga(e) {
				var file = e.target.files[0], imageType = /image.*/;
				if (!file.type.match(imageType))
					return;
				var reader = new FileReader();
				reader.onload = prefile;
				reader.readAsDataURL(file);
			}
			function prefile(e) {
				var result = e.target.result;
				$('.pre_foto').attr("src", result);
			}

			var $validator = $("#wizard-1")
					.validate(
							{

								rules : {
									textNombre : {
										required : true,
										maxlength : 30
									},
									textRuc : {
										required : true
									},
									txtDirEmpresa : {
										required : true
									},
									inputDocEmision : {
										required : true
									},
									selectActEcono : {
										required : true
									},
									selectDiseno : {
										required : true
									},
									imgLogo : {
										required : true,
										minlength : 4
									},
									textCodActEcon : {
										required : true

									},
									cbkSoles : {
										required : true
									},
									cbkDolar : {
										required : true
									},
									selectTipoNav : {
										required : true
									},
									selectColorBase : {
										required : false
									},
									selectColorAlt : {
										required : false
									},
									selectPosHeader : {
										required : false
									},
									selectPosNav : {
										required : false
									},
									selectPosFooter : {
										required : false
									},
									selectTipoImpr : {
										required : true
									},
									selectTipoIdioma : {
										required : true
									},
									selectCommandoVoz : {
										required : false
									}
								},

								messages : {
									fname : "Please specify your First name",
									lname : "Please specify your Last name",
									email : {
										required : "We need your email address to contact you",
										email : "Your email address must be in the format of name@domain.com"
									}
								},
								success : "valid",
								submitHandler : function() {
									SubmitForm();
								},

								highlight : function(element) {
									$(element).closest('.form-group')
											.removeClass('has-success')
											.addClass('has-error');
								},
								unhighlight : function(element) {
									$(element).closest('.form-group')
											.removeClass('has-error').addClass(
													'has-success');
								},
								errorElement : 'span',
								errorClass : 'help-block',
								errorPlacement : function(error, element) {
									if (element.parent('.input-group').length) {
										error.insertAfter(element.parent());
									} else {
										error.insertAfter(element);
									}
								}
							});
			function validateTab(index) {
				var $valid = $("#wizard-1").valid();
				if (!$valid) {
					$validator.focusInvalid();
					return false;
				} else {
					$('#bootstrap-wizard-1').find('.form-wizard')
							.children('li').eq(index - 1).addClass('complete');
					$('#bootstrap-wizard-1').find('.form-wizard')
							.children('li').eq(index - 1).find('.step').html(
									'<i class="fa fa-check"></i>');
				}
				return true;
			}
			$('.step').click(
					function() {
						var index = $('#bootstrap-wizard-1').bootstrapWizard(
								'currentIndex');
						if ($(this).find('i').hasClass("fa-check")) {
							if (!$("#wizard-1").valid()
									& $('.step').eq(index).find('i').hasClass(
											"fa-check")) {
								$validator.focusInvalid();
							} else {
								$('#bootstrap-wizard-1').bootstrapWizard(
										'show', $('.step').index(this));
							}
						} else {
							if (!$("#wizard-1").valid()) {
								$validator.focusInvalid();
							} else {
								$('#bootstrap-wizard-1').find('.form-wizard')
										.children('li').eq(index).addClass(
												'complete');
								$('#bootstrap-wizard-1').find('.form-wizard')
										.children('li').eq(index).find('.step')
										.html('<i class="fa fa-check"></i>');
								if ($('.step').eq($('.step').index(this) - 1)
										.find('i').hasClass("fa-check")) {
									$('#bootstrap-wizard-1').bootstrapWizard(
											'show', $('.step').index(this));
								}
							}
						}
					});

			$('#bootstrap-wizard-1').bootstrapWizard({
				'tabClass' : 'form-wizard',
				onTabClick : function(tab, navigation, index) {
					return validateTab(index, tab)
					//return true;
				},
				'onNext' : function(tab, navigation, index) {
					return validateTab(index);
				}
			});
			loadFormValues();
		}
		;

	};

	// end pagefunction

	// Load bootstrap wizard dependency then run pagefunction

	loadScript("../js/jsForm/jsForm.js", pagefunction);
</script>

