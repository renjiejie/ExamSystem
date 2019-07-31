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
import com.neuedu.demo.domain.Score;
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
	public  List<Exam> joinExam(String studentAccount) {
		// TODO Auto-generated method stub
		List<Exam> exams = mapper.joinExam();
		String examDone = mapper.isExamDone(studentAccount);
		
		//examDone为空时会报错，我加个条件判断-zjh
		if(examDone!=null&&!examDone.equals("")){
			String[] examsDone = examDone.split(",");
			for(int i=0;i<exams.size();++i) {
				for(String id:examsDone) {
					if(exams.get(i).getId().equals(id)) {
						exams.remove(i);
						i--;
					}
				}
			}
		}
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
	@Override
	public void submitAnswer(String answerStr, String examId, String studentAccount,String paperId) {
		// TODO Auto-generated method stub
		mapper.submitAnswer(answerStr, examId, studentAccount,paperId);
	}
	@Override
	public List<Score> scoreQuery(String studentId) {
		// TODO Auto-generated method stub
		List<Score> score= mapper.scoreQuery(studentId);
		String str = "";
		for(int i=0;i<score.size();++i) {
			str = score.get(i).getPointStr();
			String[] points = str.split("*");
			if(points!=null) {
				for(String point:points) {
					score.get(i).addPoint(point);
				}
			}
		}
		return score;
	}
	@Override
	public List<Question> mockExam() {
		// TODO Auto-generated method stub
		return mapper.mockExam();
	}
}
