package com.temakeria.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.temakeria.model.Person;
import com.temakeria.service.PersonService;

@Controller
@ManagedBean(name="personService")
@SessionScoped
public class PersonMB {
	
	@Autowired
	private PersonService personService;
	private Person person = new Person();

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
    public void addPerson() {
    	person.setId(0);
    	personService.addPerson(person);
    }
 
    public List<Person> listPersons() {
        return personService.listPersons();
    }
	
}
