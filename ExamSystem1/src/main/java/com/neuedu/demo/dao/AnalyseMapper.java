package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Analyse;

@Mapper
public interface AnalyseMapper {
	public List<Analyse> query(@Param("courseId")String courseId );
	
	public List<Analyse> queryByExam(String exam);
}
