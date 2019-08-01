package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
	public List<String> getAllCourse();
}
