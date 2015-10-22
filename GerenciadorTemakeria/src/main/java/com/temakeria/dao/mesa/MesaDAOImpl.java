package com.temakeria.dao.mesa;

import org.springframework.stereotype.Repository;

import com.temakeria.dao.GenericDAO;
import com.temakeria.model.mesa.Mesa;

@Repository
public class MesaDAOImpl extends GenericDAO<Mesa> implements IMesaDAO {

	private static final long serialVersionUID = 5208058889478131070L;

}
