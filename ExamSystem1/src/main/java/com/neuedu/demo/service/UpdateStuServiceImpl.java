package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.UpdateStuMapper;
import com.neuedu.demo.domain.Student;

@Service
public class UpdateStuServiceImpl implements UpdateStuService{
	@Autowired
	private UpdateStuMapper mapper;

	@Override
	public void updateStuPassword(Student student) {
		// TODO Auto-generated method stub
		mapper.updateStuPassword(student);
	}

	@Override
	public void updateStuTel(String account, Integer telephone) {
		// TODO Auto-generated method stub
		mapper.updateStuTel(account, telephone);
	}


}
