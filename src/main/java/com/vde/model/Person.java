package com.vde.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int age;
	@Column
	private String login;
	@Column
	private String password;
	@Column
	private String gender;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String firstname, String lastname, int age, String login, String password, String gender) {
		super();
		this.personId = personId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.login = login;
		this.password = password;
		this.gender = gender;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
