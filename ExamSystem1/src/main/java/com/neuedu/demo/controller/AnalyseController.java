package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Analyse;
import com.neuedu.demo.service.AnalyseService;

@Controller
@RequestMapping("/analyse")
public class AnalyseController {
	@Autowired
	private AnalyseService analyseService;
	
	@RequestMapping(value = "/query/{courseId}",method=RequestMethod.GET)
	@ResponseBody
	public List<Analyse> query(@PathVariable("courseId") String courseId){
			System.out.println(courseId);
			return analyseService.query(courseId);

	}
}
