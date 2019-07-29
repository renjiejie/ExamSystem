package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Analyse;

public interface AnalyseService {
	public List<Analyse> query(String courseId );
}
