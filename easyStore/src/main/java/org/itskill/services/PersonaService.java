package org.itskill.services;

import org.itskill.bean.PersonaBean;
import org.itskill.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonaService {

	@Autowired
	PersonaMapper personaMapper ;
	
	public Integer save (PersonaBean personaBean){
        System.out.println("::::::Inicio.PersonaService.save::: nombre :  "+ personaBean.getDescNombre());
       return personaMapper.save(personaBean);
   }
}
