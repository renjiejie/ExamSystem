package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Analyse;
import com.neuedu.demo.domain.RealAnalyse;

@Mapper
public interface AnalyseMapper {
	public List<Analyse> query(@Param("courseId")String courseId );
	public String queryExamId(@Param("courseId")String courseId );
	public Integer queryExamPeople(@Param("examId")String examId);
	public String queryPaperId(@Param("examId")String examId);
	public Integer queryExamPassPeople(@Param("examId")String examId ,@Param("paperId")String paperId);
	public Double queryExamAverage(@Param("examId")String examId);
	
	
	public List<Analyse> queryByExam(String exam);
}
