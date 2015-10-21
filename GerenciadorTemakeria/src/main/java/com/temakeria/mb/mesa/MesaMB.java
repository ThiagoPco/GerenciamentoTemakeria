package com.temakeria.mb.mesa;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.temakeria.model.mesa.Mesa;
import com.temakeria.service.mesa.IMesaService;

@Controller
@ManagedBean(name = "mesaMB")
@SessionScoped
public class MesaMB {

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
	}

	public void editarMesa() {
		mesaService.alterar(mesa);
	}

	public void excluirMesa() {
		mesaService.excluir(1L);
	}

	@PostConstruct
	public void iniciarTela() {
		// mesasPesquisa = mesaService.listar();
	}
}
