package com.temakeria.service;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<T> extends Serializable {
	void salvar(T t);

	void excluir(Long id);

	void alterar(T t);

	List<T> listar();
}
