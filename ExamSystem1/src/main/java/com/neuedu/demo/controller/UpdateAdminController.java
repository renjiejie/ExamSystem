package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Admin;
import com.neuedu.demo.service.UpdateAdminService;

@Controller
@RequestMapping("/admin")
public class UpdateAdminController {
	@Autowired
	private UpdateAdminService updateadminservice;
	@RequestMapping("/updatepassword")
	public String updateAdminPassword(HttpServletRequest req,Admin admin){
		String user = (String) req.getSession().getAttribute("account");
		admin.getUser().setAccount(user);
		updateadminservice.updateAdminPassword(admin);
		return"../admin.html";
	}
}
