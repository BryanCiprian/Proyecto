package org.itskill.bean;

public class CuentaPlanContableBean {
	private Integer id_cuenta;
	private String des_cuenta;
	private String nat_cuenta;
	private GrupoPlanContableBean grupo;

	private String fec_crea;
	private String fec_eli;
	private String fec_mod;
	private String estado;

	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;

	public CuentaPlanContableBean() {
		grupo = new GrupoPlanContableBean();
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();

	}

	public Integer getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(Integer id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public String getDes_cuenta() {
		return des_cuenta;
	}

	public void setDes_cuenta(String des_cuenta) {
		this.des_cuenta = des_cuenta;
	}

	public String getNat_cuenta() {
		return nat_cuenta;
	}

	public void setNat_cuenta(String nat_cuenta) {
		this.nat_cuenta = nat_cuenta;
	}

	public GrupoPlanContableBean getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoPlanContableBean grupo) {
		this.grupo = grupo;
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
