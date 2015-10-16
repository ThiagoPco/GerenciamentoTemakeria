package com.temakeria.model.produto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.temakeria.model.EntidadeBD;

@Entity
@Table(name="PRODUTO")
public class Produto extends EntidadeBD{

	private static final long serialVersionUID = 1185445696433774287L;
	
	private int codProduto;
    private String nomProduto;
    private String descProduto;
    private double preco;
    
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomProduto() {
		return nomProduto;
	}
	public void setNomProduto(String nomProduto) {
		this.nomProduto = nomProduto;
	}
	public String getDescProduto() {
		return descProduto;
	}
	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
