package com.temakeria.dao;

import org.hibernate.SessionFactory;

import com.temakeria.model.EntidadeBD;

public class GenericDAO<T extends EntidadeBD> {

	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
}
