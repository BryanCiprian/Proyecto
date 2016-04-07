/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.MenuBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author usuario
 */
@Component
public interface MenuMapper {
  
    public List<MenuBean> getVistasXRolXPadre(@Param("rol_id") Integer id_rol, @Param("id_padre") Integer id_padre);    
   
}
