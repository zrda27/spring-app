package com.zrd.study.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrd.study.spring.domain.Org;
import com.zrd.study.spring.domain.User;
import com.zrd.study.spring.service.inter.IDemoService;

@RestController
public class DemoController {
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping(path="/index", produces="application/json;charset=UTF-8")
	public User getUser(User user, Org org, HttpServletRequest req){
		System.out.println(demoService.getUser("123"));
		return user;
	}
	
	@RequestMapping(path="/get/{name}", produces="text/plain;charset=UTF-8")
	public String get(@PathVariable String name, HttpServletRequest req){
		return "getUser:" + name;
	}
	
	@RequestMapping(path="/exception")
	public String exception() throws Exception{
		throw new Exception("出差错");
	}
}
