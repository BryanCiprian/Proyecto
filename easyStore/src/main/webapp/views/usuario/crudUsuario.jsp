<style>
.state-error .select2-selection {
	border: 1px solid #a94442;
	background: #fff0f0;
	/*border-radius: 4px;*/
}
.state-success .select2-selection {
	border: 1px solid #5D98CC;
	background:#f0fff0
	/*border-radius: 4px;*/
}
.select2-selection__rendered {
	padding-left: 8px;
}
</style>
 
<div class="row">
	<div class="well">
		<div class="row">
			<div class="col col-sm-9">
				<h1>Usuario</h1>
			</div>
			<section class="col col-sm-3">
				<button type="button" id="btn-registrar"
					class="btn btn-default btn-circle btn-lg btn-registrar"
					style="float: right; display: none" rel="tooltip"
					data-placement="top" data-original-title="Guardar">
					<i class="glyphicon glyphicon-floppy-disk"></i>
				</button>
				<button type="button"
					class="btn btn-primary btn-circle btn-lg btnAgregar"
					style="float: right; display: none" rel="tooltip"
					data-placement="top" data-original-title="Agregar">
					<i class="glyphicon glyphicon-plus"></i>
				</button>
				<button type="button"
					class="btn btn-danger btn-circle btn-lg btnClose"
					style="float: right; display: none" rel="tooltip"
					data-placement="top" data-original-title="Cancelar">
					<i class="glyphicon glyphicon-remove"></i>
				</button>
			</section>

		</div>
		<div class="row">
			<div class="col col-sm-12">
				<form id="form-submit" class="smart-form formSubmit"
					style="display: none">

					<div class="row">
						<section class="col col-4">
							<label class="label">Persona:</label> <select style="width: 100%"
								class="persona select2Element" required="required" name="id">
								<option value="">[Seleccione]</option>
							</select>
							<select name="nombres" class="personaReadOnly form-control" value="" style="display:none">
							</select>
						</section>
						<section class="col col-4">
							<label class="label">Usuario:</label> <label class="input">
								<i class="icon-prepend fa fa-user"></i> <input type="text"
								name="user" required="" class="user" maxlength="20" />
							</label>
						</section>
						<section class="col col-4">
							<label class="label">Clave:</label> <label class="input">
								<i class="icon-prepend fa fa-lock"></i> <input type="password"
								name="password" id="password" required="" class="password"
								maxlength="20" />
							</label>
						</section>
					</div>
					<div class="row">
						<section class="col col-4">
							<label class="label">Repita Clave:</label> <label class="input">
								<i class="icon-prepend fa fa-lock"></i> <input type="password"
								name="passwordConfirm" required="" class="passwordConfirm"
								maxlength="20" />
							</label>
						</section>
						<section class="col col-4">
							<label class="label">Fecha Inicio:</label> <label class="input">
								<i class="icon-prepend fa fa-calendar"></i> <input type="text"
								name="inicio" required="" class="inicio" id="from"
								placeholder="From" />
							</label>
						</section>
						<section class="col col-4">
							<label class="label">Fecha Fin:</label> <label class="input">
								<i class="icon-prepend fa fa-calendar"></i> <input type="text"
								name="fin" required="" class="fin" id="to" />
							</label>
						</section>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>


