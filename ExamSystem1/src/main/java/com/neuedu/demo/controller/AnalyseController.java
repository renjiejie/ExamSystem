package com.neuedu.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.demo.domain.Analyse;
import com.neuedu.demo.domain.RealAnalyse;
import com.neuedu.demo.service.AnalyseService;

@Controller
@RequestMapping("/analyse")
public class AnalyseController {
	@Autowired
	private AnalyseService analyseservice;
	
	@RequestMapping(value = "/query/{courseId}",method=RequestMethod.GET)
	@ResponseBody
	public List<Analyse> query(@PathVariable("courseId") String courseId){
		System.out.println(courseId);
		return analyseservice.query(courseId);

}
//	public List<RealAnalyse> query(@PathVariable("courseId") String courseId){
//		analyseservice.queryExamId(courseId);
//		List<RealAnalyse> realanalyse = new ArrayList<RealAnalyse>() ;
//		realanalyse.
//	}
//	public String queryExamId(@PathVariable("courseId") String courseId )
//	public Integer queryExamPeople(String examId);
//	public String queryPaperId(String examId);
//	public Integer queryExamPassPeople(String examId ,String paperId);
//	public Double queryExamAverage(String examId);
//	
}
