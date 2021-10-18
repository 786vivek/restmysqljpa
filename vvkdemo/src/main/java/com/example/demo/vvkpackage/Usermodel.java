package com.example.demo.vvkpackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="person")
public class Usermodel {

@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String email;
	
	protected Usermodel() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Usermodel [id=" + id + ", email=" + email + ", name=" + name + "]";
	}
	protected Usermodel(int id, String name,String email) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	
	
	
}
