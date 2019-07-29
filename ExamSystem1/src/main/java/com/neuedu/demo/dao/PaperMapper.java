package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Paper;

@Mapper
public interface PaperMapper {
	public void addPaper(Paper paper);
}
