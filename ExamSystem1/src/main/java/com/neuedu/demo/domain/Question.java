package com.neuedu.demo.domain;

public class Question {
	private String id;
	private int point;
	private String course;
	private String type;
	private String stem;
	private String answer;
	private String use;
	private String pic;
	private String maker;
	
	public Question() {
		super();
	}
	public Question(String id, int point, String course, String type, String stem, String answer, String use) {
		super();
		this.id = id;
		this.point = point;
		this.course = course;
		this.type = type;
		this.stem = stem;
		this.answer = answer;
		this.use = use;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStem() {
		return stem;
	}
	public void setStem(String stem) {
		this.stem = stem;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}

}
