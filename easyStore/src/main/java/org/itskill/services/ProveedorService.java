package org.itskill.services;



import org.itskill.bean.ProveedorBean;
import org.itskill.mapper.ProveedorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProveedorService {



	    @Autowired
	    ProveedorMapper proveedorMapper ;
	 
	  
	    public Integer save(ProveedorBean proveedorBean){
	    	 System.out.println("::::::Inicio.ProveedorService.save::: nombre prove:  "+proveedorBean.getNumRuc());
	    	return proveedorMapper.save(proveedorBean);
	    }
	 
}
