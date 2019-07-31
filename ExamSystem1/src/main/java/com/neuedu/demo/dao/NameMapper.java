package com.neuedu.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NameMapper {
	public String queryStuName(@Param("account")String account );
	public String queryTeaName(@Param("account")String account );
}
