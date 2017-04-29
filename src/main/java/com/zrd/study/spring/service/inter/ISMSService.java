package com.zrd.study.spring.service.inter;

import org.springframework.context.ApplicationListener;

import com.zrd.study.spring.event.DemoEvent;

public interface ISMSService extends ApplicationListener<DemoEvent>{
	public void sendMessage(String msg);
}
