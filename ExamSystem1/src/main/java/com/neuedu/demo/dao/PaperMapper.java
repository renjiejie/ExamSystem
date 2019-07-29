package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Question;

@Mapper
public interface PaperMapper {
	public void addPaper(Paper paper);
	public List<Paper> query(@Param("paperId")String paperId,@Param("courseId")String courseId);
	public void deletePaper(@Param("paperId")String paperId);
}
