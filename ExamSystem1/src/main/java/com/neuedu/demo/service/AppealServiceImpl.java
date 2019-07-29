package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.AppealMapper;
import com.neuedu.demo.domain.Appeal;

@Service
public class AppealServiceImpl implements AppealService{
	@Autowired
	private AppealMapper mapper;

	@Override
	public void addAppeal(Appeal appeal) {
		// TODO Auto-generated method stub
		mapper.addAppeal(appeal);
	}


	@Override
	public void updateAppeal() {
		// TODO Auto-generated method stub
		mapper.updateAppeal();
	}
	
}
