package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.neuedu.demo.domain.Teacher;
import com.neuedu.demo.service.UpdateTeaService;

@Controller
@RequestMapping("/teacher")
public class UpdateTeaController {
	@Autowired
	private UpdateTeaService updateteaservice;
	@RequestMapping("/updatepassword")
	public String updateTeaPassword(HttpServletRequest req,Teacher teacher){
		String user = (String) req.getSession().getAttribute("account");
		teacher.getUser().setAccount(user);
		updateteaservice.updateTeaPassword(teacher);
		return "../blankTeacherPage.html";
	}
	@RequestMapping("/updatetel")
	public String updateTeaTel(HttpServletRequest req,Integer telephone){
		String account = (String) req.getSession().getAttribute("account");
		updateteaservice.updateTeaTel(account,telephone);
		return"../blankTeacherPage.html";
	}
}
