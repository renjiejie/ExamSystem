package com.neuedu.demo.domain;

public class Admin {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String username) {
		super();
		this.username = username;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + "]";
	}
	
}
