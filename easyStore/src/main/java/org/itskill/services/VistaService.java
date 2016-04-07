/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.services;

import java.util.List;

import org.itskill.bean.VistaBean;
import org.itskill.mapper.VistaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class VistaService {
    
    @Autowired
    VistaMapper vistaMapper;

    public List<VistaBean> getVistasXRol(Integer rol_id){
        return vistaMapper.getVistasXRol(rol_id);
    }
    
}
