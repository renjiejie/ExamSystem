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
	public List<Question> query(String questionId,String courseId) {
		return mapper.query(questionId,courseId);
	}

	@Override
	public void deleteQuestion(String questionId) {
		mapper.deleteQuestion(questionId);
	}

	@Override
	public void changeQuestion(Question question) {
		System.out.println(question);
		mapper.changeQuestion(question);
		
	}

	@Override
	public void changeQuestionWithoutCourse(Question question) {
		mapper.changeQuestionWithoutCourse(question);
	}

	@Override
	public Question queryById(String questionId) {
		return mapper.queryById(questionId);
	}
	
	

}
