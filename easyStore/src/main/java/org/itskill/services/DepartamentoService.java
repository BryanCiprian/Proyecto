package org.itskill.services;

import java.util.List;

import org.itskill.bean.DepartamentoBean;
import org.itskill.mapper.DepartamentoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartamentoService {
	
	@Autowired
	DepartamentoMapper departamentoMapper;
	
	public List<DepartamentoBean> listarAll(){
		return departamentoMapper.listarAll();
	}

}
