function setHighlight(element) {
	$(element).parent().removeClass('state-success').addClass('state-error');
}
function setUnhighlight(element) {
	$(element).parent().removeClass('state-error').addClass('state-success');

	if ($(element).hasClass('select2Element')) {
		$(element).parent().addClass('state-success');
	}
}

function interactiveButtons() {
	$(".btnAgregar").show(300);
	$(".btnAgregar").click(function() {
		$(".btn-registrar").show(200);
		$(".btnClose").show(200);
		$(".formSubmit").show(200);
		$(this).hide(200);
	});
	$(".btnClose").click(function() {
		$(".btnAgregar").show(200);
		$(".formSubmit").hide(200);
		$(".btn-registrar").hide(200);
		$(this).hide(200);
	});

}

function deleteRecord(id, urlAjax, dataAjax, dataTableList) {
	console.log("data :" + id)

	$.SmartMessageBox({
		title : "&iexcl;Alerta!",
		content : "¿Esta seguro de eliminar este registro?",
		buttons : '[No][Si]'
	}, function(ButtonPressed) {
		if (ButtonPressed === "Si") {
			$.ajax({
				url : urlAjax,
				data : "opc=delete&id=" + id + dataAjax,
				type : "post",
				success : function(objJson) {
					objJson = JSON.parse(objJson);
					var mensaje = objJson.message;
					if (!objJson.status) {
						alert(objJson.mensaje);
						return;
					} else {
						$.fn.dataTable.Api(dataTableList).ajax.reload();
						alert("eliminado")
					}

				}
			});
		}

	});

}

function saveFormAjax(ObjForm, url, dataS, dataTableList, callback) {

	console.log("dataform :" + (formData == ObjForm.serialize()))
	console.log(opc);
	console.log("data :" + dataAditional)
	if (!(formData == ObjForm.serialize())) {
		$
				.ajax({
					type : "POST",
					url : url,
					data : ObjForm.serialize() + dataAditional + "&opc=" + opc,
					success : function(objJson) {
						objJson = JSON.parse(objJson);
						var mensaje = objJson.message;
						if (!objJson.status) {
							alert(objJson.mensaje);
							return;
						} else {

							$.fn.dataTable.Api(dataTableList).ajax.reload();
							ObjForm[0].reset();
							opc = "save"
							$.smallBox({
										title : "Registrado!",
										content : "<i class='fa fa-clock-o'></i> <i>Se ha almacenado correctamente...</i>",
										color : "#659265",
										iconSmall : "fa fa-check fa-2x fadeInRight animated",
										timeout : 4000
									});
alert("Comerrr")
							callback();
						}
					}
				});
	} else {
		alert("iguales")

	}
}

function list_select(callFunction, objSelect, url, datos, opc, id) {

	var text_html = "";
	objSelect.empty();
	objSelect.removeClass("chosen-select");
	objSelect.append("<option  value='' >Cargando...</option>");
	$.post(url, datos, function(objJson) {
		objJson = JSON.parse(objJson);
		objSelect.empty();
		if (objJson.rpta === -1) {
			alert(objJson.mensaje);
			return;
		}
		var lista = objJson.lista;
		if (lista.length > 0) {
			objSelect.append("<option value=''>[Seleccione]</option>");
			if (opc === "1" | opc === "4") {
				for (var i = 0; i < lista.length; i++) {
					if (id == lista[i].id) {
						text_html += "<option selected value='" + lista[i].id
								+ "'>" + lista[i].nombre + "</option>";
					} else {
						text_html += "<option value='" + lista[i].id + "'>"
								+ lista[i].nombre + "</option>";
					}
				}
			} else {
				for (var i = 0; i < lista.length; i++) {
					text_html += "<option value='" + lista[i].id + "'>"
							+ lista[i].nombre + "</option>";
				}
			}
		} else {
			objSelect.append("<option value=''>[]</option>");
		}
		objSelect.append(text_html);
		text_html = "";
		if (opc === "3" | opc === "4") {
			objSelect.addClass("chosen-select");
			$(".chosen-select").trigger("chosen:updated");
			var config = {
				'.chosen-select' : {
					no_results_text : 'Oops, nada encontrado!',
					allow_single_deselect : true
				},
				'.chosen-select-width' : {
					width : "95%"
				}
			}
			for ( var selector in config) {
				$(selector).chosen(config[selector]);
			}
		}
		callFunction(lista);
	});
	if (opc === "3" | opc === "4") {
		/* sirve para validar cuando es required */
		$.validator.setDefaults({
			ignore : ":hidden:not(select)"
		})
	}

}
function list_selectJavaBeans(objSelect, url, datos, id_select, opcion_select,
		opc, id) {
	var text_html = "";
	objSelect.empty();
	objSelect.removeClass("chosen-select");
	objSelect.append("<option  value='' >Cargando...</option>");
	$.post(url, datos, function(objJson) {
		objJson = JSON.parse(objJson);
		objSelect.empty();
		if (objJson.rpta == -1) {
			alert(objJson.mensaje);
			return;
		}
		var lista = objJson.data;
		if (lista.length > 0) {
			objSelect.append("<option value=''>[Seleccione]</option>");
			if (opc == "1" | opc == "4") {
				for (var i = 0; i < lista.length; i++) {
					if (id == lista[i][id_select]) {
						text_html += "<option selected value='"
								+ lista[i][id_select] + "'>"
								+ lista[i][opcion_select] + "</option>";
					} else {
						text_html += "<option value='" + lista[i][id_select]
								+ "'>" + lista[i][opcion_select] + "</option>";
					}
				}
			} else {
				for (var i = 0; i < lista.length; i++) {
					text_html += "<option value='" + lista[i][id_select] + "'>"
							+ lista[i][opcion_select] + "</option>";
				}
			}
		} else {
			objSelect.append("<option value=''>[NO DATA]</option>");
		}
		objSelect.append(text_html);
		text_html = "";
		if (opc == "3" | opc == "4") {
			objSelect.addClass("chosen-select");
			$(".chosen-select").trigger("chosen:updated");
			var config = {
				'.chosen-select' : {
					no_results_text : 'Oops, nada encontrado!',
					allow_single_deselect : true
				},
				'.chosen-select-width' : {
					width : "95%"
				}
			}
			for ( var selector in config) {
				$(selector).chosen(config[selector]);
			}
		}

	});
	if (opc == "3" | opc == "4") {
		/* sirve para validar cuando es required */
		$.validator.setDefaults({
			ignore : ":hidden:not(select)"
		});
	}

}