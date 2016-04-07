package org.itskill.services;

import java.util.List;

import org.itskill.bean.DistritoBean;
import org.itskill.bean.ZonaBean;
import org.itskill.mapper.ZonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZonaService {

	 @Autowired
	 ZonaMapper zonaMapper;
	 
	/* public List<ZonaBean> listarAll(){
		 System.out.println("LLegó zona ");
		 return zonaMapper.listarAll();
	 }*/
	 
	 public List<ZonaBean> listarZonaPorIdDistrito(DistritoBean distritoBean){
	 return zonaMapper.listarZonaPorIdDistrito(distritoBean);
	 }	 
}
