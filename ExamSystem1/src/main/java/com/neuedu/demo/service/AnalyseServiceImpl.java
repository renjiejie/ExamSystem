package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.AnalyseMapper;
import com.neuedu.demo.domain.Analyse;

@Service
public class AnalyseServiceImpl implements AnalyseService {

	@Autowired
	private AnalyseMapper mapper;
	
	@Override
	public List<Analyse> query(String courseId) {
		
		return mapper.query(courseId);
	}
	
	@Override
	public List<Analyse> queryByExam(String exam) {
		return mapper.queryByExam(exam);
	}
	
	
	@Override
	public String queryExamId(String courseId) {
		// TODO Auto-generated method stub
		return mapper.queryExamId(courseId);
	}

	@Override
	public String queryPaperId(String examId) {
		// TODO Auto-generated method stub
		return mapper.queryPaperId(examId);
	}
	@Override
	public Integer queryExamPassPeople(String examId, String paperId) {
		// TODO Auto-generated method stub
		return mapper.queryExamPassPeople(examId, paperId);
	}
	@Override
	public Double queryExamAverage(String examId) {
		// TODO Auto-generated method stub
		return mapper.queryExamAverage(examId);
	}
	@Override
	public Integer queryExamPeople(String examId) {
		// TODO Auto-generated method stub
		return mapper.queryExamPeople(examId);
	}

}
