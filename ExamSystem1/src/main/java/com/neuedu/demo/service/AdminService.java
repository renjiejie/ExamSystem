package com.neuedu.demo.service;

import org.springframework.stereotype.Service;

import com.neuedu.demo.domain.Admin;

public interface AdminService {

	public void addUser(String account,String password,String permission);
}
