package org.itskill.bean;

public class EmpleadoBean {

	private Integer idPersona;
	private CargoBean cargoBean;
	private String fecInicioContrato;
	private String fecFinContrato;
	private UsuarioBean usuarioBean;
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public CargoBean getCargoBean() {
		return cargoBean;
	}
	public void setCargoBean(CargoBean cargoBean) {
		this.cargoBean = cargoBean;
	}
	public String getFecInicioContrato() {
		return fecInicioContrato;
	}
	public void setFecInicioContrato(String fecInicioContrato) {
		this.fecInicioContrato = fecInicioContrato;
	}
	public String getFecFinContrato() {
		return fecFinContrato;
	}
	public void setFecFinContrato(String fecFinContrato) {
		this.fecFinContrato = fecFinContrato;
	}
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}
	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}
	
	
}
