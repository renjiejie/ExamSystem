package com.neuedu.demo.domain;

public class User {

	private String account;
	private String password;
	private String permission;
	
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	}
	
	public User(String account, String permission, String password) {
		super();
		this.account = account;
		this.permission = permission;
	}
	
	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", permission=" + permission + "]";
	}
	
	
}
