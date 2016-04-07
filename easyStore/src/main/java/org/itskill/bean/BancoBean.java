package org.itskill.bean;

public class BancoBean {

	private Integer id_banco;
	private String desc_banco;
	private String rep_banco;

	private String ruc_banco;

	private PersonaBean persona;

	private UsuarioBean usu_crea;

	private String fec_crea;

	private UsuarioBean usu_mod;

	private String fec_eli;

	private UsuarioBean usu_eli;

	private Integer id_estado;
	private String fec_mod;

	public PersonaBean getPersona() {
		return persona;
	}

	public void setPersona(PersonaBean persona) {
		this.persona = persona;
	}

	public Integer getId_banco() {
		return id_banco;
	}

	public void setId_banco(Integer id_banco) {
		this.id_banco = id_banco;
	}

	public String getDesc_banco() {
		return desc_banco;
	}

	public void setDesc_banco(String desc_banco) {
		this.desc_banco = desc_banco;
	}

	public String getRep_banco() {
		return rep_banco;
	}

	public void setRep_banco(String rep_banco) {
		this.rep_banco = rep_banco;
	}

	public String getRuc_banco() {
		return ruc_banco;
	}

	public void setRuc_banco(String ruc_banco) {
		this.ruc_banco = ruc_banco;
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

	public Integer getId_estado() {
		return id_estado;
	}

	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}

	public String getFec_mod() {
		return fec_mod;
	}

	public void setFec_mod(String fec_mod) {
		this.fec_mod = fec_mod;
	}

}