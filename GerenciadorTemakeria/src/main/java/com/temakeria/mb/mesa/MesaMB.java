package com.temakeria.mb.mesa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.temakeria.model.mesa.Mesa;
import com.temakeria.service.mesa.MesaService;

@Controller
@ManagedBean(name = "personService")
@SessionScoped
public class MesaMB {

	@Autowired
	MesaService mesaService;

	private Mesa mesa = new Mesa();

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void salvarMesa() {
		mesaService.equals(new Mesa());
	}
}
