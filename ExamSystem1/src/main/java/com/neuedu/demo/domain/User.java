package com.neuedu.demo.domain;

public class User {

	private String account;
	private String permission;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String account, String permission) {
		super();
		this.account = account;
		this.permission = permission;
	}
}
