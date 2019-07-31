package com.neuedu.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Score;
import com.neuedu.demo.domain.Student;

@Mapper
public interface StudentMapper {
	public String getPaperId(String examId);
	public Paper getPaper(String id);
	public List<Exam> joinExam();
	public String isExamDone(@Param("studentAccount") String studentAccount);
	public void submitAnswer(@Param("answerStr") String answerStr,@Param("examId") String examId,
			@Param("studentAccount") String studentAccount,@Param("paperId") String paperId);
	public List<Score> scoreQuery(String studentId);
}
