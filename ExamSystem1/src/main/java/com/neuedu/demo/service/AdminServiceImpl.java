package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neuedu.demo.dao.AdminMapper;
import com.neuedu.demo.domain.Admin;
import com.neuedu.demo.domain.Course;
import com.neuedu.demo.domain.User;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper mapper;
	
	@Override
	public void addUser(String account,String password,String permission) {
		if(permission.equals("管理员")) {
			mapper.addAdmin(account, password);
		}
		else if(permission.equals("学生")) {
			mapper.addStudent(account, password);
		}
		else if(permission.equals("教师")) {
			mapper.addTeacher(account, password);
		}
	}

	@Override
	public List<User> query(String account) {
		List<User> users = mapper.query(account);
		return users;
	}

	@Override
	public void deleteUser(String account, String permission) {
		if(permission.equals("管理员")) {
			mapper.deleteAdmin(account);
		}
		else if(permission.equals("学生")) {
			mapper.deleteStudent(account);
		}
		else if(permission.equals("教师")) {
			mapper.deleteTeacher(account);
		}
		
	}

	@Override
	public void updatePassword(String account, String password) {
		mapper.updatePassword(account, password);
	}

	@Override
	public void addCourse(String courseName) {
		mapper.addCourse(courseName);
		
	}

	@Override
	public List<Course> queryCourseRelation(String course, String teacher) {
		return mapper.queryCourseRelation(course, teacher);
	}

	@Override
	public Course queryCourse(String course) {
		return mapper.queryCourse(course);
	}

	@Override
	public void assignCourseRelation(String course, String teacher) {
		mapper.assignCourseRelation(course, teacher);
		
	}

	@Override
	public void deleteCourseRelation(String course, String teacher) {
		mapper.deleteCourseRelation(course, teacher);
	}

	@Override
	public void deleteCourse(String course) {
		mapper.deleteCourse(course);
	}

}
