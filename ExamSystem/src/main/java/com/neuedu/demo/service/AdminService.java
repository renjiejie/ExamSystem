package com.neuedu.demo.service;

import org.springframework.stereotype.Service;

import com.neuedu.demo.domain.Admin;

public interface AdminService {

	public Admin login(String id, String password);
}
