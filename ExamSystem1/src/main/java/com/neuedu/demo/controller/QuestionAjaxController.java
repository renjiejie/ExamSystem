package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Question;
import com.neuedu.demo.service.QuestionService;

@Controller
@RequestMapping("/questionajax")
public class QuestionAjaxController {
	
	@Autowired
	private QuestionService qs;
	
	@RequestMapping("/setMaker")
	@ResponseBody
	public String checkAccount(HttpServletRequest req) {
		String maker = (String) req.getSession().getAttribute("account");
		return maker;
	}
	
	@RequestMapping(value="/change",method=RequestMethod.PUT)
	@ResponseBody
	public String changeQuestion(@RequestBody Question question) {
		System.out.println("update question");
		qs.changeQuestion(question);
		return "/exam/questionManage.html";		
	}
	

}
