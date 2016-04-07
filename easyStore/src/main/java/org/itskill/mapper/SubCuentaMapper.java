package org.itskill.mapper;

import java.util.List;

import org.itskill.bean.SubCuentaPlanContableBean;

public interface SubCuentaMapper {

	public  List<SubCuentaPlanContableBean> getAllByCuenta(Integer id);
}
