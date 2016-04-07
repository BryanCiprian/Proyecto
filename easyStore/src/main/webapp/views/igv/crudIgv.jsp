
<div class="row">
	<div class="well">
		<div class="row">
			<div class="col col-sm-6">
				<h1>Inpuesto General a las Ventas</h1>
			</div>
			<div class="col col-sm-3">
				<form id="form-submit" class="smart-form formSubmit"
					style="display: none">
					<section>
						<label class="label">Porcentaje:</label> <label class="input">
							<i class="icon-prepend fa fa-percent"></i> <input type="text"
							name="igv" required="" class="igv" maxlength="5" max="1.0" />
						</label>
					</section>
					<section>
						<label class="label">Año Vigencia:</label> <label class="input">
							<i class="icon-prepend fa fa-percent"></i> <input type="text"
							name="anno" required="" class="anno" maxlength="4" />
						</label>
					</section>
				</form>
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
				<h2>Lista de Igv'S</h2>

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
									class="fa fa-fw fa-file text-muted hidden-md hidden-sm hidden-xs"></i>
									Cantidad</th>
								<th data-hide="phone"><i
									class="fa fa-fw fa-calendar text-muted hidden-md hidden-sm hidden-xs"></i>
									Fec. Creacion</th>
								<th data-hide="phone,tablet"><i
									class="fa fa-fw fa-calendar txt-color-blue hidden-md hidden-sm hidden-xs"></i>
									Fec. Modificacion</th>
								<th data-hide="phone,tablet">Año Vigencia</th>
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
	var opc = "Registrar";
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

		var table1 = $('#dt_basic')
				.DataTable(
						{
							"ajax" : {
								"url" : "../igv/executeCrudIgv.htm",
								"type" : "POST",
								"dataSrc" : "data",
								"data" : {
									"opc" : "Listar"
								}
							},
							"columns" : [ {
								"data" : "id_igv"
							}, {
								"data" : "val_igv"
							}, {
								"data" : "fec_crea"
							}, {
								"data" : "fec_mod",
								"defaultContent" : ""
							}, {
								"data" : "anno_vigencia"
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

								console.log(data.id_igv);
								$('td:eq(5)', row)
										.html(
												'<button class="btn btn-success btn-xs btnEditar" value="' + data.id_igv+ '" ><i class="fa fa-pencil" ></i></button> '
														+ '<button class="btn btn-danger btn-xs btnEliminar" value="' + data.id_igv  + '" ><i class="fa fa-times"></i></button>');

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
															"../igv/executeCrudIgv.htm",
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


