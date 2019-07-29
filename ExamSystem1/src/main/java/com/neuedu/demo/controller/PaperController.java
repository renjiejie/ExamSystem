package com.neuedu.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.User;
import com.neuedu.demo.service.AdminService;
import com.neuedu.demo.service.PaperService;

@Controller
@RequestMapping("/paper")
public class PaperController {
	
	@Autowired
	private PaperService pService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public String addPaper(@RequestBody Paper paper){
		System.out.println("add paper");
		System.out.println(paper);
		pService.addPaper(paper);
		return "/exam/generatePaper.html";
	}
	
}
