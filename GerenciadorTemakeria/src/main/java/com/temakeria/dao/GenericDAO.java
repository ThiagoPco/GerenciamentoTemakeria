package com.temakeria.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.temakeria.model.EntidadeBD;

public class GenericDAO<T extends EntidadeBD> {

	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public void salvar(T entidade) {
		getSession().persist(entidade);
	}

	public void alterar(T entidade) {
		getSession().update(entidade);
	}

	public void excluir(Long id) {
		getSession().delete(id);
	}

	public List<T> listar() {
		getSession().createQuery(("FROM " + getTypeClass().getName())).list();
		return new ArrayList<T>();
	}

	private Class<?> getTypeClass() {
		Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		return clazz;
	}

	private Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
}
