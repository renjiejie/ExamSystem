package com.neuedu.demo.service;


import java.util.List;

import com.neuedu.demo.domain.Question;

public interface QuestionService {
	
	public void addQuestion(Question question);
	public List<Question> query(String questionId,String courseId);
	public void deleteQuestion(String questionId);
	public void changeQuestion(Question question);

}
