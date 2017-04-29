package com.zrd.study.spring.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.zrd.study.spring.controller.DemoInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.zrd.study.spring", excludeFilters={@Filter(Configuration.class)})
public class WebMVCConfig extends WebMvcConfigurerAdapter{
	@Autowired
	private DemoInterceptor demoInterceptor;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/views/**").addResourceLocations("classpath:/views/");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(demoInterceptor);
	}
}