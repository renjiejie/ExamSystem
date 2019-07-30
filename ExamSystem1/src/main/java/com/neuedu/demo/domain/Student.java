package com.neuedu.demo.domain;

public class Student {
	
	private User user;
	private String name;
	private String className;
	private Integer telephone;
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(User user, String name, String className, int telephone) {
		super();
		this.user = user;
		this.name = name;
		this.className = className;
		this.telephone = telephone;
	}
	
	
}
