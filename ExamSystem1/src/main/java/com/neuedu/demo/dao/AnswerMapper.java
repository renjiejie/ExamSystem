package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.RealAnswer;

@Mapper
public interface AnswerMapper {
	public List<RealAnswer> getAnswers(@Param("examId") String examId);
}
