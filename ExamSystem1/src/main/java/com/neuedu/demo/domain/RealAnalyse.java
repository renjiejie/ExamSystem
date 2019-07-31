package com.neuedu.demo.domain;

public class RealAnalyse {
	private String examId;
	private Integer examPeople;
	private Integer examPassPeople;
	private float examAverage;
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
	public float getExamAverage() {
		return examAverage;
	}
	public void setExamAverage(float examAverage) {
		this.examAverage = examAverage;
	}
	
	
	
	public RealAnalyse(String examId, Integer examPeople, Integer examPassPeople, float examAverage) {
		super();
		this.examId = examId;
		this.examPeople = examPeople;
		this.examPassPeople = examPassPeople;
		this.examAverage = examAverage;
	}
	public RealAnalyse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
