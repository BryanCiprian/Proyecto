package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.DistritoBean;
import org.itskill.bean.ProvinciaBean;

public interface DistritoMapper {

	public List<DistritoBean> listarDistritoPorIdProvincia (ProvinciaBean provinciaBean);
}
