/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.services;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.itskill.bean.MenuBean;
import org.itskill.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuService {
    
    @Autowired
    MenuMapper menuMapper;
    
    public List<MenuBean> getVistasXRolXPadre(Integer rol_id, Integer id_padre){
        return menuMapper.getVistasXRolXPadre(rol_id,id_padre);
    }
    
  
    
}
