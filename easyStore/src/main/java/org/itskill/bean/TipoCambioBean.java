/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class TipoCambioBean implements Serializable {

	private Integer id_tc;
	private String fec_tc;
	private String usu_reg;
	private String fec_reg;
	private Double val_tc_venta;
	private Double val_tc_compra;

	private String fec_crea;
	private String fec_eli;
	private String fec_mod;
	private String estado;

	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;

	public TipoCambioBean() {
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();
	}

	
	public String getFec_crea() {
		return fec_crea;
	}


	public void setFec_crea(String fec_crea) {
		this.fec_crea = fec_crea;
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


	public Integer getId_tc() {
		return id_tc;
	}

	public void setId_tc(Integer id_tc) {
		this.id_tc = id_tc;
	}

	public String getFec_tc() {
		return fec_tc;
	}

	public void setFec_tc(String fec_tc) {
		this.fec_tc = fec_tc;
	}

	public String getUsu_reg() {
		return usu_reg;
	}

	public void setUsu_reg(String usu_reg) {
		this.usu_reg = usu_reg;
	}

	public String getFec_reg() {
		return fec_reg;
	}

	public void setFec_reg(String fec_reg) {
		this.fec_reg = fec_reg;
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

	 

	public Double getVal_tc_venta() {
		return val_tc_venta;
	}

	public void setVal_tc_venta(Double val_tc_venta) {
		this.val_tc_venta = val_tc_venta;
	}

	public Double getVal_tc_compra() {
		return val_tc_compra;
	}

	public void setVal_tc_compra(Double val_tc_compra) {
		this.val_tc_compra = val_tc_compra;
	}

	 
}
