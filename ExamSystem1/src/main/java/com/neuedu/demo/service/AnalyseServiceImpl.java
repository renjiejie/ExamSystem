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

}
