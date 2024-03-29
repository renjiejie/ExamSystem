package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Analyse;
import com.neuedu.demo.domain.Course;
import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.domain.User;
import com.neuedu.demo.service.AdminService;
import com.neuedu.demo.service.AnalyseService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AnalyseService analyseService;

	@RequestMapping(value = "/addUser/{account}/{password}/{permission}", method = RequestMethod.GET)
	@ResponseBody
	public String addUser(@PathVariable("account") String account, @PathVariable("password") String password,
			@PathVariable("permission") String permission) {
		adminService.addUser(account, password, permission);
		return "success";
	}

	@RequestMapping(value = "/query/{account}", method = RequestMethod.GET)
	@ResponseBody
	public List<User> query(@PathVariable("account") String account) {
		if (!account.equals("All")) {
			return adminService.query(account);
		} else {
			return adminService.query(null);
		}
	}

	@RequestMapping(value = "/delete/{account}")
	@ResponseBody
	public String deleteUser(@PathVariable("account") String account) {
		System.out.println("delete");
		List<User> users = adminService.query(account);
		String permission;
		if (users.isEmpty() || users.size() != 1) {
			return "fail";
		} else {
			permission = users.get(0).getPermission();
		}
		adminService.deleteUser(account, permission);
		return "success";
	}

	@RequestMapping(value = "/update/{account}/{password}")
	@ResponseBody
	public String updateUserPassword(@PathVariable("account") String account,
			@PathVariable("password") String password) {
		List<User> users = adminService.query(account);
		if (users.isEmpty() || users.size() != 1) {
			return "error";
		} else {
			adminService.updatePassword(account, password);
			return "success";
		}
	}

	@RequestMapping(value = "/queryCourseRelation/{course}/{teacher}")
	@ResponseBody
	public List<Course> queryCourseRelation(@PathVariable("course") String course,
			@PathVariable("teacher") String teacher) {
		if (course.equals("All")) {
			course = null;
		}
		if (teacher.equals("All")) {
			teacher = null;
		}
		return adminService.queryCourseRelation(course, teacher);
	}

	@RequestMapping(value = "/addCourseRelation/{course}/{teacher}")
	@ResponseBody
	public String addCourseRelation(@PathVariable("course") String course, @PathVariable("teacher") String teacher) {
		List<User> users = adminService.query(teacher);
		if (users.isEmpty() || users.size() != 1 || !users.get(0).getPermission().equals("教师")) {
			System.out.print(users);
			return "error";
		} else {
			Course c = adminService.queryCourse(course);
			System.out.println(c);
			if (c == null) {
				adminService.addCourse(course);
			}
			adminService.assignCourseRelation(course, teacher);
			return "success";
		}
	}

	@RequestMapping(value = "/deleteCourseRelation/{course}/{teacher}")
	@ResponseBody
	public String deleteCourseRelation(@PathVariable("course") String course, @PathVariable("teacher") String teacher) {
		List<Course> courses = adminService.queryCourseRelation(course, teacher);
		if (courses.isEmpty() || courses.size() != 1) {
			return "error";
		} else {
			Course c = courses.get(0);
			if (!c.getCourseName().equals(course) || !c.getTeacherID().equals(teacher)) {
				return "error";
			}
			adminService.deleteCourseRelation(course, teacher);
			return "success";
		}
	}

	@RequestMapping(value = "/addExam/{exam}/{course}/{description}/{start}/{duration}/{end}/{place}/{supervisor}/{paper}")
	@ResponseBody
	public String addExam(@PathVariable("exam") String exam, @PathVariable("course") String course,
			@PathVariable("description") String description, @PathVariable("start") String start,
			@PathVariable("duration") String duration, @PathVariable("end") String end,
			@PathVariable("place") String place, @PathVariable("supervisor") String supervisor,
			@PathVariable("paper") String paper) {
		adminService.addExam(exam, course, description, start, duration, end, place, supervisor, paper);
		return "success";
	}

	@RequestMapping(value = "/queryExam/{exam}")
	@ResponseBody
	public List<Exam> queryExam(@PathVariable("exam") String exam) {
		if (exam.equals("All")) {
			exam = null;
		}
		return adminService.queryExam(exam);
	}

	@RequestMapping(value = "/deleteExam/{exam}")
	@ResponseBody
	public String deleteExam(@PathVariable("exam") String exam) {
		List<Exam> exams = adminService.queryExam(exam);
		if (exams.isEmpty() || exams.size() != 1) {
			return "error";
		}
		adminService.deleteExam(exam);
		return "success";
	}

	@RequestMapping(value = "/updateExam/{exam}/{course}/{description}/{start}/{duration}/{end}/{place}/{supervisor}/{paper}")
	@ResponseBody
	public String updateExam(@PathVariable("exam") String exam, @PathVariable("course") String course,
			@PathVariable("description") String description, @PathVariable("start") String start,
			@PathVariable("duration") String duration, @PathVariable("end") String end,
			@PathVariable("place") String place, @PathVariable("supervisor") String supervisor,
			@PathVariable("paper") String paper) {
		List<Exam> exams = adminService.queryExam(exam);
		if (exams.isEmpty() || exams.size() != 1) {
			return "error";
		}
		adminService.updateExam(exam, course, description, start, duration, end, place, supervisor, paper);
		return "success";
	}
	
	@RequestMapping(value="/queryResult/{exam}")
	@ResponseBody
	public List<Analyse> queryResult(@PathVariable("exam") String exam) {
		if(exam.equals("All"))
		{
			exam = null;
		}
		return analyseService.queryByExam(exam);
	}
	
	@RequestMapping(value="/queryPaperByCourse/{course}")
	@ResponseBody
	public List<String> queryPaperByCourse(@PathVariable("course") String course) {
		return adminService.queryPaperByCourse(course);
	}

}
