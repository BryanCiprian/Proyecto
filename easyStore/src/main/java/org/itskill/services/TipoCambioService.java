package org.itskill.services;

import java.util.List;

import org.itskill.bean.TipoCambioBean;
import org.itskill.bean.UsuarioBean;
import org.itskill.mapper.TipoCambioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TipoCambioService {

	@Autowired
	private TipoCambioMapper tipoCambioMapper;

	public Integer save(TipoCambioBean tc) {
		return tipoCambioMapper.save(tc);
	}

	public Integer EditarTipoCambio(TipoCambioBean tc) {

		return tipoCambioMapper.edit(tc);
	}

	public Integer eliminarTipoCambio(TipoCambioBean tc) {

		return tipoCambioMapper.delete(tc);
	}

	public Integer verificarTC() {
		return tipoCambioMapper.verificarTC();
	}

	public Double obtenerTC() {
		return tipoCambioMapper.obtenerTC();
	}
	public List<TipoCambioBean> listarTipoCambio (){
		
		return tipoCambioMapper.getAll();
	}
	
}
