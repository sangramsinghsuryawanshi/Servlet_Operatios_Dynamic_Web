package com.project.bean;

public class EncapsulatedClass 
{

	private int id;
	private String name;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "EncapsulateInsertion [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ "]";
	}
	public EncapsulatedClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EncapsulatedClass(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}