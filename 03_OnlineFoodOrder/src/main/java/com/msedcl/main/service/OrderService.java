package com.msedcl.main.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public BillingService billingService;

	public OrderService(BillingService billingService) {
		super();
		this.billingService = billingService;
		System.out.println("Calling to billing Service ");
	}

	public void getOrder() {
		System.out.println("Welcome To Order service");

	}
	
	public void getBill() {
		billingService.billingService();

	}
	

}
