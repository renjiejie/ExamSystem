package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Student;

public interface StudentService {
	public List<Paper> getPaperId(String examId);
	public List<Exam> joinExam();
}
