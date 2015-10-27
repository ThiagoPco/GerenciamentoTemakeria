package com.temakeria.dao;

import java.io.Serializable;
import java.util.List;

import com.temakeria.model.EntidadeBD;

public interface IGenericDAO<T extends EntidadeBD> extends Serializable {

	public void salvar(T entidade);

	public void alterar(T entidade);

	public void excluir(T entidade);

	public List<T> listar();
}