<div class="row">
	<div class="well">
		<div class="jarviswidget jarviswidget-color-darken" id="wid-id-0"
			data-widget-editbutton="false">
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
				<span class="widget-icon"> <i class="fa fa-table"></i>
				</span>
				<h2>Lista de Usuario</h2>

			</header>

			<!-- widget div-->
			<div>

				<!-- widget edit box -->
				<div class="jarviswidget-editbox">
					<!-- This area used as dropdown edit box -->

				</div>
				<!-- end widget edit box -->

				<!-- widget content -->
				<div class="widget-body no-padding">

					<table id="dt_basic"
						class="table table-striped table-bordered table-hover"
						width="100%">
						<thead>
							<tr>
								<th data-hide="phone">Nro</th>
								<th data-class="expand"><i
									class="fa fa-fw fa-user text-muted hidden-md hidden-sm hidden-xs"></i>
									Nombres y Apellidos</th>
								<th data-hide="phone"><i
									class="fa fa-fw fa-user text-muted hidden-md hidden-sm hidden-xs"></i>
									Usuario</th>
								<th data-hide="phone,tablet"><i
									class="fa fa-fw fa-lock txt-color-blue hidden-md hidden-sm hidden-xs"></i>
									Clave (Encriptada)</th>
								<th data-hide="phone,tablet"><i
									class="fa fa-fw fa-calendar txt-color-blue hidden-md hidden-sm hidden-xs"></i>Fec.
									Inicio</th>
								<th data-hide="phone,tablet"><i
									class="fa fa-fw fa-calendar txt-color-blue hidden-md hidden-sm hidden-xs"></i>Fec.
									Fin</th>
								<th data-hide="phone,tablet" style="width: 5%">Acciones</th>
							</tr>
						</thead>
						<tbody class="tbodys">

						</tbody>
					</table>

				</div>
				<!-- end widget content -->

			</div>
			<!-- end widget div -->

		</div>


	</div>
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

	/*
	 * ALL PAGE RELATED SCRIPTS CAN GO BELOW HERE
	 * eg alert("my home function");
	 * 
	 * var pagefunction = function() {
	 *   ...
	 * }
	 * loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
	 * 
	 */
	var opc = "save";
	var dataAditional = "";
	var formData = "";

	// PAGE RELATED SCRIPTS

	// pagefunction	
	var pagefunction = function() {
		//console.log("cleared");

		/* // DOM Position key index //
		
			l - Length changing (dropdown)
			f - Filtering input (search)
			t - The Table! (datatable)
			i - Information (records)
			p - Pagination (paging)
			r - pRocessing 
			< and > - div elements
			<"#id" and > - div with an id
			<"class" and > - div with a class
			<"#id.class" and > - div with an id and class
			
			Also see: http://legacy.datatables.net/usage/features
		 */

		/* BASIC ;*/
		var responsiveHelper_dt_basic = undefined;
		var responsiveHelper_datatable_fixed_column = undefined;
		var responsiveHelper_datatable_col_reorder = undefined;
		var responsiveHelper_datatable_tabletools = undefined;

		var breakpointDefinition = {
			tablet : 1024,
			phone : 480
		};

		$("#from").datepicker({
			defaultDate : "+1w",
			changeMonth : true,
			numberOfMonths : 3,
			prevText : '<i class="fa fa-chevron-left"></i>',
			nextText : '<i class="fa fa-chevron-right"></i>',
			dateFormat : 'dd/mm/yy',
			onClose : function(selectedDate) {
				$("#to").datepicker("option", "minDate", selectedDate);
			}

		});
		$("#to").datepicker({
			defaultDate : "+1w",
			changeMonth : true,
			numberOfMonths : 3,
			prevText : '<i class="fa fa-chevron-left"></i>',
			nextText : '<i class="fa fa-chevron-right"></i>',
			dateFormat : 'dd/mm/yy',
			onClose : function(selectedDate) {
				$("#from").datepicker("option", "maxDate", selectedDate);
			}
		});
		function listPersona() {
			$.ajax({
				url : "../usuario/executeCrudUsuario.htm",
				data : "opc=listPersona",
				type : "POST",
				success : function(objJson) {
					var select = $(".persona");
					objJson = JSON.parse(objJson);
					select.empty();
					if (objJson.rpta === -1) {
						alert(objJson.mensaje);
						return;
					}
					var lista = objJson.data;

					var textHtml = '';
					select.append("<option value=''>[Seleccione]</option>");
					for (var t = 0; t < lista.length; t++) {
						textHtml += '<option value="'+lista[t].idPersona+'">'
								+ lista[t].descNombre + ' '
								+ lista[t].apePaterno + ' '
								+ lista[t].apeMaterno + '</option>';
					}
					select.append(textHtml);
					select.select2();
				}
			});
		}

		listPersona();

		var table1 = $('#dt_basic')
				.DataTable(
						{
							"ajax" : {
								"url" : "../usuario/executeCrudUsuario.htm",
								"type" : "POST",
								"dataSrc" : "data",
								"data" : {
									"opc" : "Listar"
								}
							},
							"columns" : [ {
								"data" : "personaBean.idPersona"
							}, {
								"data" : "nombres"
							}, {
								"data" : "var_usuario"
							}, {
								"data" : "var_clave",
								"defaultContent" : ""
							}, {
								"data" : "fec_inicio"
							}, {
								"data" : "fec_fin"
							}, {

								"orderable" : false,
								"data" : null,
								"defaultContent" : ""
							} ],
							"sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>"
									+ "t"
									+ "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
							"oLanguage" : {
								"sSearch" : '<span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>'
							},
							"autoWidth" : true,
							"preDrawCallback" : function() {
								// Initialize the responsive datatables helper once.
								if (!responsiveHelper_dt_basic) {
									responsiveHelper_dt_basic = new ResponsiveDatatablesHelper(
											$('#dt_basic'),
											breakpointDefinition);
								}
							},
							"rowCallback" : function(row, data, index) {
								responsiveHelper_dt_basic.createExpandIcon(row);

								console.log(data.personaBean.idPersona);
								$('td:eq(6)', row)
										.html(
												'<button class="btn btn-success btn-xs btnEditar" value="' + data.personaBean.idPersona+ '" ><i class="fa fa-pencil" ></i></button> '
														+ '<button class="btn btn-danger btn-xs btnEliminar" value="' + data.personaBean.idPersona  + '" ><i class="fa fa-times"></i></button>');

							},
							"drawCallback" : function(oSettings) {
								responsiveHelper_dt_basic.respond();
								// var api = this.api();
								console.log("Enter to drawCallBack")
								$(".btnEditar")
										.click(
												function() {
													var id = $(this).val();
													opc = "findById";
													$
															.ajax({
																url : "../usuario/executeCrudUsuario.htm",
																data : "opc="
																		+ opc
																		+ "&id="
																		+ id,
																type : "POST",
																success : function(
																		objJson) {
																	objJson = JSON.parse(objJson);
																	var mensaje = objJson.message;
																	var item = objJson.showItem;
																	$(".persona, .select2").hide();
																	$(".persona").attr("disabled",true);
																	$(".personaReadOnly").show(200);
																	$(".personaReadOnly").empty();
																	$(".personaReadOnly").append("<option>"+item["nombres"]+"</option>");
																	$(".user").val(item["var_usuario"]);
																	$('#from').datepicker('setDate', item["fec_inicio"]);
																	$('#to').datepicker('setDate', item["fec_fin"]);
																	formData = $(
																			".formSubmit")
																			.serialize();
																	$(
																			".btnAgregar")
																			.click();
																	opc = "edit";
																	dataAditional = "&id="
																			+ id;
																}
															});
												});
								$(".btnEliminar")
										.click(
												function() {
													deleteRecord(
															$(this).val(),
															"../usuario/executeCrudUsuario.htm",
															"", $("#dt_basic"));

													listPersona()
												});
							}
						});

		/* END BASIC */
		interactiveButtons();

		
		
		$('.persona').change(function() {
		    $(this).valid();
		});

		function resetForm(){
			$(".select2").show(200);
			$(".persona").removeAttr("disabled");
			$(".personaReadOnly").hide();
			listPersona();
		}
		$('.formSubmit').validate(
				{
					// Rules for form validation
					rules : {
						venta : {
							required : true
						},
						password : {
							required : true,
							minlength : 3,
							maxlength : 20
						},
						passwordConfirm : {
							required : true,
							minlength : 3,
							maxlength : 20,
							equalTo : '#password'
						}
					},
					ignore : '',
					messages : {
						descripcion : "Ingrese una descripcion del producto",
						modelo : "Ingrese un modelo",
						codigoArticulo : {
							required : "Ingrese un código"
						},
						id : {
							required : "Seleccione una persona.",
						}
					},
					success : "valid",
					submitHandler : function() {

						saveFormAjax($('.formSubmit'),
								"../usuario/executeCrudUsuario.htm", "",
								$("#dt_basic"), resetForm);
					},
					highlight : function(element, errorClass) {
						setHighlight(element)

					},
					unhighlight : function(element, errorClass) {
						setUnhighlight(element)
					},
					errorPlacement : function(error, element) {
						if (element.parent('.input-group').length) {
							error.insertAfter(element.parent()); // radio/checkbox?
						} else if (element.hasClass('persona')) {
							error.insertAfter(element.next('span')); // select2
						} else {
							error.insertAfter(element); // default
						}
					}
				});

		$(".btn-registrar").click(function() {
			$(".formSubmit").submit();
		});

	};

	// load related plugins

	loadScript(
			"../js/plugin/datatables/jquery.dataTables.min.js",
			function() {
				loadScript(
						"../js/plugin/datatables/dataTables.colVis.min.js",
						function() {
							loadScript(
									"../js/plugin/datatables/dataTables.tableTools.min.js",
									function() {
										loadScript(
												"../js/plugin/datatables/dataTables.bootstrap.min.js",
												function() {

													loadScript(
															"../js/plugin/datatable-responsive/datatables.responsive.min.js",
															loadScript(
																	"../js/plugin/jquery-form/jquery-form.min.js",
																	function() {
																		loadScript(
																				"../js/jsForm/jsForm.js",
																				pagefunction)

																	}))
												});
									});
						});
			});
</script>


