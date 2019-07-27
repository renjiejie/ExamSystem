package com.neuedu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Question;
import com.neuedu.demo.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping("/add")
	public String addQuestion(Question question){
		questionService.addQuestion(question);
		return "../addQuestions.html";
	}

}
