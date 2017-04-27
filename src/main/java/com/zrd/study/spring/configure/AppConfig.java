package com.zrd.study.spring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.zrd.study.spring.dao.DemoDAOImpl;
import com.zrd.study.spring.dao.inter.IDemoDAO;
import com.zrd.study.spring.service.DemoServiceImpl;
import com.zrd.study.spring.service.inter.IDemoService;

@Configuration
@ComponentScan("com.zrd.study.spring")
@EnableAspectJAutoProxy  //启用切面编程
public class AppConfig {
	@Bean
	@Scope("singleton")
	//Scope说明：
	//Singleton：一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例。
	//Prototype：每次调用新建一个Bean的实例。
	//Request：Web项目中，给每一个http request新建一个Bean实例。
	//Session：Web项目中，给每一个http session新建一个Bean实例。
	//GlobalSession：这个只在portal应用中有用，给每一个global http session新建一个Bean实例。
	public IDemoDAO demoDao(){
		return new DemoDAOImpl();
	}
	
	@Bean
	public IDemoService demoService(){
		return new DemoServiceImpl();
	}
}
