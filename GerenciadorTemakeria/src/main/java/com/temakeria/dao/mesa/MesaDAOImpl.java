package com.temakeria.dao.mesa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.temakeria.dao.GenericDAO;
import com.temakeria.dao.IGenericDAO;
import com.temakeria.model.mesa.Mesa;

@Repository
public class MesaDAOImpl extends GenericDAO<Mesa> implements IGenericDAO<Mesa> {

	@Override
	public void salvar(Mesa entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Mesa entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Mesa> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	//private static final Logger logger = LoggerFactory.getLogger(MesaDAOImpl.class);
	
}
