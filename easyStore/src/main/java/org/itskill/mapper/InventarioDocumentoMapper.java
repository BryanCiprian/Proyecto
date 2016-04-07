package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.AlmacenBean;
import org.itskill.bean.InventarioDocumentoBean;
import org.itskill.bean.UsuarioBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Component
public interface InventarioDocumentoMapper {
 
    public List<InventarioDocumentoBean>  listarTipoMedioPago();
    public List<InventarioDocumentoBean>  listarTipoDocumentoIdentidad();
    public List<InventarioDocumentoBean>  listarEntidadFinanciera();
    public List<InventarioDocumentoBean>  listarTipoMoneda();
    public List<InventarioDocumentoBean>  listarTipoExistencia();
    public List<InventarioDocumentoBean>  listarTipoExistenciaComercial();
    public List<InventarioDocumentoBean>  listarUnidadMedida();
    public List<InventarioDocumentoBean>  listarUnidadMedidaComercial();
    public List<InventarioDocumentoBean>  listarTipoIntangible();
    public List<InventarioDocumentoBean>  listarCodigoLibroRegistro();
    public List<InventarioDocumentoBean>  listarCodigoCuentaContable();
    public List<InventarioDocumentoBean>  listarTipoComprobantePago();
    public List<InventarioDocumentoBean>  listarTipoComprobantePagoComercial();

    public List<InventarioDocumentoBean>  listarCodigoAduana();
    public List<InventarioDocumentoBean>  listarTipoOperacion();
    
    public List<InventarioDocumentoBean>  listarDocumentoCompra();
}
