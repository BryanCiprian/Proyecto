package org.itskill.services;

import java.util.List;

import org.itskill.bean.TipoClienteBean;
import org.itskill.mapper.TipoClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TipoClienteService {

	@Autowired
	TipoClienteMapper tipoClienteMapper;
	
	public List<TipoClienteBean>listarAll(){
		return tipoClienteMapper.listarAll();
	}
	
	
}
