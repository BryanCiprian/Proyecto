package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.MarcaBean;
import org.springframework.stereotype.Component;

@Component
public interface MarcaMapper {

	public List<MarcaBean> listarAll();
	public Integer save(MarcaBean marca);
	public Integer delete(MarcaBean marca);
	public Integer update(MarcaBean marca);
	public MarcaBean listxid(MarcaBean marca);
}
