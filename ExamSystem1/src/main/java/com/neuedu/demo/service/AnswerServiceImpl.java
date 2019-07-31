package com.neuedu.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	@Override
	public String checkObjectiveQuestions(String answerId) {
		RealAnswer ra = amapper.getAnswerById(answerId);
		String questionIds = ra.getContent().split("\\|")[1];
		String[] questions = questionIds.split("\\*");
		String answer = ra.getContent().split("\\|")[0];
		String[] answers = answer.split("\\*");
		String result = "";
		int score = 0;
		for(int i=0;i<questions.length;i++){
			String str = questions[i];
			if(str!=null&&!str.equals("")){
				Question question = qmapper.queryById(str);
				if(!question.getType().equals("简答")){
					if(!question.getType().equals("填空")){
						if(question.getAnswer().equals(answers[i])){
							result += question.getPoint() + "*";
							score+=question.getPoint();
						} else {
							result += 0 + "*";
						}
					} else {
						Pattern pattern = Pattern.compile(question.getAnswer());
						Matcher m = pattern.matcher(answers[i]);
						if(m.find()){
							result += question.getPoint() + "*";
							score+=question.getPoint();
						} else {
							result += 0 + "*";
						}
					}
				}
			}
		}
		amapper.updateScore(answerId,result);
		return ""+score;
	}

	@Override
	public void updateSubjectiveQuestions(String answerId,String scoreText) {
		RealAnswer ra = amapper.getAnswerById(answerId);
		String points = ra.getPoints();
	    points += scoreText;
	    ra.setPoints(points);
	    String[] scores = points.split("\\*");
	    int result = 0;
	    for(int i=0;i<scores.length;i++){
			String str = scores[i];
			if(str!=null&&!str.equals("")){
				result += Integer.parseInt(str);
			}
		}
	    amapper.updateScore(answerId, points);
	    amapper.updateResult(answerId, result);
	}
}
