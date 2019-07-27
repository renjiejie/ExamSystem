package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.QuestionMapper;
import com.neuedu.demo.domain.Question;

@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionMapper mapper;

	@Override
	public void addQuestion(Question question) {
		mapper.addQuestion(question);		
	}

	@Override
	public List<Question> query(String questionId) {
		return mapper.query(questionId);
	}
	
	
	

}
