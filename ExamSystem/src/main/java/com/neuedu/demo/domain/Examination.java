package com.neuedu.demo.domain;

public class Examination {

	private String id;
	private String subject;
	private Double score;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Examination(String id, String subject, Double score) {
		super();
		this.id = id;
		this.subject = subject;
		this.score = score;
	}
}
