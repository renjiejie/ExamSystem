package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Admin;

@Mapper
public interface AdminMapper {

	public void addStudent(@Param("account") String account, @Param("password") String password);
	public void addAdmin(@Param("account") String account, @Param("password") String password);
	public void addTeacher(@Param("account") String account, @Param("password") String password);
}
