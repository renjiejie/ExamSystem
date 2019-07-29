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
	
	@RequestMapping(value="/addUser/{account}/{password}/{permission}",method=RequestMethod.GET)
	@ResponseBody
	public String addUser(@PathVariable("account")String account, @PathVariable("password")String password,@PathVariable("permission")String permission) {
		System.out.println("123");
		adminService.addUser(account, password, permission);
		return "success";
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
	
	@RequestMapping(value="/delete/{account}")
	@ResponseBody
	public String deleteUser(@PathVariable("account")String account) {
		System.out.println("delete");
		List<User> users = adminService.query(account);
		String permission;
		if(users.isEmpty() || users.size() != 1) {
			return "fail";
		} else {
			permission = users.get(0).getPermission();
		}
		adminService.deleteUser(account,permission);
		return "success";
	}
	
	@RequestMapping(value="/update/{account}/{password}")
	@ResponseBody
	public String updateUserPassword(@PathVariable("account")String account, @PathVariable("password")String password) {
		List<User> users = adminService.query(account);
		if(users.isEmpty() || users.size()!=1) {
			return "error";
		} else {
			adminService.updatePassword(account, password);
			return "success";
		}
	}
}
