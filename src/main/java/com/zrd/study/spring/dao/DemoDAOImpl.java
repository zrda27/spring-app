package com.zrd.study.spring.dao;

import org.springframework.stereotype.Repository;

import com.zrd.study.spring.dao.inter.IDemoDAO;

@Repository("demoDao")
public class DemoDAOImpl implements IDemoDAO{

	@Override
	public String getUser(String id) {
		// TODO Auto-generated method stub
		return "user" + id;
	}
	
}
