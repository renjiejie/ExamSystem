package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class QuestionAjaxController {
	
	@RequestMapping("/setMaker")
	@ResponseBody
	public String checkAccount(HttpServletRequest req) {
		String maker = (String) req.getSession().getAttribute("account");
		return maker;
	}

}
