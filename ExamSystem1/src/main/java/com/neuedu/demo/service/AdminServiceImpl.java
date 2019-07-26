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
	public void addUser(String account,String password,String permission) {
		if(permission.equals("管理员")) {
			mapper.addAdmin(account, password);
		}
		else if(permission.equals("学生")) {
			mapper.addStudent(account, password);
		}
		else if(permission.equals("教师")) {
			mapper.addTeacher(account, password);
		}
	}

}
