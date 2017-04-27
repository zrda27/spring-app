package com.zrd.study.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	@Before("@annotation(com.zrd.study.spring.annotation.AopAnno)")
	public void before(JoinPoint joinPoint){
		System.out.println("anno方式记录日志开始" + joinPoint.getSignature().getName());
	}
	
	@After("@annotation(com.zrd.study.spring.annotation.AopAnno)")
	public void after(JoinPoint joinPoint){
		System.out.println("anno方式记录日志结束" + joinPoint.getSignature().getName());
	}
	
	@Before("execution(* com.zrd.study.spring.service.DemoServiceImpl.getUser(..))")  //execution(访问权限 包名.类名.方法名(..))
	public void beforeExe(JoinPoint joinPoint){
		System.out.println("execution方式记录日志开始" + joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.zrd.study.spring.service.DemoServiceImpl.getUser(..))")
	public void afterExe(JoinPoint joinPoint){
		System.out.println("execution方式记录日志结束" + joinPoint.getSignature().getName());
	}
}
