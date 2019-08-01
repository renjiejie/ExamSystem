package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.CourseMapper;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseMapper cMapper;

	@Override
	public List<String> getAllCourse() {
		return cMapper.getAllCourse();
	}

}
