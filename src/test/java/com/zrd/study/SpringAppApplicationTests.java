package com.zrd.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zrd.study.spring.configure.AppConfig;
import com.zrd.study.spring.service.AsyncTaskService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class SpringAppApplicationTests {
	@Autowired
	private AsyncTaskService asyncTaskService;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testAsync(){
		for(int i = 0; i< 10; i++){
			asyncTaskService.task1(i);
			asyncTaskService.task2(i);
		}
	}
	
	@Test
	public void start(){
		
	}
}
