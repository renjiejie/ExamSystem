package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Appeal;

@Mapper
public interface AppealMapper {
	public void addAppeal(Appeal appeal);
	public void updateAppeal();
}
