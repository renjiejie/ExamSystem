package com.neuedu.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Score {
	private String id;
	private String exam;
	private String result;
	private String pointStr;
	private List<String> point = new ArrayList<String>();
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getPointStr() {
		return pointStr;
	}
	public void setPointStr(String pointStr) {
		this.pointStr = pointStr;
	}
	public List<String> getPoint() {
		return point;
	}
	public void setPoint(List<String> point) {
		this.point = point;
	}
	public void addPoint(String point) {
		this.point.add(point);
	}
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Score(String result, String pointStr, String exam, String id) {
		super();
		this.result = result;
		this.pointStr = pointStr;
		this.exam = exam;
		this.id = id;
	}
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
