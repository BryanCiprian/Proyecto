package org.itskill.services;

import java.util.List;

import org.itskill.bean.GrupoPlanContableBean;
import org.itskill.mapper.GrupoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GrupoService {

	@Autowired
	private GrupoMapper grupoMapper;
	public List<GrupoPlanContableBean> listGrupoByIdClase(Integer id) {
		return grupoMapper.getAllByClase(id);
	}
}
