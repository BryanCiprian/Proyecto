/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.itskill.bean.PersonaBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.exception.InvalidUserException;
import org.itskill.exception.LockedUserException;
import org.itskill.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioService {

	@Autowired
	private UsuarioMapper usuarioMapper;

	public UsuarioBean findUsuarioByName(String name) {
		return usuarioMapper.findByName(name);
	}

	public UsuarioBean findUsuarioById(Integer id) {
		return usuarioMapper.findById(id);
	}

	public List<UsuarioBean> obtenerTodo() {
		return usuarioMapper.getAll();

	}

	public List<PersonaBean> listarPersona() {
		return usuarioMapper.getAllPersona();

	}

	public Integer guardar(UsuarioBean usuario) {

		return usuarioMapper.save(usuario);
	}

	public Integer editar(UsuarioBean usuario) {

		return usuarioMapper.edit(usuario);
	}

	public Integer delete(Integer id) {
		System.out.println("Entro a sERVICES" + id);
		return usuarioMapper.delete(id);
	}

}