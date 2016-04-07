package org.itskill.bean;

public class CategoriaBean {
	private Integer id_categoria;
	private String des_categoria;
	private String fec_crea;
	private String fec_mod;
	private String fec_eli;
	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;
	private String estado;
	public Integer getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getDes_categoria() {
		return des_categoria;
	}
	public void setDes_categoria(String des_categoria) {
		this.des_categoria = des_categoria;
	}
	public String getFec_crea() {
		return fec_crea;
	}
	public void setFec_crea(String fec_crea) {
		this.fec_crea = fec_crea;
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
	public UsuarioBean getUsu_crea() {
		return usu_crea;
	}
	public void setUsu_crea(UsuarioBean usu_crea) {
		this.usu_crea = usu_crea;
	}
	public UsuarioBean getUsu_mod() {
		return usu_mod;
	}
	public void setUsu_mod(UsuarioBean usu_mod) {
		this.usu_mod = usu_mod;
	}
	public UsuarioBean getUsu_eli() {
		return usu_eli;
	}
	public void setUsu_eli(UsuarioBean usu_eli) {
		this.usu_eli = usu_eli;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
