package com.neuedu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.demo.domain.Appeal;
import com.neuedu.demo.service.AppealService;

@Controller
@RequestMapping("/appeal")
public class AppealController {
	@Autowired
	private AppealService appealservice;
	
	@RequestMapping("/add")
	public String addAppeal(Appeal appeal) {		
		appealservice.addAppeal(appeal);
		appealservice.updateAppeal();	
		return "../studentAppeal.html";
	}
	
}
