package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.GrupoPlanContableBean;

public interface GrupoMapper {

	public List<GrupoPlanContableBean> getAllByClase(Integer id);

}
