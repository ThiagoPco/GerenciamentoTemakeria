package com.temakeria.service.mesa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.temakeria.dao.mesa.IMesaDAO;
import com.temakeria.model.mesa.Mesa;

public class MesaServiceImpl implements IMesaService {

	@Autowired
	private IMesaDAO mesaDAO;

	public void setMesaDAO(IMesaDAO mesaDAO) {
		this.mesaDAO = mesaDAO;
	}

	@Override
	@Transactional
	public void salvar(Mesa mesa) {
		mesaDAO.salvar(mesa);
	}

	@Override
	@Transactional
	public void excluir(Long id) {
		mesaDAO.excluir(id);
	}

	@Override
	@Transactional
	public void alterar(Mesa mesa) {
		mesaDAO.alterar(mesa);
	}

	@Override
	public List<Mesa> listar() {
		return mesaDAO.listar();
	}
}
