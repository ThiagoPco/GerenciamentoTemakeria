package com.temakeria.dao.mesa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.temakeria.dao.GenericDAO;
import com.temakeria.model.mesa.Mesa;

@Repository
public class MesaDAOImpl extends GenericDAO<Mesa> implements MesaDAO {
	private static final Logger logger = LoggerFactory.getLogger(MesaDAOImpl.class);
	
}
