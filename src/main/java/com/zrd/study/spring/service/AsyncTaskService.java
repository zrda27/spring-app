package com.zrd.study.spring.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	@Async
	public void task1(int i){
		System.out.println("task1：" + i);
	}
	@Async
	public void task2(int i){
		System.out.println("task2：" + i);
	}
}
