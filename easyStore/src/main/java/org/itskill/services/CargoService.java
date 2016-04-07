package org.itskill.services;

import java.util.List;

import org.itskill.bean.CargoBean;

import org.itskill.mapper.CargoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CargoService {
	 @Autowired
	 CargoMapper cargoMapper;
	 
	 public List<CargoBean> listarAll(){
		 System.out.println("LLego");
		 return cargoMapper.listarAll();
	 }
}
