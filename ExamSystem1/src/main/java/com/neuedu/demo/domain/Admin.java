package com.neuedu.demo.domain;

public class Admin {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(User user) {
		super();
		this.user = user;
	}
	
}
