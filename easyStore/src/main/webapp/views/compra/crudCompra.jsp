<style>
.select2-selection__rendered {
	padding-left: 8px;
}
</style>

<div class="smart-style-md">
	<section id="widget-grid" class="">
		<div class="row">
			<article class="col-sm-12 col-md-12 col-lg-12">
				<div class="jarviswidget jarviswidget-color-dark" id="wid-id-0"
					data-widget-colorbutton="false" data-widget-editbutton="false"
					data-widget-togglebutton="false" data-widget-deletebutton="false">
					<header role="heading">
						<span class="widget-icon"> <i class="fa fa-lock"></i>
						</span>
						<h2>
							<strong>Documento de</strong> <i>Compra</i>
						</h2>

						<span class="jarviswidget-loader"><i
							class="fa fa-refresh fa-spin"></i></span>
					</header>

					<div>
						<div class="row">
							<div class="col-sm-6 col-md-6 col-lg-8">
								<div class="well well-sm well-light text-center">
									<h4>TEXTILES EL TELAR S.A.C.</h4>
									<h1>"Tejidos TRICOLOR"</h1>
									<small>Av Miguel Grau 892 - La Victoria - Lima</small> <br>
									<small>Jr. Callao 134 - Lima</small>
								</div>
							</div>
							<div class="col-sm-6 col-md-6 col-lg-4">
								<div class="well well-sm well-light text-center">
									<h1>R.U.C. 2010072318</h1>
									<h1>FACTURA</h1>
									<div class="row">
										<div class="col col-12">
											<div class="col-xs-2"></div>
											<div class="col-xs-3">
												<input type="text" name="user" required=""
													class="form-control input-sm text-center" maxlength="4"
													placeholder="Serie" />
											</div>
											<div class="col-xs-1">-</div>
											<div class="col-xs-4">
												<input type="text" name="user" required=""
													class="form-control input-sm text-center" maxlength="7"
													placeholder="Correlativo" />
											</div>
											<div class="col-xs-2"></div>
										</div>

									</div>
								</div>
							</div>
						</div>

						<form id="form-submit" class="smart-form formSubmit">
							<fieldset>
								<div class="col col-4">
									<div class="form-group">
										<label class="col-md-3 control-label">Proveedor</label>
										<div class="col-md-9">
											<select style="width: 100%" class="persona input-sm"
												required="required" name="persona">
												<option value="">[Seleccione]</option>
											</select>
										</div>
									</div>
								</div>
								<section class="col col-4">
									<label class="col-md-3 control-label">Tipo de moneda</label>
									<div class="col-md-9">
										<select style="width: 100%" class="select2 input-sm"
											required="required" name="persona">
											<option value="">[Seleccione]</option>
											<option value="1">Soles</option>
											<option value="2">Dolares</option>
											<option value="3">Euros</option>
										</select>
									</div>

								</section>
								<section class="col col-4">
									<label class="col-md-3 control-label">Tipo de Documento</label>
									<div class="col-md-9">
										<select style="width: 100%" class="select2 input-sm"
											required="required" name="persona">
											<option value="">[Seleccione]</option>
											<option value="1">Item 1</option>
											<option value="2">Item 2</option>
											<option value="3">Item 3</option>
										</select>
									</div>

								</section>
								<section class="col col-4">
									<label class="col-md-3 control-label">Fecha Compra </label>
									<div class="col-md-9">
										<label class="input"> <i
											class="icon-prepend fa fa-calendar"></i> <input type="text"
											name="inicio" required="" class="inicio input-sm" id="from"
											placeholder="From" />
										</label>
									</div>
								</section>
								<section class="col col-4">
									<label class="col-md-3 control-label">Monto Total</label>
									<div class="col-md-9">
										<label class="input"> <i
											class="icon-prepend fa fa-money"></i> <input type="text"
											name="passwordConfirm" required=""
											class="passwordConfirm input-sm" maxlength="4" />
										</label>
									</div>
								</section>
								<section class="col col-4">
									<label class="col-md-3 control-label">Fecha Recepcion</label>
									<div class="col-md-9">
										<label class="input"> <i
											class="icon-prepend fa fa-calendar"></i> <input type="text"
											name="fin" required="" class="fin input-sm" id="to" />
										</label>
									</div>

								</section>

							</fieldset>
							<fieldset>
								<legend>Articulos</legend>
								<div class="">
									<div class="row">
										<section class="col">
											<br>
											<p class="text-center font-lg">1</p>
										</section>
										<section class="col col-2">
											<label class="label">Cantidad</label> <label class="input">
												<input class="form-control input-sm" id="spinner-decimal"
												name="spinner-decimal" value="0.00">
											</label>
										</section>
										<section class="col col-2">
											<label class="label">Articulo:</label> <select
												style="width: 100%" class="select2 articulo input-sm"
												required="required" name="articulo">
												<option value="">[Seleccione]</option>
												<option value="1">Item 1</option>
												<option value="2">Item 2</option>
												<option value="3">Item 3</option>
											</select>
										</section>
										<section class="col col-2">
											<label class="label">Almacen:</label> <select
												style="width: 100%" class="select2 input-sm"
												required="required" name="almacen">
												<option value="">[Seleccione]</option>
												<option value="1">Item 1</option>
												<option value="2">Item 2</option>
												<option value="3">Item 3</option>
											</select>
										</section>
										<section class="col col-2">
											<label class="label">Precio Unit:</label> <label
												class="input"> <i class="icon-prepend fa fa-dollar"></i>
												<input type="text" name="user" required=""
												class="user input-sm" maxlength="4" />
											</label>
										</section>
										<section class="col col-2">
											<label class="label">Precio Total:</label> <label
												class="input"> <i class="icon-prepend fa fa-dollar"></i>
												<input type="text" name="user" required=""
												class="user input-sm" maxlength="4" />
											</label>
										</section>

										<section class="col col-1">
											<button type="button"
												class="btn btn-primary btn-circle btn-lg btnAddArticulo"
												value="1">
												<i class="glyphicon glyphicon-plus"></i>
											</button>
										</section>

									</div>
								</div>
								<div class="divArticulo"></div>
							</fieldset>
							<div class="row">
								<section class="col col-sm-12">
									<button type="button" id="btn-registrar"
										class="btn btn-default btn-circle btn-lg"
										style="float: right; display:" rel="tooltip"
										data-placement="top" data-original-title="Guardar">
										<i class="glyphicon glyphicon-floppy-disk"></i>
									</button>
									<button type="button" class="btn btn-danger btn-circle btn-lg"
										style="float: right; display:" rel="tooltip"
										data-placement="top" data-original-title="Cancelar">
										<i class="glyphicon glyphicon-remove"></i>
									</button>
								</section>
							</div>


						</form>

					</div>
				</div>

			</article>
		</div>
		<div class="row">
			<article class="col-sm-12 col-md-12 col-lg-12">
				<div class="jarviswidget jarviswidget-color-magenta" id="wid-id-1"
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
						<h2>Compras Realizadas</h2>

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


			</article>
		</div>
	</section>
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
	var opc = "Registrar";
	var dataAditional = "";
	var formData = "";
	$("#spinner-decimal").spinner({
		step : 0.01,
		numberFormat : "n"
	});

	$(".btnAddArticulo").click(function() {
		addItemArticulo($(".divArticulo"), $(this).val());
	});

	function addItemArticulo(objDivArticulo, numItems) {
		
		numItems++;
		var textHtml = '<div class="row">' + '<section class="col">' + '<br>'
				+ '<p class="text-center font-lg">'
				+ numItems
				+ '</p>'
				+ '</section>'
				+ '<section class="col col-2">'
				+ '<label class="label">Cantidad</label> <label class="input">'
				+ '<input class="form-control" id="spinner-decimal" 	name="spinner-decimal" value="0.00"></label>'
				+ '</section>'
				+ '<section class="col col-2">'
				+ '<label class="label">Articulo:</label> <select style="width: 100%" class="select2 articulo" required="required" name="articulo">'
				+ '<option value="">[Seleccione]</option>		<option value="1">Item 1</option> <option value="2">Item 2</option> <option value="3">Item 3</option>'
				+ '	</select>'
				+ '</section>'
				+ '<section class="col col-2">'
				+ '<label class="label">Almacen:</label> <select style="width: 100%" class="select2" required="required" name="almacen">'
				+ '<option value="">[Seleccione]</option> <option value="1">Item 1</option> 	<option value="2">Item 2</option> <option value="3">Item 3</option>'
				+ '</select>'
				+ '</section>'
				+ '<section class="col col-2">'
				+ '<label class="label">Precio Unit:</label> <label class="input">'
				+ '<i class="icon-prepend fa fa-dollar"></i> <input type="text" name="user" required="" class="user" maxlength="4" />'
				+ '</label>'
				+ '</section>'
				+ '<section class="col col-2"> <label class="label">Precio Total:</label> <label class="input">'
				+ '<i class="icon-prepend fa fa-dollar"></i> <input type="text" name="user" required="" class="user" maxlength="4" />'
				+ '</label>'
				+ '</section>'
				+ '<section class="col col-1">'
				+ '<button type="button" class="btn btn-danger btn-circle btn-lg" value="" ><i class="glyphicon glyphicon-minus"></i></button>'
				+ '</section>' + '</div>';
		objDivArticulo.append(textHtml);
		$(".btnAddArticulo").val(numItems);
	}

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
			onClose : function(selectedDate) {
				$("#from").datepicker("option", "maxDate", selectedDate);
			}
		});

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
							+ lista[t].descNombre + ' ' + lista[t].apePaterno
							+ ' ' + lista[t].apeMaterno + '</option>';
				}
				select.append(textHtml);
				select.select2();
			}
		});

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
																url : "../igv/executeCrudIgv.htm",
																data : "opc="
																		+ opc
																		+ "&id="
																		+ id,
																type : "POST",
																success : function(
																		objJson) {
																	objJson = JSON
																			.parse(objJson);
																	var mensaje = objJson.message;
																	var item = objJson.showItem;
																	$(".igv")
																			.val(
																					item["val_igv"]);
																	$(".anno")
																			.val(
																					item["anno_vigencia"]);

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
												});
							}
						});

		/* END BASIC */
		interactiveButtons();

		function setHighlight(element) {
			$(element).closest('.input').removeClass('has-success').addClass(
					'state-error');
			$(element).closest('.select').removeClass('has-success').addClass(
					'state-error');
			$(element).closest('.textarea').removeClass('has-success')
					.addClass('state-error');
		}

		function setUnhighlight(element) {
			$(element).closest('.input').removeClass('state-error').addClass(
					'state-success');
			$(element).closest('.select').removeClass('state-error').addClass(
					'state-success');
			$(element).closest('.textarea').removeClass('state-error')
					.addClass('state-success');
		}

		$('.formSubmit')
				.validate(
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
							messages : {
								descripcion : "Ingrese una descripcion del producto",
								modelo : "Ingrese un modelo",
								codigoArticulo : {
									required : "Ingrese un código"
								}
							},
							success : "valid",
							submitHandler : function() {

								saveFormAjax($('.formSubmit'),
										"../igv/executeCrudIgv.htm", "",
										$("#dt_basic"));
							},

							highlight : function(element) {
								setHighlight(element)
							},
							unhighlight : function(element) {
								setUnhighlight(element)
							},
							errorPlacement : function(error, element) {
								if (element.parent().length) {
									error.insertAfter(element.parent());
								} else {
									error.insertAfter(element);
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


