package org.itskill.services;

import java.util.List;

import org.itskill.bean.AlmacenBean;
import org.itskill.mapper.AlmacenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlmacenService {

	@Autowired
	AlmacenMapper almacenMapper;
	
	public List<AlmacenBean> listarAll(){
    	return almacenMapper.listarAll();
    }
    
    public Integer save (AlmacenBean almacenBean){
        System.out.println("::::::Inicio.AlmcenService.save::: :  "+almacenBean.getIdAlmacen() + almacenBean.getNomAlmacen());
       return almacenMapper.save(almacenBean);
   }
    
    public Integer delete (AlmacenBean almacenBean){
        System.out.println("::::::Inicio.AlmacenService.eliminar::::  "+almacenBean.getIdAlmacen() + almacenBean.getNomAlmacen());
       return almacenMapper.delete(almacenBean);
   }
    
    public Integer update (AlmacenBean almacenBean){
        System.out.println("::::::Inicio.AlmacenService.update::: :  "+almacenBean.getIdAlmacen() + almacenBean.getNomAlmacen());
       return almacenMapper.update(almacenBean);
   }
    public AlmacenBean listxid (AlmacenBean almacenBean){
        System.out.println("::::::Inicio.AlmacenService.listxid::: :  "+almacenBean.getIdAlmacen() + almacenBean.getNomAlmacen());
       return almacenMapper.listxid(almacenBean);
   }
}
