package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Student;

@Mapper
public interface StudentMapper {

	public Student login(@Param("id") String id, @Param("password") String password);
}
