package org.itskill.services;

import java.util.List;

import org.itskill.bean.ClasePlanContableBean;
import org.itskill.mapper.ClaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClaseService {

	@Autowired
	private ClaseMapper claseMapper;

	public List<ClasePlanContableBean> listarClase() {
		return claseMapper.getAll();
	}

}
