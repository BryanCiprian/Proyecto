package org.itskill.services;

import java.util.List;

import org.itskill.bean.SubCuentaPlanContableBean;
import org.itskill.mapper.SubCuentaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubCuentaService {

	@Autowired

	private SubCuentaMapper subCuentaMapper;

	public List<SubCuentaPlanContableBean> listarAllByCuenta(Integer id) {
		return subCuentaMapper.getAllByCuenta(id);
	}
}
