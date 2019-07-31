package com.neuedu.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	public List<Exam> joinExam(HttpServletRequest req){
		exams = studentService.joinExam((String) req.getSession().getAttribute("account"));
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
	@RequestMapping("/input/{examId}/{answerStr}")
	@ResponseBody
	public String submitAnswer(HttpServletRequest req,@PathVariable("examId")String examId
			,@PathVariable("answerStr")String answerStr) {
		String paperId=null;
		for(Exam exam:exams) {
			if(exam.getId().equals(examId)) {
				paperId = exam.getPapers().getId();
			}
		}
		System.out.println((String) req.getSession().getAttribute("account"));
		String studentAccount = (String) req.getSession().getAttribute("account");
		studentService.submitAnswer(answerStr, examId, studentAccount,paperId);
		return "提交成功";
	}
	@ResponseBody
	public List<Score> scoreQuery(HttpServletRequest req){
		return studentService.scoreQuery((String) req.getSession().getAttribute("account"));
	}
<<<<<<< HEAD
	
	@RequestMapping("/queryScoreByExam/{exam}")
	@ResponseBody
	public List<Score> queryScoreByExam(HttpServletRequest req, @PathVariable("exam") String exam) {
		if(exam.equals("All")) {
			exam = null;
		}
		return studentService.queryScoreByExam((String) req.getSession().getAttribute("account"), exam);
=======
	@RequestMapping("/pratice")
	@ResponseBody
	public List<Question> mockExam(){
		return studentService.mockExam();
>>>>>>> a82295c215959a866b26adb47c99adca6389226e
	}
}
