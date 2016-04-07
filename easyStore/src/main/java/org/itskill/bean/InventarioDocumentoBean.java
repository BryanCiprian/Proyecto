/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.bean;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class InventarioDocumentoBean implements Serializable {

	private Integer id_doc_inventario;
	private String num_tabla;
	private String des_doc;
	private String num_doc;
	private Integer tab_padre;
	private String nom_corto;
	private String estado;

	private UsuarioBean usu_crea;
	private String fec_crea;
	private UsuarioBean usu_mod;
	private String fec_mod;
	private String fec_eli;
	private UsuarioBean usu_eli;

	/**
	 * @return the id_usuario
	 */
	public InventarioDocumentoBean() {
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();
	}

 
	public Integer getId_doc_inventario() {
		return id_doc_inventario;
	}


	public void setId_doc_inventario(Integer id_doc_inventario) {
		this.id_doc_inventario = id_doc_inventario;
	}


	public Integer getTab_padre() {
		return tab_padre;
	}

	public void setTab_padre(Integer tab_padre) {
		this.tab_padre = tab_padre;
	}

	public String getNum_tabla() {
		return num_tabla;
	}

	public void setNum_tabla(String num_tabla) {
		this.num_tabla = num_tabla;
	}

	public String getDes_doc() {
		return des_doc;
	}

	public void setDes_doc(String des_doc) {
		this.des_doc = des_doc;
	}

	public String getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public UsuarioBean getUsu_crea() {
		return usu_crea;
	}

	public void setUsu_crea(UsuarioBean usu_crea) {
		this.usu_crea = usu_crea;
	}

	public String getFec_crea() {
		return fec_crea;
	}

	public void setFec_crea(String fec_crea) {
		this.fec_crea = fec_crea;
	}

	public UsuarioBean getUsu_mod() {
		return usu_mod;
	}

	public void setUsu_mod(UsuarioBean usu_mod) {
		this.usu_mod = usu_mod;
	}

	public String getFec_mod() {
		return fec_mod;
	}

	public void setFec_mod(String fec_mod) {
		this.fec_mod = fec_mod;
	}

	public String getFec_eli() {
		return fec_eli;
	}

	public void setFec_eli(String fec_eli) {
		this.fec_eli = fec_eli;
	}

	public UsuarioBean getUsu_eli() {
		return usu_eli;
	}

	public void setUsu_eli(UsuarioBean usu_eli) {
		this.usu_eli = usu_eli;
	}

	public String getNom_corto() {
		return nom_corto;
	}

	public void setNom_corto(String nom_corto) {
		this.nom_corto = nom_corto;
	}

}
