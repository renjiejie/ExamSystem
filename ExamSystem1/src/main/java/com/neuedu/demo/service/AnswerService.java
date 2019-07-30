package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.RealAnswer;

public interface AnswerService {
	public List<RealAnswer> getAnswers(String examId);
}
