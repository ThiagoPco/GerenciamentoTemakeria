package com.temakeria.model.mesa;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.temakeria.model.EntidadeBD;

@Entity
@Table(name = "MESA")
public class Mesa extends EntidadeBD {

	private static final long serialVersionUID = 5470745842260307281L;

	private Integer codigo;
	private Integer qtdPessoas;
	private String descricao;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
