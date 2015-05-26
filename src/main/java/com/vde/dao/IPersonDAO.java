package com.vde.dao;

import java.util.List;

import com.vde.model.Person;

public interface IPersonDAO {
	public void add(Person person);

	public void edit(Person person);

	public void delete(int personId);

	public Person getPerson(int personId);

	public List getAllPersons();
}
