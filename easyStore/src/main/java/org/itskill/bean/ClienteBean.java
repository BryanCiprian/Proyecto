package org.itskill.bean;

public class ClienteBean {
  
	private Integer idPersona;
	private TipoClienteBean tipoClienteBean;
	private String desRuc;
	private String nomCom;
	private UsuarioBean usuarioBean;
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}
	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public TipoClienteBean getTipoClienteBean() {
		return tipoClienteBean;
	}
	public void setTipoClienteBean(TipoClienteBean tipoClienteBean) {
		this.tipoClienteBean = tipoClienteBean;
	}
	public String getDesRuc() {
		return desRuc;
	}
	public void setDesRuc(String desRuc) {
		this.desRuc = desRuc;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	
	
	
}
