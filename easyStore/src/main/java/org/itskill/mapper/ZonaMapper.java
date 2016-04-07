package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.CargoBean;
import org.itskill.bean.DistritoBean;
import org.itskill.bean.ZonaBean;

public interface ZonaMapper {
	public List<ZonaBean> listarZonaPorIdDistrito(DistritoBean distritoBean);
}
