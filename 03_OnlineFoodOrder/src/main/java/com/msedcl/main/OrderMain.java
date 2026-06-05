package com.msedcl.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msedcl.main.service.OrderService;

public class OrderMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applcationContext = new AnnotationConfigApplicationContext(
				"com.msedcl.main");
		System.out.println("--------------");

		
		OrderService orderService = applcationContext.getBean(OrderService.class);

		System.out.println("");
		orderService.getBill();

	}
	//

}
