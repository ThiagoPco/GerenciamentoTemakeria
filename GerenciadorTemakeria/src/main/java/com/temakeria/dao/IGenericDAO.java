package com.temakeria.dao;

import java.util.List;

import com.temakeria.model.EntidadeBD;

public interface IGenericDAO<T extends EntidadeBD> {

	public void salvar(T entidade);

	public void alterar(T entidade);

	public void excluir(Long id);

	public List<T> listar();
}
