package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.AlmacenBean;
import org.springframework.stereotype.Component;

@Component
public interface AlmacenMapper {

	public List<AlmacenBean> listarAll();
	public Integer save(AlmacenBean almacenBean);
	public Integer delete(AlmacenBean almacenBean);
	public Integer update(AlmacenBean almacenBean);
	public AlmacenBean listxid(AlmacenBean almacenBean);
}
