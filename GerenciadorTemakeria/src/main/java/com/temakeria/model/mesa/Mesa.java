package com.temakeria.model.mesa;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.temakeria.model.EntidadeBD;

@Entity
@Table(name="MESA")
public class Mesa extends EntidadeBD{

	private static final long serialVersionUID = 5470745842260307281L;

	private int codigo;
    private String qtdPessoas;
    private String descricao;
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(String qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
