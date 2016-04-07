package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.DepartamentoBean;
import org.itskill.bean.ProvinciaBean;

public interface ProvinciaMapper {

	public List<ProvinciaBean> listarProvinciaPorIdDepartamento(DepartamentoBean departamentoBean);
}
