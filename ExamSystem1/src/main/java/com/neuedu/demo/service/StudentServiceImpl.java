package com.neuedu.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.*;

import com.neuedu.demo.dao.StudentMapper;
import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper mapper;
	@Override
	public List<Paper> getPaperId(String examId) {
		// TODO Auto-generated method stub
		List<Paper> papers = new ArrayList<Paper>();
		String paperId = mapper.getPaperId(examId);
		String[] ids = paperId.split(",");
		for(String id:ids) {
			Paper paper = mapper.getPaper(id);
			papers.add(paper);
		}
		return papers;
	}
	@Override
	public  List<Exam> joinExam() {
		// TODO Auto-generated method stub
		List<Exam> exams = new ArrayList<Exam>();
		return exams;
	}

}
