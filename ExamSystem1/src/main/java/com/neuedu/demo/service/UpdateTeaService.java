package com.neuedu.demo.service;

import com.neuedu.demo.domain.Teacher;

public interface UpdateTeaService {
	public void updateTeaPassword(Teacher teacher);
	public void updateTeaTel(String account, Integer telephone);
}
