/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.mapper;

import java.util.List;
import org.itskill.bean.VistaBean;
import org.springframework.stereotype.Component;

 
@Component
public interface VistaMapper {
  
    public List<VistaBean> getVistasXRol(Integer rol_id);
   
}
