package org.itskill.services;

import java.util.List;

import org.itskill.bean.DistritoBean;
import org.itskill.bean.ProvinciaBean;
import org.itskill.mapper.DistritoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DistritoService {

	@Autowired
	DistritoMapper distritoMapper;
	
	public List<DistritoBean> listarDistritoPorIdProvincia(ProvinciaBean provinciaBean){
		return distritoMapper.listarDistritoPorIdProvincia(provinciaBean);
	}
	
}
