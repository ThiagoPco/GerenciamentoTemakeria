package com.temakeria.service.mesa;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.temakeria.dao.mesa.MesaDAO;
import com.temakeria.model.mesa.Mesa;
import com.temakeria.service.GenericService;

public class MesaServiceImpl implements MesaService, GenericService<Mesa> {

	private MesaDAO mesaDAO;

	public void setMesaDAO(MesaDAO mesaDAO) {
		this.mesaDAO = mesaDAO;
	}

	@Override
	@Transactional
	public void salvar(Mesa t) {
		// TODO Auto-generated method stub
	}

	@Override
	@Transactional
	public void excluir(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	@Transactional
	public void alterar(Mesa t) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Mesa> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
