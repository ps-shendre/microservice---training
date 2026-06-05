package com.msedcl.main.domain;

public class Order {
	private String OrderNo;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public String getOrderNo() {
		return OrderNo;
	}

	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}

	public Order(String orderNo) {
		super();
		OrderNo = orderNo;
	}

}
