
<style>
.btnAgregar {
	-webkit-box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
	-moz-box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
	box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
}

.btn-registrar {
	-webkit-box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
	-moz-box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
	box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
}

.btnClose {
	-webkit-box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
	-moz-box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
	box-shadow: 2px 3px 6px 0px rgba(50, 50, 50, 0.5);
}
</style>



<div class="row">
	<div class="well">
		<center>
			<h1>Tipo de Cambio</h1>
		</center>
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
		<form id="form-tcambio" class="smart-form form_tcambio"
			style="display: none">
			<div class="row">
				<section class="col col-4">
					<label class="label"><strong>Venta :</strong></label> <label
						class="input"> <i class="icon-prepend fa fa-user"></i> <input
						type="text" name="venta" required="" class="venta" />
					</label>
				</section>
				<section class="col col-4">
					<label class="label"><strong>Compra :</strong></label> <label
						class="input"> <i class="icon-prepend fa fa-user"></i> <input
						type="text" name="compra" required="" class="compra" />
					</label>
				</section>
				<section class="col col-4">
					<label class="label"><strong>Fecha :</strong></label> <label
						class="select"> <i class="icon-append fa fa-calendar"></i>
						<input type="date" name="fecha" class="fecha" />
					</label>
				</section>
			</div>
		</form>
	</div>
</div>


<div class="row">
	<div class="well">
		<div class="table-responsive">
			<table class="table table-bordered table-hover table-striped">
				<thead>
					<tr>
						<td class="text-center semi-bold">Nro</td>
						<td class="text-center semi-bold">Venta</td>
						<td class="text-center semi-bold">Compra</td>
						<td class="text-center semi-bold">Fecha</td>
						<td class="text-center semi-bold" style="width: 8%">Acciones</td>
					</tr>
				</thead>
				<tbody class="tbodys">
				</tbody>
			</table>
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
	function listarTipoCambio() {
		var tbody = $(".tbodys");
		$.ajax({
			url : "../caja/executeCrudTipoCambio.htm",
			data : "opc=Listar",
			type : "POST",
			success : function(objJson) {
				objJson = JSON.parse(objJson);
				// alert(objJson.tbody);
				tbody.append(objJson.tbody);

			}
		});

	}

	function saveTipoCambio() {
		$
				.ajax({
					type : "POST",
					url : "../caja/executeCrudTipoCambio.htm",
					data : "opc=Registrar&" + $("#form-tcambio").serialize()
				})
				.done(
						function(objJson) {
							objJson = JSON.parse(objJson);
							if (!objJson.status) {
								alert(objJson.mensaje);
								return;
							} else {
								listarTipoCambio();
								$("#form-tcambio")[0].reset();
								$
										.smallBox({
											title : "¡Registrado!",
											content : "<i class='fa fa-clock-o'></i> <i>El Tipo de cambio se ha registrado correctamente...</i>",
											color : "#659265",
											iconSmall : "fa fa-check fa-2x fadeInRight animated",
											timeout : 4000
										});
							}
						});

	}

	var pagefunction = function() {
		// clears memory even if nothing is in the function
		$(".btnAgregar").show(300);
		$(".btnAgregar").click(function() {
			$(".btn-registrar").show(200);
			$(".btnClose").show(200);
			$(".form_tcambio").show(200);
			$(this).hide(200);
		});
		$(".btnClose").click(function() {
			$(".btnAgregar").show(200);
			$(".form_tcambio").hide(200);
			$(".btn-registrar").hide(200);
			$(this).hide(200);
		});

		listarTipoCambio();
		//	listar();
		$('.form_tcambio').validate(
				{
					// Rules for form validation
					rules : {
						venta : {
							required : true
						},
						compra : {
							required : true
						},
						fecha : {
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
						saveTipoCambio();
					},

					highlight : function(element) {
						$(element).closest('.input').removeClass('has-success')
								.addClass('state-error');
						$(element).closest('.select')
								.removeClass('has-success').addClass(
										'state-error');
						$(element).closest('.textarea').removeClass(
								'has-success').addClass('state-error');
					},
					unhighlight : function(element) {
						$(element).closest('.input').removeClass('state-error')
								.addClass('state-success');
						$(element).closest('.select')
								.removeClass('state-error').addClass(
										'state-success');
						$(element).closest('.textarea').removeClass(
								'state-error').addClass('state-success');
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
			$(".form_tcambio").submit();
		});

	};

	// end pagefunction
	loadScript("../js/plugin/jquery-form/jquery-form.min.js", loadScript(
			"../js/jsForm/jsForm.js", pagefunction));
</script>


</html>