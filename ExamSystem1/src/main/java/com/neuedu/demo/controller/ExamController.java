package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.service.ExamService;

@Controller
@RequestMapping("/exams")
public class ExamController {
	@Autowired
	private ExamService examService;
	
	@RequestMapping("/queryAll/{courseId}")
	@ResponseBody
	public List<Exam> getExams(@PathVariable("courseId")String courseId){
		if(courseId.equals("All")) {
			courseId = null;
		}
		return examService.getExams(courseId);
	}
	
	@RequestMapping("/time/{examId}")
	@ResponseBody
	public String getExamTime(@PathVariable("examId")String examId){
		return examService.getExamTime(examId);
	}
	
	@RequestMapping(value="/check/{examId}")
	@ResponseBody
	public String Redirect(@PathVariable("examId")String examId){
		System.out.println("redirect "+examId);
		return "/exam/answercardList.html";
	}
	
	@RequestMapping(value="/getPaperPoint/{examId}")
	@ResponseBody
	public String getPaperPoint(@PathVariable("examId")String examId){
		System.out.println("getExamPoint "+examId);
		return examService.getPaperPoint(examId);
	}
	
}
