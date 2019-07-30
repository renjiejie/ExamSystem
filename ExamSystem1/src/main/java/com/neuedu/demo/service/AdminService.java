package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Course;
import com.neuedu.demo.domain.User;

public interface AdminService {

	public void addUser(String account, String password, String permission);

	public List<User> query(String account);

	public void deleteUser(String account, String permission);

	public void updatePassword(String account, String password);

	public void addCourse(String courseName);

	public List<Course> queryCourseRelation(String course, String teacher);

	public Course queryCourse(String course);

	public void assignCourseRelation(String course, String teacher);

	public void deleteCourseRelation(String course, String teacher);

	public void deleteCourse(String course);

	public void addExam(String exam, String course, String description, String start, String duration, String end,
			String place, String supervisor, String paper);
}
