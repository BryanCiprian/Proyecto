/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.bean;

public class PersonaBean {

	private Integer idPersona;
	private ZonaBean zonaBean;
	private String descNombre;
	private String apePaterno;
	private String apeMaterno;
	private InventarioDocumentoBean inventarioDocumentoBean;
	private String numDocumento;
	private String fecNacimiento;
	private String desDireccion;
	private UsuarioBean usuarioBean;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public ZonaBean getZonaBean() {
		return zonaBean;
	}

	public void setZonaBean(ZonaBean zonaBean) {
		this.zonaBean = zonaBean;
	}

	public String getDescNombre() {
		return descNombre;
	}

	public void setDescNombre(String descNombre) {
		this.descNombre = descNombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public InventarioDocumentoBean getInventarioDocumentoBean() {
		return inventarioDocumentoBean;
	}

	public void setInventarioDocumentoBean(InventarioDocumentoBean inventarioDocumentoBean) {
		this.inventarioDocumentoBean = inventarioDocumentoBean;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getDesDireccion() {
		return desDireccion;
	}

	public void setDesDireccion(String desDireccion) {
		this.desDireccion = desDireccion;
	}

	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}
