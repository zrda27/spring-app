package com.zrd.study.spring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class DemoControllerAdvice {
	@ExceptionHandler(value=Exception.class)
	public ModelAndView exception(Exception exception, WebRequest request){
		ModelAndView mv = new ModelAndView("/views/error.html");
		mv.addObject("errMsg", exception.getMessage());
		return mv;
	}
	
	@ModelAttribute
	public void addAttributes(Model model){
		model.addAttribute("msg", "呵呵");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.setDisallowedFields("");
	}
}
