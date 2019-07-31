package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Answer;
import com.neuedu.demo.domain.RealAnswer;

@Mapper
public interface AnswerMapper {
	public List<RealAnswer> getAnswers(@Param("examId") String examId);
	public RealAnswer getAnswerById(@Param("answerId") String answerId);
	public void updateScore(@Param("answerId") String answerId,@Param("result") String result);
	public void updateResult(@Param("answerId")String answerId, @Param("result")Integer result);
}
