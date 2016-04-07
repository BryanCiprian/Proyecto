package org.itskill.bean;

public class GrupoPlanContableBean {
	private Integer id_grupo;
	private ClasePlanContableBean clase;
	private String des_grupo;
	private String nat_grupo;

	private String fec_crea;
	private String fec_eli;
	private String fec_mod;
	private String estado;

	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;

	public GrupoPlanContableBean() {
		clase = new ClasePlanContableBean();

		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();
	}

	public Integer getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Integer id_grupo) {
		this.id_grupo = id_grupo;
	}

	public ClasePlanContableBean getClase() {
		return clase;
	}

	public void setClase(ClasePlanContableBean clase) {
		this.clase = clase;
	}

	public String getDes_grupo() {
		return des_grupo;
	}

	public void setDes_grupo(String des_grupo) {
		this.des_grupo = des_grupo;
	}

	public String getNat_grupo() {
		return nat_grupo;
	}

	public void setNat_grupo(String nat_grupo) {
		this.nat_grupo = nat_grupo;
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
