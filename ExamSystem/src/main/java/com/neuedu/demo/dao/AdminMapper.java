package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Admin;

@Mapper
public interface AdminMapper {

	public Admin login(@Param("id") String id, @Param("password") String password);
}
