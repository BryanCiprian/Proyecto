package org.itskill.services;

import java.util.List;

import org.itskill.bean.CategoriaBean;
import org.itskill.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriaService {

	
	@Autowired
	private CategoriaMapper categoriaMapper;
	
	public List<CategoriaBean> getAllCategoria(){
		return categoriaMapper.getAll();
	}
	
}
