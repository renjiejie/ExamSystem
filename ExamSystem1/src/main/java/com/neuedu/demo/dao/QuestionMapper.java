package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Question;

@Mapper
public interface QuestionMapper {
	public void addQuestion(Question question);

}
