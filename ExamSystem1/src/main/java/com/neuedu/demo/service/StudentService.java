package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.Score;

public interface StudentService {
	public List<Paper> getPaperId(String examId);
	public List<Exam> joinExam( String studentAccount);
	public void submitAnswer(String answerStr,String examId,String studentAccount,String paperId);
	public List<Score> scoreQuery(String studentId);
	public List<Score> queryScoreByExam(String student, String exam);
	public List<Question> mockExam();
}
