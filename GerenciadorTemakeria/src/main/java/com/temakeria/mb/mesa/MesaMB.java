package com.temakeria.mb.mesa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.temakeria.model.mesa.Mesa;
import com.temakeria.service.mesa.IMesaService;

@Controller
@Scope("session")
public class MesaMB implements Serializable {

	private static final long serialVersionUID = -4549601071062076464L;

	@Autowired
	IMesaService mesaService;

	private Mesa mesa = new Mesa();
	private List<Mesa> mesasPesquisa = new ArrayList<Mesa>();

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public List<Mesa> getMesasPesquisa() {
		return mesasPesquisa;
	}

	public void setMesasPesquisa(List<Mesa> mesasPesquisa) {
		this.mesasPesquisa = mesasPesquisa;
	}

	public void salvarMesa() {
		mesa.setId(0);
		mesaService.salvar(mesa);
		mesasPesquisa = mesaService.listar();
	}

	public void editarMesa() {
		mesaService.alterar(mesa);
	}

	public void alterarMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void excluirMesa(Long id) {
		mesaService.excluir(id);
	}

	@PostConstruct
	public void iniciarTela() {
		mesasPesquisa = mesaService.listar();
	}

}
