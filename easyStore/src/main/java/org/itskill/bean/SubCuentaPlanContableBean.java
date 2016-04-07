package org.itskill.bean;

public class SubCuentaPlanContableBean {
	private Integer id_sub_cuenta;
	private String des_sub_cuenta;
	private String nat_sub_cuenta;

	private CuentaPlanContableBean cuenta;
	private String fec_crea;
	private String fec_eli;
	private String fec_mod;
	private String estado;

	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;

	public SubCuentaPlanContableBean() {
		cuenta = new CuentaPlanContableBean();
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();
	}

	public Integer getId_sub_cuenta() {
		return id_sub_cuenta;
	}

	public void setId_sub_cuenta(Integer id_sub_cuenta) {
		this.id_sub_cuenta = id_sub_cuenta;
	}

	public String getDes_sub_cuenta() {
		return des_sub_cuenta;
	}

	public void setDes_sub_cuenta(String des_sub_cuenta) {
		this.des_sub_cuenta = des_sub_cuenta;
	}

	public String getNat_sub_cuenta() {
		return nat_sub_cuenta;
	}

	public void setNat_sub_cuenta(String nat_sub_cuenta) {
		this.nat_sub_cuenta = nat_sub_cuenta;
	}

	public CuentaPlanContableBean getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaPlanContableBean cuenta) {
		this.cuenta = cuenta;
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
