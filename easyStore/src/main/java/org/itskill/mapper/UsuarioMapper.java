/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.PersonaBean;
import org.itskill.bean.UsuarioBean;

public interface UsuarioMapper {
	public UsuarioBean validarUsuario(Map<String, Object> usuarioMap);

	public UsuarioBean findByName(String pvar_usu_usuario);
	
	public UsuarioBean findById(Integer id);

	public List<UsuarioBean> getAll();
	public List<PersonaBean> getAllPersona();

	public Integer save(UsuarioBean usuario);

	public Integer edit(UsuarioBean usuario);

	public Integer delete(Integer idPersona);

}
