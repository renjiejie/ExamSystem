package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.AdminMapper;
import com.neuedu.demo.domain.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper mapper;
	
	@Override
	public Admin login(String id, String password) {
		// TODO Auto-generated method stub
		return mapper.login(id, password);
	}

}
