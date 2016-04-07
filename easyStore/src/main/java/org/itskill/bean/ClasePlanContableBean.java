package org.itskill.bean;

public class ClasePlanContableBean {
	private Integer id_clase;
	private String des_clase;
	private String nat_clase;

	private String fec_crea;
	private String fec_eli;
	private String fec_mod;
	private String estado;

	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;

	public ClasePlanContableBean() {
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();
	}

	public Integer getId_clase() {
		return id_clase;
	}

	public void setId_clase(Integer id_clase) {
		this.id_clase = id_clase;
	}

	public String getDes_clase() {
		return des_clase;
	}

	public void setDes_clase(String des_clase) {
		this.des_clase = des_clase;
	}

	public String getNat_clase() {
		return nat_clase;
	}

	public void setNat_clase(String nat_clase) {
		this.nat_clase = nat_clase;
	}

	public String getFec_crea() {
		return fec_crea;
	}

	public void setFec_crea(String fec_crea) {
		this.fec_crea = fec_crea;
	}

	public String getFec_eli() {
		return fec_eli;
	}

	public void setFec_eli(String fec_eli) {
		this.fec_eli = fec_eli;
	}

	public String getFec_mod() {
		return fec_mod;
	}

	public void setFec_mod(String fec_mod) {
		this.fec_mod = fec_mod;
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

}
