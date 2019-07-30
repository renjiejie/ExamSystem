package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Student;
import com.neuedu.demo.domain.User;
import com.neuedu.demo.service.UpdateStuService;

@Controller
@RequestMapping("/student")
public class UpdateStuController {
	@Autowired
	private UpdateStuService updatestuservice;
	@RequestMapping("/updatepassword")
	public String updateStuPassword(HttpServletRequest req,Student student){
		String user = (String) req.getSession().getAttribute("account");
		student.getUser().setAccount(user);
		updatestuservice.updateStuPassword(student);
		return "../blankStudentPage.html";
	}
	@RequestMapping("/updatetel")
	public String updateStuTel(HttpServletRequest req,Integer telephone){
		String account = (String) req.getSession().getAttribute("account");
		System.out.println(account);
		System.out.println(telephone);
		updatestuservice.updateStuTel(account,telephone);
		return"../blankStudentPage.html";
	}
}
