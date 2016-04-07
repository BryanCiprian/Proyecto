package org.itskill.mapper;

 

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.TipoCambioBean;
import org.itskill.bean.UsuarioBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author usuario
 */
@Component
public interface TipoCambioMapper {
 
   
    public Integer save(TipoCambioBean tCambio);
    public Integer edit(TipoCambioBean tCambio);
    public Integer delete(TipoCambioBean tCambio);
    
    public Integer verificarTC();
    public Double obtenerTC();
    
    public List<TipoCambioBean> getAll();
}
