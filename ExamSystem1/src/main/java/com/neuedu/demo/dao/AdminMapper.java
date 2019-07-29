package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Admin;
import com.neuedu.demo.domain.Course;
import com.neuedu.demo.domain.Student;
import com.neuedu.demo.domain.User;

@Mapper
public interface AdminMapper {

	public void addStudent(@Param("account") String account, @Param("password") String password);
	public void addAdmin(@Param("account") String account, @Param("password") String password);
	public void addTeacher(@Param("account") String account, @Param("password") String password);
	public List<User> query(String account);
	public void deleteStudent(String account);
	public void deleteTeacher(String account);
	public void deleteAdmin(String account);
	public void updatePassword(@Param("account")String account, @Param("password")String password);
	public void addCourse(String courseName);
	public List<Course> queryCourseRelation(@Param("course") String course, @Param("teacher") String teacher);
	public Course queryCourse(String courseName);
	public void assignCourseRelation(@Param("course") String course, @Param("teacher") String teacher);
	public void deleteCourseRelation(@Param("course") String course, @Param("teacher") String teacher);
	public void deleteCourse(String course);
}
