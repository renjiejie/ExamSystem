package com.neuedu.demo.controller;

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
	public String login(String account, String password) {
		System.out.print("aaaa");
		User a = userService.login(account, password);
		
		if(a != null) {
			String permission = a.getPermission();
			if(permission.equals("学生")) {
				return "../blankStudentPage.html";
			} else if(permission.equals("老师")) {
				return "../blankTeacherPage.html";
			} else if(permission.equals("管理员")){
				return "../admin.html";
			}
		}
		return "../login1.html";
	}
}
