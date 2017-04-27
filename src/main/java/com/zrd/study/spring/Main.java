package com.zrd.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zrd.study.spring.configure.AppConfig;
import com.zrd.study.spring.service.inter.IDemoService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getEnvironment().setActiveProfiles("dev");
		IDemoService demoService = ctx.getBean(IDemoService.class);
		demoService.getUser("111");
		ctx.close();
	}
}
