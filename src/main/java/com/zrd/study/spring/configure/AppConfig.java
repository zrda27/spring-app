package com.zrd.study.spring.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.zrd.study.spring.condition.OSCondition;

@Configuration
@ComponentScan(basePackages="com.zrd.study.spring", excludeFilters={@Filter(Configuration.class)})
@EnableAspectJAutoProxy  //启用切面编程
@Import({TaskExecutorConfig.class})
@EnableScheduling
@Conditional(OSCondition.class)
public class AppConfig {
	
}