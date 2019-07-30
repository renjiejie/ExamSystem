package com.neuedu.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.PaperMapper;
import com.neuedu.demo.dao.QuestionMapper;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Question;

@Service
public class PaperServiceImpl implements PaperService{

	@Autowired
	private PaperMapper mapper;
	
	@Autowired
	private QuestionMapper qmapper;
	
	@Override
	public void addPaper(Paper paper) {
		mapper.addPaper(paper);
		
	}

	@Override
	public List<Paper> query(String paperId, String courseId) {
		return mapper.query(paperId, courseId);
	}

	@Override
	public void deletePaper(String paperId) {
		mapper.deletePaper(paperId);
	}

	@Override
	public List<Question> showQuestions(String paperId) {
		Paper paper = mapper.queryById(paperId);
		String[] questions = paper.getQuestionStr().split(",");
		List<Question> results= new ArrayList<>(); 
		for(String str:questions){
			Question question = qmapper.queryById(str);
			results.add(question);
		}
		return results;
	}

	@Override
	public void deletePaperQuestion(String paperId, String questionId) {
		Paper paper = mapper.queryById(paperId);
		String[] questions = paper.getQuestionStr().split(",");
		ArrayList<String> resulttemp = new ArrayList<>();
		for(String str:questions){
			if(!str.equals(questionId)){
				resulttemp.add(str);
			}
		}
		String resultstr = "";
		for(int i=0;i<resulttemp.size();i++){
			if(i==0){
				resultstr += resulttemp.get(i);
			} else {
				resultstr += ","+resulttemp.get(i);
			}
		}
		paper.setQuestionStr(resultstr);
		mapper.updatePaper(paper);		
	}

	@Override
	public void addPaperQuestion(String paperId, String questionId) {
		System.out.println("addPaperQuestion");
		Paper paper = mapper.queryById(paperId);
		String[] questions = paper.getQuestionStr().split(",");
		for(String str:questions){
			if(str.equals(questionId)){
				return;
			}
		}
		String questionstr = paper.getQuestionStr();
		String result = questionstr.concat(","+questionId);
		paper.setQuestionStr(result);
		System.out.println(paper.getQuestionStr());
		mapper.updatePaper(paper);
	}

}
