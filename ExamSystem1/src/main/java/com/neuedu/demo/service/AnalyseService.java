package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Analyse;

public interface AnalyseService {
	public List<Analyse> query(String courseId );
	public String queryExamId(String courseId );
	public Integer queryExamPeople(String examId);
	public String queryPaperId(String examId);
	public Integer queryExamPassPeople(String examId ,String paperId);
	public Double queryExamAverage(String examId);
	
	public List<Analyse> queryByExam(String exam);
}
