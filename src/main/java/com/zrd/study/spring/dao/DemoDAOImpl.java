package com.zrd.study.spring.dao;

import com.zrd.study.spring.dao.inter.IDemoDAO;

public class DemoDAOImpl implements IDemoDAO{

	@Override
	public String getUser(String id) {
		// TODO Auto-generated method stub
		return "user" + id;
	}
	
}
