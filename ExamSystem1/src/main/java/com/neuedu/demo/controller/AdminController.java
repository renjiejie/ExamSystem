package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.User;
import com.neuedu.demo.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/addUser")
	public String addUser(String account, String password,String permission) {
		adminService.addUser(account, password, permission);
		return "../adminmanage2.html";
	}
	
	@RequestMapping(value="/query/{account}",method=RequestMethod.GET)
	@ResponseBody
	public List<User> query(@PathVariable("account") String account) {
		if(!account.equals("All")){
			return adminService.query(account);
		}
		else{
			return adminService.query(null);
		}
	}
	
	@RequestMapping(value="/delete/{account}/{permission}")
	public String deleteUser(@PathVariable("account")String account, @PathVariable("permission")String permission) {
		System.out.println("123");
		adminService.deleteUser(account,permission);
		return "../adminmanage2.html";
	}
}
