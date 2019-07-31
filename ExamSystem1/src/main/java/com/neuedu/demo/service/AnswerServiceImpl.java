package com.neuedu.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.AnswerMapper;
import com.neuedu.demo.dao.PaperMapper;
import com.neuedu.demo.dao.QuestionMapper;
import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.RealAnswer;

@Service
public class AnswerServiceImpl implements AnswerService {
	
	@Autowired
	private AnswerMapper amapper;
	
	@Autowired
	private PaperMapper pmapper;
	
	@Autowired
	private QuestionMapper qmapper;
	
	public List<RealAnswer> getAnswers(String examId){
		return amapper.getAnswers(examId);
	}
	
	public Map<String,Map<String,Object>> getSubjectiveQuestions(String answerId){
		RealAnswer ra = amapper.getAnswerById(answerId);
		Map<String,Map<String,Object>> results= new HashMap<>();
		String questionIds = ra.getContent().split("\\|")[1];
		String[] questions = questionIds.split("\\*");
		String answer = ra.getContent().split("\\|")[0];
		String[] answers = answer.split("\\*");
		for(int i=0;i<questions.length;i++){
			String str = questions[i];
			if(str!=null&&!str.equals("")){
				System.out.println("questionId"+str);
				Question question = qmapper.queryById(str);
				if(question.getType().equals("简答")){
					Map<String,Object> properties = new HashMap<String, Object>();
					properties.put("question",question);
					properties.put("answer",answers[i]);
					results.put(str, properties);
				}
			}
		}
		return results;
	}
}
