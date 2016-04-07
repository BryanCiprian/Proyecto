/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.services;

import java.util.List;

import org.itskill.bean.AlmacenBean;
import org.itskill.bean.InventarioDocumentoBean;
import org.itskill.mapper.AlmacenMapper;
import org.itskill.mapper.InventarioDocumentoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Component
public class InventarioDocumentoService {

	@Autowired
	InventarioDocumentoMapper inventarioDocumentoMapper;

	public List<InventarioDocumentoBean> listarTipoMedioPago() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoMedioPago:::");
		return inventarioDocumentoMapper.listarTipoMedioPago();
	}

	public List<InventarioDocumentoBean> listarTipoDocumentoIdentidad() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoDocumentoIdentidad:::");
		return inventarioDocumentoMapper.listarTipoDocumentoIdentidad();
	}

	public List<InventarioDocumentoBean> listarEntidadFinanciera() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarEntidadFinanciera:::");
		return inventarioDocumentoMapper.listarEntidadFinanciera();
	}

	public List<InventarioDocumentoBean> listarTipoMoneda() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoMoneda:::");
		return inventarioDocumentoMapper.listarTipoMoneda();
	}

	public List<InventarioDocumentoBean> listarTipoExistencia() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoExistencia:::");
		return inventarioDocumentoMapper.listarTipoExistencia();
	}

	public List<InventarioDocumentoBean> listarTipoExistenciaComercial() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoExistenciaComercial:::");
		return inventarioDocumentoMapper.listarTipoExistenciaComercial();
	}

	public List<InventarioDocumentoBean> listarUnidadMedida() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarUnidadMedida:::");
		return inventarioDocumentoMapper.listarUnidadMedida();
	}

	public List<InventarioDocumentoBean> listarUnidadMedidaComercial() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarUnidadMedidaComercial:::");
		return inventarioDocumentoMapper.listarUnidadMedidaComercial();
	}

	public List<InventarioDocumentoBean> listarTipoIntangible() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoIntangible:::");
		return inventarioDocumentoMapper.listarTipoIntangible();
	}

	public List<InventarioDocumentoBean> listarCodigoLibroRegistro() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarCodigoLibroRegistro:::");
		return inventarioDocumentoMapper.listarCodigoLibroRegistro();
	}

	public List<InventarioDocumentoBean> listarCodigoCuentaContable() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarCodigoCuentaContable:::");
		return inventarioDocumentoMapper.listarCodigoCuentaContable();
	}

	public List<InventarioDocumentoBean> listarTipoComprobantePago() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoComprobantePago:::");
		return inventarioDocumentoMapper.listarTipoComprobantePago();
	}

	public List<InventarioDocumentoBean> listarTipoComprobantePagoComercial() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoComprobantePagoComercial:::");
		return inventarioDocumentoMapper.listarTipoComprobantePagoComercial();
	}

	public List<InventarioDocumentoBean> listarCodigoAduana() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarCodigoAduana:::");
		return inventarioDocumentoMapper.listarCodigoAduana();
	}

	public List<InventarioDocumentoBean> listarTipoOperacion() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarTipoOperacion:::");
		return inventarioDocumentoMapper.listarTipoOperacion();
	}

	public List<InventarioDocumentoBean> listarDocumentoCompra() {
		System.out.println("::::::Inicio.InventarioDocumentoService.listarDocumentoCompra:::");
		return inventarioDocumentoMapper.listarDocumentoCompra();
	}

}
