package com.msedcl.main.domain;

public class Service {
	public String ServieNo;
	public String servicName;

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public String getServieNo() {
		return ServieNo;
	}

	public void setServieNo(String servieNo) {
		ServieNo = servieNo;
	}

	public String getServicName() {
		return servicName;
	}

	public void setServicName(String servicName) {
		this.servicName = servicName;
	}

	public Service(String servieNo, String servicName) {
		super();
		ServieNo = servieNo;
		this.servicName = servicName;
	}

}
