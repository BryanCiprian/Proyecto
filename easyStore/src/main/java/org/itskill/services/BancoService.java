package org.itskill.services;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.itskill.bean.BancoBean;
import org.itskill.mapper.BancoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BancoService {

	@Autowired
	private BancoMapper bancoMapper;

	public List<BancoBean> listarBanco() {

		return bancoMapper.getAll();
	}

	public Integer eliminar(BancoBean banco) {
		return bancoMapper.delete(banco);
	}

	public Integer guardar(BancoBean banco) {

		return bancoMapper.save(banco);
	}

	public Integer editar(BancoBean banco) {
		return bancoMapper.save(banco);

	}

	public BancoBean encontrarPorId(Integer id) {
		return bancoMapper.findById(id);

	}

}
