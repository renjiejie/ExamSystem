package com.neuedu.demo.domain;

public class Exam {
	private String id;
	private String name;
	private String begintime;
	private String endtime;
	private String courseId;
	private int period;
	private String discript;
	private String supervisor;
	private String place;
	private String paperId;
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
	public Exam(String id, String name, String begintime, String endtime, String courseId, int period, String discript,
			String supervisor, String place, String paperId) {
		super();
		this.id = id;
		this.name = name;
		this.begintime = begintime;
		this.endtime = endtime;
		this.courseId = courseId;
		this.period = period;
		this.discript = discript;
		this.supervisor = supervisor;
		this.place = place;
		this.paperId = paperId;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
