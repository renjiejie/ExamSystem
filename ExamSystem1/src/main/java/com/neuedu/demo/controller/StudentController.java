package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.neuedu.demo.domain.*;
import com.neuedu.demo.domain.Student;
import com.neuedu.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/join")
	@ResponseBody
	public List<Exam> joinExam(){
		return studentService.joinExam();
	}
	
}
