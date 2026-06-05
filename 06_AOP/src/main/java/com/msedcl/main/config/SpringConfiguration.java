package com.msedcl.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.msedcl.main.aspect.LoggingAspect;
import com.msedcl.main.repository.UserRepository;
import com.msedcl.main.service.UserService;

@Configuration
//@ComponentScan(basePackages = "com.msedcl.main")  commented to understand  use java configurATION 
@EnableAspectJAutoProxy
public class SpringConfiguration {
	
	// Spring configuration
	//a.annotation configuration -- done
	//b.java configuration
	
	
	UserRepository getUserRepository() {
		System.out.println("springconfiguration class- getUserRepository() ");
		return new UserRepository();
	}
	
	
	//@Scope("prototype")
	@Bean
	UserService getUserService() {
		System.out.println("springconfiguration class- getUserService() ");
		return new UserService(getUserRepository());
	}
	
	@Bean
	LoggingAspect getLoggingAspect() {
		System.out.println("springconfiguration class- getLoggingAspect() ");
		return new LoggingAspect();
	}
		
	}

