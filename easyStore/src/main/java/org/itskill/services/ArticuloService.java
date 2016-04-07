package org.itskill.services;

import java.util.List;

import org.itskill.bean.ArticuloBean;
import org.itskill.bean.ProcedenciaBean;
import org.itskill.mapper.ArticuloMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticuloService {

	@Autowired
	private ArticuloMapper articuloMapper;

	public Integer save(ArticuloBean articuloBean) {
		System.out.println("save.CODIGO: " + articuloBean.getCodArt());
		System.out.println("save.CLASIFICACION: " + articuloBean.getIdClasificacion());
		System.out.println("save.UNIDAD MEDIDA: " + articuloBean.getIdUniMedArt());
		System.out.println("save.DESCRIPCION: " + articuloBean.getDesArt());
		System.out.println("save.CARACTERISTICAS: " + articuloBean.getCarArt());

		System.out.println("save.DISEÑO: " + articuloBean.getDisArt());
		System.out.println("save.MODELO: " + articuloBean.getModArt());
		System.out.println("save.MARCA: " + articuloBean.getMarcaBean().getIdMarca());
		System.out.println("save.CLASE: " + articuloBean.getClaseBean().getId_clase());
		System.out.println("save.GRUPO: " + articuloBean.getGrupoBean().getId_grupo());

		System.out.println("save.PROCEDENCIA: " + articuloBean.getProcedenciaBean().getId_proc());
		System.out.println("save.CUENTA: " + articuloBean.getCtaBean().getId_cuenta());
		System.out.println("save.SUB CUENTA: " + articuloBean.getSubCtaBean().getId_sub_cuenta());

		System.out.println("save.STOCK MINIMO: " + articuloBean.getStkMinArt());
		System.out.println("save.STOCK MAXIMO: " + articuloBean.getStkMaxArt());
		System.out.println("save.URL FOTO: " + articuloBean.getUrlFotoArt());
		System.out.println("save.USUARIO: " + articuloBean.getUsu_crea().getVar_usuario());

		return articuloMapper.save(articuloBean);
	}

	public void deleteArticulo(ArticuloBean articulo) {

		articuloMapper.deleteArticulo(articulo);
	}

	public List<ArticuloBean> listarArticulo() {

		return articuloMapper.getAll();
	}

	public Integer updateArticulo(ArticuloBean articuloBean) {

		return articuloMapper.save(articuloBean);
	}

	public List<ProcedenciaBean> listarProcedencia() {
		return articuloMapper.getAllProcedencia();

	}

}
