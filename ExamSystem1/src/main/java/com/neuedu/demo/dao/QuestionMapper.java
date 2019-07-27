package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Question;

@Mapper
public interface QuestionMapper {
	public void addQuestion(Question question);
	public List<Question> query(String questionId);

}
