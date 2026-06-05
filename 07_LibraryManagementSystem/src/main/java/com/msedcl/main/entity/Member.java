package com.msedcl.main.entity;

public class Member {

	public int member_code;
	public String name;
	public String type;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Member [member_code=" + member_code + ", name=" + name + ", type=" + type + "]";
	}

	public int getMember_code() {
		return member_code;
	}

	public void setMember_code(int member_code) {
		this.member_code = member_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public Member(int member_code, String name, String type) {
		super();
		this.member_code = member_code;
		this.name = name;
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
