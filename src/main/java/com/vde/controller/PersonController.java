package com.vde.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vde.model.Person;
import com.vde.service.IPersonService;

@Controller
public class PersonController {

	@Autowired
	private IPersonService personService;

	@RequestMapping("/index")
	public String setFrom(Map<String, Object> map) {

		Person person = new Person();

		map.put("person", person);
		map.put("personList", personService.getAllPersons());

		return "person";
	}

	@RequestMapping(value = "/person.doit", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Person person, BindingResult result, @RequestParam String action, Map<String, Object> map) {

		Person personResult = new Person();

		switch (action.toUpperCase()) {
		case "ADD":
			personService.add(person);
			personResult = person;
			break;
		case "EDIT":
			personService.edit(person);
			personResult = person;
			break;
		case "DELETE":
			personService.delete(person.getPersonId());
			personResult = new Person();
			break;
		case "SEARCH":
			Person searchPersonById = personService.getPerson(person.getPersonId());
			personResult = searchPersonById != null ? searchPersonById : new Person();

			break;
		}

		map.put("person", personResult);
		map.put("personList", personService.getAllPersons());

		return "person";
	}

}
