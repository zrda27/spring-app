package com.zrd.study.spring.service;

import org.springframework.stereotype.Service;

import com.zrd.study.spring.event.DemoEvent;
import com.zrd.study.spring.service.inter.ISMSService;

@Service("smsService")
public class SMSServiceImpl implements ISMSService{

	@Override
	public void onApplicationEvent(DemoEvent event) {
		this.sendMessage(event.getMsg());
		
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("发送短信:" + msg);
		
	}

}
