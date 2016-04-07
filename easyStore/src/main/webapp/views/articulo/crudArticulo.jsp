
<div class="row">
	<div class="well">
		<h1>Articulos</h1>
		<div class="row ">
			<section class="col col-sm-12">
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
		<form id="form-articulo" class="smart-form formSubmit"
			style="display: none">
			<div class="row">
				<section class="col col-2">
					<label class="label"><strong>Categoria :</strong></label> <label
						class="select"> <i class="icon-append fa fa-list"></i> <select
						name="categoria" required="" class="categoria">
							<option value="">[Seleccione]</option>
					</select>
					</label>
				</section>
				<section class="col col-2">
					<label class="label"><strong>Existencia :</strong></label> <label
						class="select"> <i class="icon-append fa fa-list"></i> <select
						name="existencia" required="" class="existencia">
							<option value="">[Seleccione]</option>
					</select>
					</label>

				</section>
				<section class="col col-2">
					<label class="label"><strong>Código Articulo :</strong></label> <label
						class="input"> <i class="icon-prepend fa fa-user"></i> <input
						type="text" name="codigoArticulo" required=""
						class="codigoArticulo" />
					</label>
				</section>

				<section class="col col-3">
					<label class="label"><strong>Nombre de Articulo:</strong></label> <label
						class="input"> <i class="icon-prepend fa fa-user"></i> <input
						type="text" name="nombreArticulo" required=""
						class="nombreArticulo" />
					</label>
				</section>
				<section class="col col-3">
					<label class="label"><strong>Unidad de Medida :</strong></label> <label
						class="select"> <i class="icon-append fa fa-calendar"></i>
						<select name="unidadMedida" required="" class="unidadMedida">
							<option value="">[Seleccione]</option>
					</select>
					</label>
				</section>
			</div>
			<section class="col col-4">
				<label class="textarea"> <i
					class="icon-append fa fa-comment"></i> <textarea rows="3"
						name="modelo" placeholder="Modelo Del Aticulo" required=""
						class="modelo"></textarea>
				</label>
			</section>
			<section class="col col-4">
				<label class="textarea"> <i
					class="icon-append fa fa-comment"></i> <textarea rows="3"
						name="descripcion" placeholder="Caracteristicas del Articulo"
						required="" class="descripcion"></textarea>
				</label>
			</section>
			<section class="col col-4">
				<label class="textarea"><i class="icon-append fa fa-comment"></i>
					<textarea rows="3" name="diseno" placeholder="Diseño del Aticulo"
						required="" class="diseno"></textarea> </label>
			</section>
			<div class="row ">
				<section class="col col-2">
					<label class="label"><strong>Stock Mínimo:</strong></label> <label
						class="input"> <i class="icon-prepend fa fa-user"></i> <input
						type="text" name="stockMin" required="" class="stockMin" />
					</label>
				</section>
				<section class="col col-2">
					<label class="label"><strong>Stock Máximo:</strong></label> <label
						class="input"> <i class="icon-prepend fa fa-user"></i> <input
						type="text" name="stockMax" required="" class="stockMax" />
					</label>
				</section>
				<section class="col col-3">
					<label class="label"><strong>Marca :</strong></label> <label
						class="select"><select name="marca" class="marca">
							<option value="">[Seleccione]</option>
					</select> </label>
				</section>
				<section class="col col-3">
					<label class="label"><strong>Procedencia :</strong></label> <label
						class="select"><select name="procedencia"
						class="procedencia">
							<option value="">[Seleccione]</option>
					</select> </label>
				</section>
				<section class="col col-2">
					<label class="label">Imagen :</label> <label class="input">
						<input type="file" class=imgArticulo name="imgArticulo">
					</label>
				</section>
			</div>
			<div class="row">
				<section class="col col-3">
					<label class="label"><strong>Clase :</strong></label> <label
						class="select"> <i class="icon-append fa fa-calendar"></i>
						<select name="clase" required="" class="clase">
							<option value="">[Seleccione]</option>
					</select>
					</label>
				</section>
				<section class="col col-3">
					<label class="label"><strong>Grupo :</strong></label> <label
						class="select"> <i class="icon-append fa fa-calendar"></i>
						<select name="grupo" required="" class="grupo">
							<option value="">[Seleccione]</option>
					</select>
					</label>
				</section>
				<section class="col col-3">
					<label class="label"><strong>Cuenta :</strong></label> <label
						class="select"> <i class="icon-append fa fa-calendar"></i>
						<select name="cuenta" required="" class="cuenta">
							<option value="">[Seleccione]</option>
					</select>
					</label>
				</section>
				<section class="col col-3">
					<label class="label"><strong>Sub Cuenta :</strong></label> <label
						class="select"> <i class="icon-append fa fa-calendar"></i>
						<select name="subCuenta" required="" class="subCuenta">
							<option value="">[Seleccione]</option>
					</select>
					</label>
				</section>
			</div>


		</form>
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
				<h2>Lista de Articulos</h2>

			</header>
			<div>

				<!-- widget edit box -->
				<div class="jarviswidget-editbox">
					<!-- This area used as dropdown edit box -->

				</div>
				<div class="widget-body no-padding">
					<table id="dt_basic"
						class="table table-striped table-bordered table-hover"
						width="100%">
						<thead>
							<tr>
								<td class="text-center semi-bold">Nro</td>
								<td class="text-center semi-bold">Codigo</td>
								<td class="text-center semi-bold">Imagen</td>
								<td class="text-center semi-bold">Nombre</td>
								<td class="text-center semi-bold">Caracteristica</td>
								<td class="text-center semi-bold">Diseño</td>
								<td class="text-center semi-bold">Modelo</td>
								<td class="text-center semi-bold">Stock Min</td>
								<td class="text-center semi-bold">Stock Max</td>
								<td class="text-center semi-bold">Marca</td>
								<td class="text-center semi-bold">Existencia</td>
								<td class="text-center semi-bold">Unid. Med.</td>
								<td class="text-center semi-bold">Procedencia</td>
								<td class="text-center semi-bold" style="width: 8%">Acciones</td>
							</tr>
						</thead>
						<tbody class="tbodys">
						</tbody>
					</table>
				</div>
			</div>
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
	 * TO LOAD A SCRIPT:
	 * var pagefunction = function (){ 
	 *  loadScript(".../plugin.js", run_after_loaded);	
	 * }
	 * 
	 * OR
	 * 
	 * loadScript(".../plugin.js", run_after_loaded);
	 */

	// PAGE RELATED SCRIPTS
	// pagefunction
	function resetForm() {
		$(".btnClose").click();
	}

	function saveFile(objFile, urlPost, id) {
		if (objFile.get(0).files[0].size <= 500000) {
			var jForm = new FormData();
			jForm.append("id", id);
			jForm.append("archivo", objFile.get(0).files[0]);
			jForm.append("concatDataFile", "35");
			$
					.ajax(
							{
								type : "POST",
								url : urlPost,
								cache : false,
								processData : false,
								contentType : false,
								data : jForm,
								async : false,
								success : function(objJson) {
									objJson = JSON.parse(objJson);
									console.log(objJson);
									if (!objJson.status) {
										$
												.smallBox({
													title : "¡Alerta!",
													content : "<i class='fa fa-clock-o'></i> <i>Ha ocurrido un error al procesar su archivo...</i>",
													color : "#C46A69",
													iconSmall : "fa fa-cloud bounce animated",
													timeout : 7000
												});
									} else if (objJson.status) {
										$
												.smallBox({
													title : "¡Felicitaciones!",
													content : "<i class='fa fa-clock-o'></i> <i>Su archivo se ha subido con éxito...</i>",
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

	var opc = "save";
	var dataAditional = "";
	var formData = "";

	/* BASIC ;*/
	var responsiveHelper_dt_basic = undefined;
	var responsiveHelper_datatable_fixed_column = undefined;
	var responsiveHelper_datatable_col_reorder = undefined;
	var responsiveHelper_datatable_tabletools = undefined;

	var breakpointDefinition = {
		tablet : 1024,
		phone : 480
	};
	var pagefunction = function() {
		// clears memory even if nothing is in the function

		list_selectJavaBeans($(".categoria"),
				"../categoria/executeCrudCategoria.htm", "opc=list",
				"id_categoria", "des_categoria");

		list_selectJavaBeans($(".existencia"),
				"../documentoInventario/executeCrudDocInvent.htm",
				"opc=listExistencia", "id_doc_inventario", "des_doc");

		list_selectJavaBeans($(".unidadMedida"),
				"../documentoInventario/executeCrudDocInvent.htm",
				"opc=listUnidadMedida", "id_doc_inventario", "des_doc");

		list_selectJavaBeans($(".marca"), "../admin/listMarca.htm", "",
				"idMarca", "nomMarca");

		list_selectJavaBeans($(".procedencia"), "../articulo/regArt.htm",
				"opc=listarProcedencia", "id_proc", "des_proc");

		/*SELECT ANIDADOS*/

		list_selectJavaBeans($(".clase"), "../clase/executeCrudClase.htm",
				"opc=list", "id_clase", "des_clase");

		$(".clase").change(
				function() {
					list_selectJavaBeans($(".grupo"),
							"../grupo/executeCrudGrupo.htm",
							"opc=listByClase&id=" + $(this).val(), "id_grupo",
							"des_grupo");
				});

		$(".grupo").change(
				function() {
					list_selectJavaBeans($(".cuenta"),
							"../cuenta/executeCrudCuenta.htm",
							"opc=listCuentaByIdGrupo&id=" + $(this).val(),
							"id_cuenta", "des_cuenta");

				});

		$(".cuenta").change(
				function() {
					list_selectJavaBeans($(".subCuenta"),
							"../subCuenta/executeCrudSubCuenta.htm",
							"opc=listSubCuentaByIdCuenta&id=" + $(this).val(),
							"id_sub_cuenta", "des_sub_cuenta");
				});

		$('.formSubmit').validate(
				{
					// Rules for form validation
					rules : {
						descripcion : {
							required : true
						},
						modelo : {
							required : true
						},
						codigoArticulo : {
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
								"../articulo/regArt.htm", "", $("#dt_basic"),
								function() {
									alert()
									//saveFile($(".imgArticulo"),"../articulo/saveImageArticulo.htm")
								});
					},
					highlight : function(element) {
						setHighlight(element)
					},
					unhighlight : function(element) {
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

		var table1 = $('#dt_basic')
				.DataTable(
						{
							"ajax" : {
								"url" : "../articulo/regArt.htm",
								"type" : "POST",
								"dataSrc" : "data",
								"data" : {
									"opc" : "list"
								}
							},
							"columns" : [ {
								"data" : "idArticulo",
								"defaultContent" : ""
							}, {
								"data" : "codArt",
								"defaultContent" : ""
							}, {
								"data" : "estado",
								"defaultContent" : ""
							}, {
								"data" : "desArt",
								"defaultContent" : ""
							}, {
								"data" : "carArt",
								"defaultContent" : ""
							}, {
								"data" : "disArt",
								"defaultContent" : ""
							}, {
								"data" : "modArt",
								"defaultContent" : ""
							}, {
								"data" : "stkMinArt",
								"defaultContent" : ""
							}, {
								"data" : "stkMaxArt",
								"defaultContent" : ""
							}, {
								"data" : "marcaBean.nomMarca",
								"defaultContent" : ""
							}, {
								"data" : "id_tipo_existencia.des_doc",
								"defaultContent" : ""
							}, {
								"data" : "id_unidad_medida.des_doc",
								"defaultContent" : ""
							}, {
								"data" : "procedenciaBean.des_proc",
								"defaultContent" : ""
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

								console.log(data.idArticulo);
								$('td:eq(13)', row)
										.html(
												'<button class="btn btn-success btn-xs btnEditar" value="' + data.idArticulo+ '" ><i class="fa fa-pencil" ></i></button> '
														+ '<button class="btn btn-danger btn-xs btnEliminar" value="' + data.idArticulo  + '" ><i class="fa fa-times"></i></button>');

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
																	objJson = JSON
																			.parse(objJson);
																	var mensaje = objJson.message;
																	var item = objJson.showItem;
																	$(
																			".persona, .select2")
																			.hide();
																	$(
																			".persona")
																			.attr(
																					"disabled",
																					true);
																	$(
																			".personaReadOnly")
																			.show(
																					200);
																	$(
																			".personaReadOnly")
																			.empty();
																	$(
																			".personaReadOnly")
																			.append(
																					"<option>"
																							+ item["nombres"]
																							+ "</option>");
																	$(".user")
																			.val(
																					item["var_usuario"]);
																	$('#from')
																			.datepicker(
																					'setDate',
																					item["fec_inicio"]);
																	$('#to')
																			.datepicker(
																					'setDate',
																					item["fec_fin"]);
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
								$(".btnEliminar").click(
										function() {
											deleteRecord($(this).val(),
													"../articulo/regArt.htm",
													"", $("#dt_basic"));

											listPersona()
										});
							}
						});

		/* END BASIC */

		interactiveButtons();

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


</html>