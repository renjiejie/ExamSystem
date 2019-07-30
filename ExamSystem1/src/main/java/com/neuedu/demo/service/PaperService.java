package com.neuedu.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.User;

public interface PaperService {

	public void addPaper(Paper paper);
	public List<Paper> query(String paperId,String courseId);
	public void deletePaper(String paperId);
	public List<Question> showQuestions(String paperId);
	public void deletePaperQuestion(String paperId, String questionId);
}
