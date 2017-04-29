package com.zrd.study.spring.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	@Scheduled(fixedRate = 1000)
	public void scheduleTask(){
		System.out.println("schedule:" + new Date());
	}
}
