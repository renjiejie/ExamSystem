package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/query/{questionId}/{courseId}",method=RequestMethod.GET)
	@ResponseBody
	public List<Question> query(@PathVariable("questionId") String questionId,@PathVariable("courseId") String courseId){
		if(!questionId.equals("All")){
			return questionService.query(questionId,courseId);
		}
		else{
			return questionService.query(null,courseId);
		}
	}

	@RequestMapping(value="/delete/{questionId}")
	public String deleteQuestion(@PathVariable("questionId")String questionId){
		System.out.println("delete"+questionId);
		questionService.deleteQuestion(questionId);
		return "redirect:../../questionManage.html";
	}
}
