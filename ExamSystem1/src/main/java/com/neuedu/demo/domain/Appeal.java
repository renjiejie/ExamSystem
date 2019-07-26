package com.neuedu.demo.domain;

public class Appeal {
	private int id;
	private Paper paper;
	private String course;
	private Student student;
	private Teacher teacher;
	private String content;
	private String reply;
	public Appeal(int id, Paper paper, String course, Student student, Teacher teacher, String content, String reply) {
		super();
		this.id = id;
		this.paper = paper;
		this.course = course;
		this.student = student;
		this.teacher = teacher;
		this.content = content;
		this.reply = reply;
	}
	public Appeal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
}
