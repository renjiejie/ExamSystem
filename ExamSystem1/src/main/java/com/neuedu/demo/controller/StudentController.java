package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	private List<Exam> exams;
	@RequestMapping("/join")
	@ResponseBody
	public List<Exam> joinExam(){
		exams = studentService.joinExam();
		return exams;
	}
	@RequestMapping("/take/{examId}")
	@ResponseBody
	public List<Question> takeExam(@PathVariable("examId")String examId){
		for(Exam exam:exams) {
			if(exam.getId().equals(examId)) {
				return exam.getPapers().getQuestions();
			}
		}
		return null;
	}
}
