package com.neuedu.demo.domain;

public class Analyse {
	private String examId;
	private Integer examPeople;
	private Integer examPassPeople;
	private Integer examAverage;
	private String courseId;
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public Integer getExamPeople() {
		return examPeople;
	}
	public void setExamPeople(Integer examPeople) {
		this.examPeople = examPeople;
	}
	public Integer getExamPassPeople() {
		return examPassPeople;
	}
	public void setExamPassPeople(Integer examPassPeople) {
		this.examPassPeople = examPassPeople;
	}
	public Integer getExamAverage() {
		return examAverage;
	}
	public void setExamAverage(Integer examAverage) {
		this.examAverage = examAverage;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public Analyse(String examId, Integer examPeople, Integer examPassPeople, Integer examAverage, String courseId) {
		super();
		this.examId = examId;
		this.examPeople = examPeople;
		this.examPassPeople = examPassPeople;
		this.examAverage = examAverage;
		this.courseId = courseId;
	}
	public Analyse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
