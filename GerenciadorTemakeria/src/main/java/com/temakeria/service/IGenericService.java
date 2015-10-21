package com.temakeria.service;

import java.util.List;

public interface IGenericService<T> {
	void salvar(T t);

	void excluir(Long id);

	void alterar(T t);

	List<T> listar();
}
