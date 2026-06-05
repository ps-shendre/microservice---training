package com.msedcl.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msedcl.main.domain.LoginDetails;
import com.msedcl.main.service.LoginService;

public class LoginMainV2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applcationContext= new AnnotationConfigApplicationContext("com.msedcl.main");
		boolean status;
		System.out.println("--------------");
		
		//1.Add 3 user to db
		
		LoginDetails user1= new LoginDetails("admin","Admin@123");
		LoginDetails user2= new LoginDetails("User","User@123");
		LoginDetails user3= new LoginDetails("UserAdmin","UserAdmin@123");
		
		LoginService loginService= applcationContext.getBean(LoginService.class);
		System.out.println("Adding First User");
		status = loginService.addNewUser(user1);
		System.out.println("Status= "+status);
		System.out.println();
		System.out.println("Adding Second User");
		status = loginService.addNewUser(user2);
		System.out.println("Status= "+status);
		System.out.println();
		System.out.println("Adding Third User");
		status = loginService.addNewUser(user3);
		System.out.println("Status= "+status);
		System.out.println();

	}

}
