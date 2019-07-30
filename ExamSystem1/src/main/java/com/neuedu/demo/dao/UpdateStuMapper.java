package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Student;

@Mapper
public interface UpdateStuMapper {
	public void updateStuPassword(Student student);
	public void updateStuTel(@Param("account")String account,  @Param("telephone") Integer telephone);
}

