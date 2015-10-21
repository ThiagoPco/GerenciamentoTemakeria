package com.temakeria.service.produto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import com.temakeria.dao.produto.ProdutoDAO;
import com.temakeria.model.produto.Produto;
import com.temakeria.service.IGenericService;

public class ProdutoServiceImpl implements ProdutoService, IGenericService<Produto> {

	private ProdutoDAO produtoDAO;

	@Override
	@Transactional
	public void salvar(Produto t) {
		// TODO Auto-generated method stub
	}

	@Override
	@Transactional
	public void excluir(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	@Transactional
	public void alterar(Produto t) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//MÉTODOS PARA TESTE DE TABELA.
	@Override
	public List<Produto> createProducts(int size) {
        List<Produto> list = new ArrayList<Produto>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Produto(getRandomId(),getRandomName(),getRandomPrice()));
        }
         
        return list;
    }
     
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private String getRandomName() {
    	
    	StringBuffer buffer = new StringBuffer();
    	String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	int charactersLength = characters.length();
    	for (int i = 0; i < 5; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
    	
        return buffer.toString();
    }
     
    public Double getRandomPrice() {
        return (Double) (Math.random() * 100000);
    }

    
    
    //get set autowired
	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}
}
