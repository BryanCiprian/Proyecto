package org.itskill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.ArticuloBean;
import org.itskill.bean.ProcedenciaBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Component
public interface ArticuloMapper {

	public Integer save(ArticuloBean articulo);

	public void deleteArticulo(ArticuloBean articulo);

	public List<ArticuloBean> getAll();

	public Integer edit(ArticuloBean articulo);

	public List<ProcedenciaBean> getAllProcedencia();

}
