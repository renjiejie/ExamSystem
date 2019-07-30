package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Answer;
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
	
}
