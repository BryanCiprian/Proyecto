package org.itskill.services;

import java.util.List;

import org.itskill.bean.IgvBean;
import org.itskill.mapper.IgvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IgvService {

	@Autowired
	private IgvMapper igvMapper;

	public List<IgvBean> listarIgv() {

		return igvMapper.getAll();
	}

	public Integer eliminar(IgvBean igv) {
		return igvMapper.delete(igv);
	}

	public Integer save(IgvBean igv) {
		return igvMapper.save(igv);
	}

	public Integer editar(IgvBean igv) {
		return igvMapper.edit(igv);
	}

	public IgvBean encontrarIgv(Integer id) {

		return igvMapper.findById(id);
	}

}
