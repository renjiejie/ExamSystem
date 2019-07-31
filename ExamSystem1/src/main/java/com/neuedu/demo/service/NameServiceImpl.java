package com.neuedu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.dao.NameMapper;

@Service
public class NameServiceImpl implements NameService {
	@Autowired
	private NameMapper mapper;
	@Override
	public String queryStuName(String account) {
		// TODO Auto-generated method stub
		return mapper.queryStuName(account);
		
	}

	@Override
	public String queryTeaName(String account) {
		// TODO Auto-generated method stub
		return mapper.queryTeaName(account);
		
	}

}
