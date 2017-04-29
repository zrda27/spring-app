package com.zrd.study.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.zrd.study.spring.annotation.AopAnno;
import com.zrd.study.spring.dao.inter.IDemoDAO;
import com.zrd.study.spring.event.DemoEvent;
import com.zrd.study.spring.properties.DemoProp;
import com.zrd.study.spring.service.inter.IDemoService;

@Service("demoService")
public class DemoServiceImpl implements IDemoService, BeanNameAware, ResourceLoaderAware {
	@Autowired
	private IDemoDAO demoDao;
	@Autowired
	private DemoProp demoProp;
	@Autowired
	private ApplicationContext applicationContext;
	
	private ResourceLoader resourceLoader;
	
	private String beanName;

	@Override
	@AopAnno(name="getUser方法")
	public String getUser(String id) {
		// TODO Auto-generated method stub
		String user = demoDao.getUser(id);
		System.out.println(user + "," + demoProp.getName() + "," + demoProp.getAge());
		System.out.println("resourceLoader:" + resourceLoader + beanName);
		applicationContext.publishEvent(new DemoEvent(this, id));
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

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
		
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
}