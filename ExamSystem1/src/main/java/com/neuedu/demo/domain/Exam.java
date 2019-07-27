package com.neuedu.demo.domain;

public class Exam {
	private String id;
	private String name;
	private String begintime;
	private int period;
	private String endtime;
	private String courseId;
	private String discript;
	private String paperId;
	private String place;
	private String supervisor;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getDiscript() {
		return discript;
	}
	public void setDiscript(String discript) {
		this.discript = discript;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPaperId() {
		return paperId;
	}
	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}
	public Exam(String id, String name, String begintime, int period, String endtime, String courseId, String discript,
			String paperId, String place, String supervisor) {
		super();
		this.id = id;
		this.name = name;
		this.begintime = begintime;
		this.period = period;
		this.endtime = endtime;
		this.courseId = courseId;
		this.discript = discript;
		this.paperId = paperId;
		this.place = place;
		this.supervisor = supervisor;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
