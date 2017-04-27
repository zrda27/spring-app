package com.zrd.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zrd.study.spring.service.inter.IDemoService;

@Controller
public class DemoController {
	@Autowired
	private IDemoService demoService;
	
	public void getUser(){
		System.out.println(demoService.getUser("123"));
	}
}
