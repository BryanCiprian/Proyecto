package org.itskill.mapper;

import org.itskill.bean.PersonaBean;
import org.springframework.stereotype.Component;

@Component
public interface PersonaMapper {

	public Integer save(PersonaBean personaBean);
}
