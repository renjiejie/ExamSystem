package com.neuedu.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.RealAnswer;
import com.neuedu.demo.service.AnswerService;

@Controller
@RequestMapping("/answer")
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@RequestMapping("/query/{examId}")
	@ResponseBody
	public List<RealAnswer> getAnswers(@PathVariable("examId")String examId){
		return answerService.getAnswers(examId);
	}
	
	@RequestMapping("/subanswer/{answerId}")
	@ResponseBody
	public Map<String,Map<String,Object>> getSubjectiveQuestions(@PathVariable("answerId")String answerId){
		return answerService.getSubjectiveQuestions(answerId);
	}
	
}
