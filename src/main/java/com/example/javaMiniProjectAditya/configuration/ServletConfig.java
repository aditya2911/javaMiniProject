package com.example.javaMiniProjectAditya.configuration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.javaMiniProjectAditya.TestServlet;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

	@Bean
	 public ServletRegistrationBean<TestServlet> myServletRegistration() {
		 ServletRegistrationBean<TestServlet> registration = new ServletRegistrationBean<>(new TestServlet(),"/test-servlet/*");
		 return registration;
	 }
	
	public ServletConfig() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
