package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.User;
import com.neuedu.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login(HttpServletRequest req,String account, String password) {
		System.out.println(account + "\n" + password);
		User a = userService.login(account, password);
		if(a != null) {
			String permission = a.getPermission();
			HttpSession session = req.getSession();
			session.setAttribute("account", account);
			session.setAttribute("password", password);
			if(permission.equals("学生")) {
				session.setAttribute("permission", "student");
				return "redirect:../blankStudentPage.html";
				
			} else if(permission.equals("教师")) {
				session.setAttribute("permission", "teacher");
				return "redirect:../blankTeacherPage.html";
			} else if(permission.equals("管理员")){
				session.setAttribute("permission", "admin");
				return "redirect:../admin.html";
			}
		}
		return "../login1.html";
	}
	
}
