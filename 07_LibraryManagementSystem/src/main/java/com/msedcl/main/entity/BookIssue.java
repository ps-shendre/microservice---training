package com.msedcl.main.entity;

import java.util.Date;

public class BookIssue {

	private int issueCode;
	private Date issueDate;
	private Date returnDate;
	private int memberCode;
	private int bookCode;

	public BookIssue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookIssue [issueCode=" + issueCode + ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ ", memberCode=" + memberCode + ", bookCode=" + bookCode + "]";
	}

	public int getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(int issueCode) {
		this.issueCode = issueCode;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public BookIssue(int issueCode, Date issueDate, Date returnDate, int memberCode, int bookCode) {
		super();
		this.issueCode = issueCode;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.memberCode = memberCode;
		this.bookCode = bookCode;
	}
	
}
