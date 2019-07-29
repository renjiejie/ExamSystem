package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.User;

public interface AdminService {

	public void addUser(String account,String password,String permission);
	public List<User> query(String account);
	public void deleteUser(String account, String permission);
	public void updatePassword(String account, String password);
}
