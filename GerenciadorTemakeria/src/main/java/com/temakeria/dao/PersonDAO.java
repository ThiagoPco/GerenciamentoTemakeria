package com.temakeria.dao;

import java.util.List;

import com.temakeria.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}