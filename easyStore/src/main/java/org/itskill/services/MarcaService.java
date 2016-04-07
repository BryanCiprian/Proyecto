
package org.itskill.services;

import java.util.List;
 
import org.itskill.bean.MarcaBean; 
import org.itskill.mapper.MarcaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MarcaService {
    
    @Autowired
    MarcaMapper marcaMapper;
 
    
    public List<MarcaBean> listarAll(){
    	return marcaMapper.listarAll();
    }
    
    public Integer save (MarcaBean marca){
        System.out.println("::::::Inicio.MarcaService.save::: nombre marca:  "+marca.getNomMarca());
       return marcaMapper.save(marca);
   }
    
    public Integer delete (MarcaBean marca){
        System.out.println("::::::Inicio.MarcaService.eliminar::: nombre marca:  "+marca.getNomMarca());
       return marcaMapper.delete(marca);
   }
    
    public Integer update (MarcaBean marca){
        System.out.println("::::::Inicio.MarcaService.update::: nombre marca:  "+marca.getNomMarca());
       return marcaMapper.update(marca);
   }
    public MarcaBean listxid (MarcaBean marca){
        System.out.println("::::::Inicio.MarcaService.listxid::: nombre marca:  "+marca.getNomMarca() + marca.getIdMarca());
       return marcaMapper.listxid(marca);
   }


}
