package org.itskill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.IgvBean;

public interface IgvMapper {

	public List<IgvBean> getAll();

	public Integer delete(IgvBean igv);

	public Integer save(IgvBean igv);

	public Integer edit(IgvBean igv);

	public IgvBean findById(@Param("id_igv") Integer id);

}
