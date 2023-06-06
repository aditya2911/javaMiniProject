package com.example.javaMiniProjectAditya.configuration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.javaMiniProjectAditya.SignInServlet;
import com.example.javaMiniProjectAditya.TestServlet;
import com.example.javaMiniProjectAditya.controller.HomeController;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    private final HomeController homeController;
    
    public ServletConfig(HomeController homeController) {
        this.homeController = homeController;
    }
	
	@Bean
	 public ServletRegistrationBean<TestServlet> myServletRegistration() {
        TestServlet testServlet = new TestServlet(homeController);
		 ServletRegistrationBean<TestServlet> registration = new ServletRegistrationBean<>(testServlet,"/test-servlet/*");
		 return registration;
	 }
	
	@Bean
	public ServletRegistrationBean<SignInServlet> signInRegistration(){
		SignInServlet signInServlet = new SignInServlet(homeController);
		ServletRegistrationBean<SignInServlet> signInRegistration = new ServletRegistrationBean<SignInServlet>(signInServlet,"/signIn-servlet/*");
		return signInRegistration;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
