package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.AnswerMapper;
import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.RealAnswer;

@Service
public class AnswerServiceImpl implements AnswerService {
	
	@Autowired
	private AnswerMapper amapper;
	
	public List<RealAnswer> getAnswers(String examId){
		return amapper.getAnswers(examId);
	}
	
	
}
