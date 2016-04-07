package org.itskill.services;

import java.util.List;

import org.itskill.bean.TipoPersonaBean;
import org.itskill.mapper.TipoPersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TipoPersonaService {

	@Autowired
	TipoPersonaMapper tipoPersonaMapper;
	
	public List<TipoPersonaBean> listarAll(){
		 System.out.println("LLego");
		 return tipoPersonaMapper.listarAll();
	 }
}
