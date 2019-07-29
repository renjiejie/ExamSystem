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
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.User;
import com.neuedu.demo.service.AdminService;
import com.neuedu.demo.service.PaperService;

import ch.qos.logback.core.net.SyslogOutputStream;

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
	
	@RequestMapping(value = "/query/{paperId}/{courseId}",method=RequestMethod.GET)
	@ResponseBody
	public List<Paper> query(@PathVariable("paperId") String paperId,@PathVariable("courseId") String courseId){
		if(!paperId.equals("All")){
			return pService.query(paperId,courseId);
		}
		else{
			return pService.query(null,courseId);
		}
	}
	
	@RequestMapping(value="/delete/{paperId}")
	public String deletePaper(@PathVariable("paperId")String paperId){
		System.out.println("delete"+paperId);
		pService.deletePaper(paperId);
		return "redirect:../../paperManage.html";
	}
	
	@RequestMapping(value="/change/{paperId}")
	public String Redirect(@PathVariable("paperId")String paperId){
		System.out.println("change"+paperId);
		return "redirect:../../teacherChangePaper.html?id="+paperId;
	}
	
	
}
