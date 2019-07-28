package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Question;

@Mapper
public interface QuestionMapper {
	public void addQuestion(Question question);
	public List<Question> query(@Param("questionId")String questionId,@Param("courseId")String courseId);
	public void deleteQuestion(@Param("questionId")String questionId);

}
