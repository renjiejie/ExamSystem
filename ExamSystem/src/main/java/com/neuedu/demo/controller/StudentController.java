package com.neuedu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Student;
import com.neuedu.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/login")
	public String login(String username, String password) {
		System.out.println("Controller");
		Student s = studentService.login(username, password);
		if(s != null) {
			return "/success.html";
		}
		return "/login.html";
	}
}
