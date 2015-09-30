package com.temakeria.service;

import java.util.List;

import com.temakeria.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}