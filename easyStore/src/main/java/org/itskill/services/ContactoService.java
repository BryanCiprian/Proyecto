package org.itskill.services;

import org.itskill.bean.ContactoBean;
import org.itskill.mapper.ContactoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactoService {

	@Autowired
	ContactoMapper contactoMapper;
	
	public Integer save (ContactoBean contactoBean){
        System.out.println("::::::Inicio.ContactoService.save::: tel :  "+ contactoBean.getTelFijo1());
       return contactoMapper.save(contactoBean);
   }
}
