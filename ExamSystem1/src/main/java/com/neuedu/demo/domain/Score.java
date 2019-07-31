package com.neuedu.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Score {
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
	public Score(String result, String pointStr) {
		super();
		this.result = result;
		this.pointStr = pointStr;
	}
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
