package org.itskill.services;

import org.itskill.bean.EmpleadoBean;
import org.itskill.mapper.EmpleadoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoService {

	@Autowired
	EmpleadoMapper empleadoMapper;
	
	public Integer save (EmpleadoBean empleadoBean){
		  System.out.println("::::::Inicio.EmpleadoService.save::: nombre :  "+ empleadoBean.getFecInicioContrato());
		  return empleadoMapper.save(empleadoBean);
	}
	
}
