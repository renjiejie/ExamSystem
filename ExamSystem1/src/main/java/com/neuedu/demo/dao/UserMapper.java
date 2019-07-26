package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.User;

@Mapper
public interface UserMapper {
	public User login(@Param("account")String account, @Param("password")String password);
}
