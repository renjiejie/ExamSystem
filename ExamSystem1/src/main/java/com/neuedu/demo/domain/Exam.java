package com.neuedu.demo.domain;

import java.util.Date;
import java.util.List;

public class Exam {
	private String id;
	private String begintime;
	private String endtime;
	private String courseId;
	private int period;
	private String discript;
	private String supervisor;
	private String place;
	private Paper papers;
	private String ids;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Paper getPapers() {
		return papers;
	}
	public void setPapers(Paper papers) {
		this.papers = papers;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public Exam(String id, String begintime, String endtime, String courseId, int period, String discript,
			String supervisor, String place, Paper papers, String ids) {
		super();
		this.id = id;
		this.begintime = begintime;
		this.endtime = endtime;
		this.courseId = courseId;
		this.period = period;
		this.discript = discript;
		this.supervisor = supervisor;
		this.place = place;
		this.papers = papers;
		this.ids = ids;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}