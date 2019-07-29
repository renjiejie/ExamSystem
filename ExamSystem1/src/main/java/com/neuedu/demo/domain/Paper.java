package com.neuedu.demo.domain;

import java.util.List;

public class Paper {
	private String id;
	private String course;
	private List<Question> questions;
	private Teacher producer;
	private int passPoint;
	private int fullPoint;
	private String questionStr;
	public Paper(String id, String course, List<Question> questions, int passPoint, int fullPoint,String questionStr) {
		super();
		this.id = id;
		this.course = course;
		this.questions = questions;
		this.passPoint = passPoint;
		this.fullPoint = fullPoint;
		this.questionStr = questionStr;
	}
	public String getQuestionStr() {
		return questionStr;
	}
	public void setQuestionStr(String questionStr) {
		this.questionStr = questionStr;
	}
	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public Teacher getProducer() {
		return producer;
	}
	public void setProducer(Teacher producer) {
		this.producer = producer;
	}
	public int getPassPoint() {
		return passPoint;
	}
	public void setPassPoint(int passPoint) {
		this.passPoint = passPoint;
	}
	public int getFullPoint() {
		return fullPoint;
	}
	public void setFullPoint(int fullPoint) {
		this.fullPoint = fullPoint;
	}
	@Override
	public String toString() {
		return "Paper [id=" + id + ", course=" + course + ", questions=" + questions + ", producer=" + producer
				+ ", passPoint=" + passPoint + ", fullPoint=" + fullPoint + ", questionStr=" + questionStr + "]";
	}
	
}
