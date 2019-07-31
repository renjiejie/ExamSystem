package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Teacher;

@Mapper
public interface UpdateTeaMapper {
	public void updateTeaPassword(Teacher teacher);
	public void updateTeaTel(@Param("account")String account,  @Param("telephone") Integer telephone);
}
