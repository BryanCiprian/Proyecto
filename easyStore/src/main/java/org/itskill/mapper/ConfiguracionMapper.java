package org.itskill.mapper;

import org.itskill.bean.ConfiguracionBean;
import org.springframework.stereotype.Component;

@Component
public interface ConfiguracionMapper {

	public Integer save(ConfiguracionBean configuracionBean);
	public Integer edit(ConfiguracionBean configuracionBean);
	public ConfiguracionBean listarConfig();

}
