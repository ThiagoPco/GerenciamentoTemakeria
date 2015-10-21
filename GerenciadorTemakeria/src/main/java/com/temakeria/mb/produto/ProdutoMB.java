package com.temakeria.mb.produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;

import com.temakeria.model.produto.Produto;
import com.temakeria.service.produto.ProdutoService;

@Controller
@ManagedBean(name = "ProdutoService")
@SessionScoped
public class ProdutoMB {

	@Autowired
	ProdutoService produtoService;

	private boolean pesquisa = false;

	
	//remover após capturar dados da base ---------------------------------------
	
	private String country;
	
	private Map<String,String> countries;
	
	private List<Produto> prodList = new ArrayList<Produto>();
	
	private Produto prodCadastrar = new Produto();
	
	//----------------------------------------------------------------------------
	

	@PostConstruct
	public void init() {
		
	//remover após capturar dados da base ---------------------------------------
		prodList = produtoService.createProducts(10);

		countries  = new HashMap<String, String>();
		countries.put("Recife", "Recife");
		countries.put("Porto de Galinhas", "Porto de Galinhas");

	//----------------------------------------------------------------------------
	}
	//remover após capturar dados da base ---------------------------------------
	
	
	public Map<String, String> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public List<Produto> getProdList() {
		return prodList;
	}

	public void setProdList(List<Produto> prodList) {
		this.prodList = prodList;
	}

	
	//----------------------------------------------------------------------------
	

	public Produto getProdCadastrar() {
		return prodCadastrar;
	}


	public void setProdCadastrar(Produto prodCadastrar) {
		this.prodCadastrar = prodCadastrar;
	}


	public void salvarProduto() {
		
		validarFrontEnd();
		
		prodList.add(prodCadastrar);
		prodCadastrar = new Produto();
	}

	public void validarFrontEnd() {
		
	}
	//Inicio dos get`s set`s da página de produto
	
	public boolean isPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(boolean pesquisa) {
		this.pesquisa = pesquisa;
	}

}
