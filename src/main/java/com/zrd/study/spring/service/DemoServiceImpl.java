package com.zrd.study.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import com.zrd.study.spring.annotation.AopAnno;
import com.zrd.study.spring.dao.inter.IDemoDAO;
import com.zrd.study.spring.properties.DemoProp;
import com.zrd.study.spring.service.inter.IDemoService;

public class DemoServiceImpl implements IDemoService {
	@Autowired
	private IDemoDAO demoDao;
	@Autowired
	private DemoProp demoProp;

	@Override
	@AopAnno(name="getUser方法")
	public String getUser(String id) {
		// TODO Auto-generated method stub
		String user = demoDao.getUser(id);
		System.out.println(user + "," + demoProp.getName() + "," + demoProp.getAge());
		return user;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("\r\ndemoService init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("demoService destroy");
	}
	
}