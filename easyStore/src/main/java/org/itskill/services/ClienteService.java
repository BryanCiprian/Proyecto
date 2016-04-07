package org.itskill.services;

import org.itskill.bean.ClienteBean;
import org.itskill.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteService {

	@Autowired
	ClienteMapper clienteMapper;
	
	public Integer save (ClienteBean clienteBean){
        System.out.println("::::::Inicio.ClienteService.save::: nombre :  "+ clienteBean.getNomCom());
       return clienteMapper.save(clienteBean);
   }
}
