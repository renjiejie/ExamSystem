package com.neuedu.demo.domain;

public class Course {

	private String courseName;
	private String teacherID;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(String courseName, String teacherID) {
		super();
		this.courseName = courseName;
		this.teacherID = teacherID;
	}
	
	
}
