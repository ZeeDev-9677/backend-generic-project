package com.myprojectdoc.docbasic.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocBasicEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	@Column
	private String username;

	private String password;
	private Double salary;

	public DocBasicEntity(long id, String username) {

		this.id = id;
		this.username = username;
	}

	/*
	 * .............................
	 */

	public DocBasicEntity(String password) {

		this.password = password;

	}

	public DocBasicEntity(Double salary) {

		this.salary = salary;

	}
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DocBasicEntity() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "DocBasicEntity [id=" + id + ", username=" + username + "]";
	}

	
		
	

}
