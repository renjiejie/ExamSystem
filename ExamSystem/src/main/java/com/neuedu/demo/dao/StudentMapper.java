package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Examination;
import com.neuedu.demo.domain.Student;

@Mapper
public interface StudentMapper {

	public Student login(@Param("id") String id, @Param("password") String password);
	
	public List<Examination> searchExam(@Param("studentId") String studentId, @Param("examId") String examID);
}
