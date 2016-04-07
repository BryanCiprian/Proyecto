package org.itskill.services;

import java.util.List;

import org.itskill.bean.DepartamentoBean;
import org.itskill.bean.ProvinciaBean;
import org.itskill.mapper.ProvinciaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProvinciaService {

	@Autowired
	ProvinciaMapper provinciaMapper;
	
	public List<ProvinciaBean> listarProvinciaPorIdDepartamento(DepartamentoBean departamentoBean){
		return provinciaMapper.listarProvinciaPorIdDepartamento(departamentoBean);
	}
}
