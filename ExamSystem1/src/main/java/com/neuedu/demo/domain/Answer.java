package com.neuedu.demo.domain;

public class Answer {
	    public class answer {
		private int id;
		private Exam exam;
		private User userstu;
		private String answer_content;
		private User Usertea;
		private Paper paper;
		private String answer_point;
		private int answer_result;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Exam getExam() {
			return exam;
		}
		public void setExam(Exam exam) {
			this.exam = exam;
		}
		public User getUserstu() {
			return userstu;
		}
		public void setUserstu(User userstu) {
			this.userstu = userstu;
		}
		public String getAnswer_content() {
			return answer_content;
		}
		public void setAnswer_content(String answer_content) {
			this.answer_content = answer_content;
		}
		public User getUsertea() {
			return Usertea;
		}
		public void setUsertea(User usertea) {
			Usertea = usertea;
		}
		public Paper getPaper() {
			return paper;
		}
		public void setPaper(Paper paper) {
			this.paper = paper;
		}
		public String getAnswer_point() {
			return answer_point;
		}
		public void setAnswer_point(String answer_point) {
			this.answer_point = answer_point;
		}
		public int getAnswer_result() {
			return answer_result;
		}
		public void setAnswer_result(int answer_result) {
			this.answer_result = answer_result;
		}
		public answer(int id, Exam exam, User userstu, String answer_content, User usertea, Paper paper,
				String answer_point, int answer_result) {
			super();
			this.id = id;
			this.exam = exam;
			this.userstu = userstu;
			this.answer_content = answer_content;
			Usertea = usertea;
			this.paper = paper;
			this.answer_point = answer_point;
			this.answer_result = answer_result;
		}
		public answer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		}
}
