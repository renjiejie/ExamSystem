package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.StudentMapper;
import com.neuedu.demo.domain.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper mapper;
	@Override
	public void joinExam() {
		// TODO Auto-generated method stub
		
	}

}
