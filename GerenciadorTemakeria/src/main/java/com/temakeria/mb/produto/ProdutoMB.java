package com.temakeria.mb.produto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import com.temakeria.model.produto.Produto;

@Controller
@ManagedBean(name = "personService")
@SessionScoped
public class ProdutoMB {

//	@Autowired
//	ProdutoService produtoService;

	private Produto produto = new Produto();


	public void salvarProduto() {
	}

	public void buscarProduto() {
	}

	public void alterarProduto() {
	}
	
	public void excluirProduto() {
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
