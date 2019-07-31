package com.neuedu.demo.service;

import java.util.List;
import java.util.Map;

import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.RealAnswer;

public interface AnswerService {
	public List<RealAnswer> getAnswers(String examId);
	public Map<String,Map<String,Object>> getSubjectiveQuestions(String answerId);
}
