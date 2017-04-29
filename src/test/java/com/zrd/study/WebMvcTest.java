package com.zrd.study;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import com.zrd.study.spring.configure.WebMVCConfig;
import com.zrd.study.spring.service.inter.IDemoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=WebMVCConfig.class)
@WebAppConfiguration("src/main/resources")
public class WebMvcTest {
	private MockMvc mockMvc;
	@Autowired
	private IDemoService demoService;
	@Autowired
	private WebApplicationContext webApplicationContext;
	@Autowired
	private MockHttpSession session;
	@Autowired
	private MockHttpServletRequest request;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}
	
	@Test
	public void testDemoController(){
	}
}
