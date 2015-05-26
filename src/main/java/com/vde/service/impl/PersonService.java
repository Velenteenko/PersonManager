package com.vde.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vde.dao.IPersonDAO;
import com.vde.model.Person;
import com.vde.service.IPersonService;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPersonDAO personDao;

	@Transactional
	public void add(Person person) {
		personDao.add(person);
	}

	@Transactional
	public void edit(Person person) {
		personDao.edit(person);

	}

	@Transactional
	public void delete(int personId) {
		personDao.delete(personId);

	}

	@Transactional
	public Person getPerson(int personId) {
		return personDao.getPerson(personId);
	}

	@Transactional
	public List getAllPersons() {
		return personDao.getAllPersons();
	}

}
