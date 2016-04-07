package org.itskill.services;

import java.util.List;

import org.itskill.bean.CuentaPlanContableBean;
import org.itskill.mapper.CuentaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CuentaService {

	@Autowired
	private CuentaMapper cuentaMapper;

	public List<CuentaPlanContableBean> listAllCuentaByGrupo(Integer id) {
		return cuentaMapper.getAllByGrupo(id);
	}
}
