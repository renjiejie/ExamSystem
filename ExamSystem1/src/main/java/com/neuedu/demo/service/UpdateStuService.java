package com.neuedu.demo.service;

import com.neuedu.demo.domain.Student;

public interface UpdateStuService {
	public void updateStuPassword(Student student);
	public void updateStuTel(String account, Integer telephone);
	
}
