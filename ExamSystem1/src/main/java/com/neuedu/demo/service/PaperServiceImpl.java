package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.PaperMapper;
import com.neuedu.demo.domain.Paper;

@Service
public class PaperServiceImpl implements PaperService{

	@Autowired
	private PaperMapper mapper;
	
	@Override
	public void addPaper(Paper paper) {
		mapper.addPaper(paper);
		
	}

	@Override
	public List<Paper> query(String paperId, String courseId) {
		return mapper.query(paperId, courseId);
	}

	@Override
	public void deletePaper(String paperId) {
		mapper.deletePaper(paperId);
	}

}
