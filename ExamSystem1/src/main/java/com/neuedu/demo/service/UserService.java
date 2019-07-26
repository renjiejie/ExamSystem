package com.neuedu.demo.service;

import com.neuedu.demo.domain.User;

public interface UserService {

	public User login(String account, String password);
}
