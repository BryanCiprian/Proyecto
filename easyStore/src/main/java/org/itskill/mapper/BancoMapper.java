package org.itskill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.BancoBean;

public interface BancoMapper {

	public List<BancoBean> getAll();

	public Integer delete(BancoBean banco);

	public Integer save(BancoBean banco);

	public Integer edit(BancoBean banco);

	public BancoBean findById(@Param("id_banco") Integer id);

}
