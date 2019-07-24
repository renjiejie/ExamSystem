package com.neuedu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Admin;
import com.neuedu.demo.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/login")
	public String login(String username, String password) {
		Admin a = adminService.login(username, password);
		if(a != null) {
			return "/success.html";
		}
		return "/login.html";
	}
}
