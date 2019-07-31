package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.UpdateTeaMapper;
import com.neuedu.demo.domain.Teacher;

@Service
public class UpdateTeaServiceImpl implements UpdateTeaService{
	@Autowired
	private UpdateTeaMapper mapper;
	@Override
	public void updateTeaPassword(Teacher teacher) {
		// TODO Auto-generated method stub
		mapper.updateTeaPassword(teacher);
	}

	@Override
	public void updateTeaTel(String account, Integer telephone) {
		// TODO Auto-generated method stub
		mapper.updateTeaTel(account, telephone);
	}

}
