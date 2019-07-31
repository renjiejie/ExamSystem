package com.neuedu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.service.NameService;

@Controller
@RequestMapping("/query")
public class NameController {
	@Autowired
	private NameService nameservice;
	@RequestMapping("/stuname")
	@ResponseBody
	public String queryStuName(HttpServletRequest req){
		String user = (String) req.getSession().getAttribute("account");
		return nameservice.queryStuName(user);
	}
	@RequestMapping("/teaname")
	@ResponseBody
	public String queryTeaName(HttpServletRequest req){
		String user = (String) req.getSession().getAttribute("account");
		return nameservice.queryTeaName(user);
	}
}
