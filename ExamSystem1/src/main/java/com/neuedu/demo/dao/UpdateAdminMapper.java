package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Admin;

@Mapper
public interface UpdateAdminMapper {
	public void updateAdminPassword(Admin admin);
}
