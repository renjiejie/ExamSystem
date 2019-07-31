package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Exam;

public interface ExamService {
	public List<Exam> getExams(String courseId);

	public String getExamTime(String examId);
}
