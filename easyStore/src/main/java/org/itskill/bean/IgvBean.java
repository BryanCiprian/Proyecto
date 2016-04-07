package org.itskill.bean;

public class IgvBean {

	private Integer id_igv;
	private Double val_igv;
	private UsuarioBean usu_crea;
	private String fec_crea;
	private UsuarioBean usu_mod;
	private String fec_mod;
	private String fec_eli;
	private UsuarioBean usu_eli;
	
	private String id_estado;
	
	private String anno_vigencia;

	public IgvBean() {
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();
	}

	public String getAnno_vigencia() {
		return anno_vigencia;
	}

	public void setAnno_vigencia(String anno_vigencia) {
		this.anno_vigencia = anno_vigencia;
	}

	public String getId_estado() {
		return id_estado;
	}

	public void setId_estado(String id_estado) {
		this.id_estado = id_estado;
	}

	public Integer getId_igv() {
		return id_igv;
	}

	public void setId_igv(Integer id_igv) {
		this.id_igv = id_igv;
	}

	public Double getVal_igv() {
		return val_igv;
	}

	public void setVal_igv(Double val_igv) {
		this.val_igv = val_igv;
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

	public UsuarioBean getUsu_eli() {
		return usu_eli;
	}

	public void setUsu_eli(UsuarioBean usu_eli) {
		this.usu_eli = usu_eli;
	}

}
