package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.UpdateAdminMapper;
import com.neuedu.demo.domain.Admin;

@Service
public class UpdateAdminServiceImpl implements UpdateAdminService{
	@Autowired
	private UpdateAdminMapper mapper;
	@Override
	public void updateAdminPassword(Admin admin) {
		// TODO Auto-generated method stub
		mapper.updateAdminPassword(admin);
	}

}
