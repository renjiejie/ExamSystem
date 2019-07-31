package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Exam;

@Mapper
public interface ExamMapper {
	public List<Exam> getExams(@Param("courseId") String courseId);
}
