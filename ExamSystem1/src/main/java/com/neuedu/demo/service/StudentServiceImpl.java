package com.neuedu.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.*;

import com.neuedu.demo.dao.QuestionMapper;
import com.neuedu.demo.dao.StudentMapper;
import com.neuedu.demo.domain.Exam;
import com.neuedu.demo.domain.Paper;
import com.neuedu.demo.domain.Question;
import com.neuedu.demo.domain.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper mapper;
	@Autowired
	private QuestionMapper qmapper;
	@Override
	public List<Paper> getPaperId(String examId) {
		// TODO Auto-generated method stub
		List<Paper> papers = new ArrayList<Paper>();
		String paperId = mapper.getPaperId(examId);
		String[] ids = paperId.split(",");
		for(String id:ids) {
			Paper paper = mapper.getPaper(id);
			papers.add(paper);
		}
		return papers;
	}
	@Override
	public  List<Exam> joinExam() {
		// TODO Auto-generated method stub
		List<Exam> exams = mapper.joinExam();
		for(Exam exam:exams) {
			Random r = new Random(1);
			int paperLenth = getPaperId(exam.getId()).size();
			int ran = r.nextInt(paperLenth);
			Paper paper = getPaperId(exam.getId()).get(ran);
			String[] qids = paper.getQuestionStr().split(",");
			List<Question> questions = new ArrayList<Question>();
			for(String qid:qids) {
				questions.add(qmapper.query(qid, exam.getCourseId()).get(0));
			}
			paper.setQuestions(questions);
			exam.setPapers(paper);
		}
		return exams;
	}

}
