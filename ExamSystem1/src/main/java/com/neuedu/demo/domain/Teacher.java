package com.neuedu.demo.domain;

public class Teacher {
	private User user;
	private String name;
	private int telephone;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Teacher(User user, String name, int telephone) {
		super();
		this.user = user;
		this.name = name;
		this.telephone = telephone;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
