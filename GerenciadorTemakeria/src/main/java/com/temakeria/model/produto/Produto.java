package com.temakeria.model.produto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.temakeria.model.EntidadeBD;

@Entity
@Table(name="PRODUTO")
public class Produto extends EntidadeBD{

	private static final long serialVersionUID = 1185445696433774287L;
	
	private String codProduto;
    private String nomProduto;
    private double preco;
    private String unidade;
    
    
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(String codProduto, String nomProduto, double preco) {
		super();
		this.codProduto = codProduto;
		this.nomProduto = nomProduto;
		this.preco = preco;
	}

	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomProduto() {
		return nomProduto;
	}
	public void setNomProduto(String nomProduto) {
		this.nomProduto = nomProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
}
