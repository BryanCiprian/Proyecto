package org.itskill.services;
import java.util.List;

import org.itskill.bean.ConfiguracionBean;

import org.itskill.mapper.ConfiguracionMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfiguracionService {

	@Autowired
    ConfiguracionMapper configuracionMapper;
 
    
    public Integer save(ConfiguracionBean configuracionBean){
         System.out.println("::::::Inicio.::: nombre :  "+configuracionBean.getNom_empresa());
        return configuracionMapper.save(configuracionBean);
    }
    
    public Integer editConfiguracion(ConfiguracionBean configuracionBean){
         System.out.println("::::::Inicio.::: nombre :  "+configuracionBean.getNom_empresa());
        return configuracionMapper.edit(configuracionBean);
    }
    
    public ConfiguracionBean showConfiguration(){
    	return configuracionMapper.listarConfig();
    }
  
}
