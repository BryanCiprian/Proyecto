package org.itskill.bean;

public class ArticuloBean {

	private Integer idArticulo;
	private String codArt;
	private String desArt;
	private String carArt;
	private String disArt;
	private String modArt;
	private Double stkMinArt;
	private Double stkMaxArt;
	private String urlFotoArt;
	private MarcaBean marcaBean;
	private Integer idClasificacion;
	private Integer idUniMedArt;

	private InventarioDocumentoBean id_tipo_existencia;
	private InventarioDocumentoBean id_unidad_medida;

	private ProcedenciaBean procedenciaBean;
	private EstadoBean estadoBean;
	private ClasePlanContableBean claseBean;
	private GrupoPlanContableBean grupoBean;
	private CuentaPlanContableBean ctaBean;
	private SubCuentaPlanContableBean subCtaBean;

	private CategoriaBean categoriaBean;

	private String fec_crea;
	private String fec_eli;
	private String fec_mod;
	private String estado;

	private UsuarioBean usu_crea;
	private UsuarioBean usu_mod;
	private UsuarioBean usu_eli;

	public ArticuloBean() {
		marcaBean = new MarcaBean();
		procedenciaBean = new ProcedenciaBean();
		claseBean = new ClasePlanContableBean();
		grupoBean = new GrupoPlanContableBean();
		ctaBean = new CuentaPlanContableBean();
		subCtaBean = new SubCuentaPlanContableBean();
		categoriaBean = new CategoriaBean();
		id_tipo_existencia = new InventarioDocumentoBean();
		id_unidad_medida = new InventarioDocumentoBean();
		usu_crea = new UsuarioBean();
		usu_mod = new UsuarioBean();
		usu_eli = new UsuarioBean();

	}

	public InventarioDocumentoBean getId_tipo_existencia() {
		return id_tipo_existencia;
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

	public void setId_tipo_existencia(InventarioDocumentoBean id_tipo_existencia) {
		this.id_tipo_existencia = id_tipo_existencia;
	}

	public InventarioDocumentoBean getId_unidad_medida() {
		return id_unidad_medida;
	}

	public void setId_unidad_medida(InventarioDocumentoBean id_unidad_medida) {
		this.id_unidad_medida = id_unidad_medida;
	}

	public CategoriaBean getCategoriaBean() {
		return categoriaBean;
	}

	public void setCategoriaBean(CategoriaBean categoriaBean) {
		this.categoriaBean = categoriaBean;
	}

	public Integer getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Integer idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}

	public String getDesArt() {
		return desArt;
	}

	public void setDesArt(String desArt) {
		this.desArt = desArt;
	}

	public String getCarArt() {
		return carArt;
	}

	public void setCarArt(String carArt) {
		this.carArt = carArt;
	}

	public String getDisArt() {
		return disArt;
	}

	public void setDisArt(String disArt) {
		this.disArt = disArt;
	}

	public String getModArt() {
		return modArt;
	}

	public void setModArt(String modArt) {
		this.modArt = modArt;
	}

	public Double getStkMinArt() {
		return stkMinArt;
	}

	public void setStkMinArt(Double stkMinArt) {
		this.stkMinArt = stkMinArt;
	}

	public Double getStkMaxArt() {
		return stkMaxArt;
	}

	public void setStkMaxArt(Double stkMaxArt) {
		this.stkMaxArt = stkMaxArt;
	}

	public String getUrlFotoArt() {
		return urlFotoArt;
	}

	public void setUrlFotoArt(String urlFotoArt) {
		this.urlFotoArt = urlFotoArt;
	}

	 

	public MarcaBean getMarcaBean() {
		return marcaBean;
	}

	public void setMarcaBean(MarcaBean marcaBean) {
		this.marcaBean = marcaBean;
	}

	public Integer getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(Integer idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public Integer getIdUniMedArt() {
		return idUniMedArt;
	}

	public void setIdUniMedArt(Integer idUniMedArt) {
		this.idUniMedArt = idUniMedArt;
	}

	public ProcedenciaBean getProcedenciaBean() {
		return procedenciaBean;
	}

	public void setProcedenciaBean(ProcedenciaBean procedenciaBean) {
		this.procedenciaBean = procedenciaBean;
	}

	public EstadoBean getEstadoBean() {
		return estadoBean;
	}

	public void setEstadoBean(EstadoBean estadoBean) {
		this.estadoBean = estadoBean;
	}

	public ClasePlanContableBean getClaseBean() {
		return claseBean;
	}

	public void setClaseBean(ClasePlanContableBean claseBean) {
		this.claseBean = claseBean;
	}

	public GrupoPlanContableBean getGrupoBean() {
		return grupoBean;
	}

	public void setGrupoBean(GrupoPlanContableBean grupoBean) {
		this.grupoBean = grupoBean;
	}

	public CuentaPlanContableBean getCtaBean() {
		return ctaBean;
	}

	public void setCtaBean(CuentaPlanContableBean ctaBean) {
		this.ctaBean = ctaBean;
	}

	public SubCuentaPlanContableBean getSubCtaBean() {
		return subCtaBean;
	}

	public void setSubCtaBean(SubCuentaPlanContableBean subCtaBean) {
		this.subCtaBean = subCtaBean;
	}

}
