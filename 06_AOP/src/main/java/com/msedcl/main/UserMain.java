package com.msedcl.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msedcl.main.config.SpringConfiguration;
import com.msedcl.main.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		
		System.out.println("main start");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		UserService userSerivce1 = applicationContext.getBean(UserService.class);
		System.out.println("-------------------");
	
		UserService userSerivce2 = applicationContext.getBean(UserService.class);
		userSerivce1.createUser("Reema");
		applicationContext.close();

		System.out.println("main end");
	}

}
