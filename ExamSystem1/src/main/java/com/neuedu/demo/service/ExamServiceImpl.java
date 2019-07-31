package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.ExamMapper;
import com.neuedu.demo.dao.StudentMapper;
import com.neuedu.demo.domain.Exam;

@Service
public class ExamServiceImpl implements ExamService{
	@Autowired
	private ExamMapper examMapper;

	@Override
	public List<Exam> getExams(String courseId) {
		return examMapper.getExams(courseId);
	}

	@Override
	public String getExamTime(String examId) {
		return ""+examMapper.getExamById(examId).getPeriod();
	}
	
	
}
