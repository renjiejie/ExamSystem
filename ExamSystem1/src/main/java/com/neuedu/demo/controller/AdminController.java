package com.neuedu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Admin;
import com.neuedu.demo.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/addUser")
	public void addUser(String account, String password,String permission) {
		System.out.println("aaaaa");
		adminService.addUser(account, password, permission);
	}
}
