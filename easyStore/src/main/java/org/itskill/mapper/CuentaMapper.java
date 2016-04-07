package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.CuentaPlanContableBean;

public interface CuentaMapper {

	public List<CuentaPlanContableBean> getAllByGrupo (Integer id);
	
}
