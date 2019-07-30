package com.neuedu.demo.domain;

public class RealAnswer {
	private int id;
	private Exam exam;
	private User student;
	private String content;
	private User teacher;
	private Paper paper;
	private String points;
	private int result;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getTeacher() {
		return teacher;
	}
	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public RealAnswer(int id, Exam exam, User student, String content, Paper paper) {
		super();
		this.id = id;
		this.exam = exam;
		this.student = student;
		this.content = content;
		this.paper = paper;
	}
	public RealAnswer() {
		super();
	}
	@Override
	public String toString() {
		return "RealAnswer [id=" + id + ", exam=" + exam + ", student=" + student + ", content=" + content
				+ ", teacher=" + teacher + ", paper=" + paper + ", points=" + points + ", result=" + result + "]";
	}
	
	
}
