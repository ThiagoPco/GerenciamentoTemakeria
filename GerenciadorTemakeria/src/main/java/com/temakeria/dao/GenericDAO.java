package com.temakeria.dao;

import java.lang.reflect.ParameterizedType;
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

	public void excluir(T entidade) {
		getSession().delete(entidade);
	}

	public List<T> listar() {
		List<T> list = getSession().createQuery(
				("FROM " + getTypeClass().getSimpleName())).list();
		return list;
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
