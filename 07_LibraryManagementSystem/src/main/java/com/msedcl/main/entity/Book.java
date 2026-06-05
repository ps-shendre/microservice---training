package com.msedcl.main.entity;

public class Book {

	public int book_code;
	public String title;
	public String author;
	public String issuableStatus;
	public String availStatus;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int book_code, String title, String author, String issuableStatus, String availStatus) {
		super();
		this.book_code = book_code;
		this.title = title;
		this.author = author;
		this.issuableStatus = issuableStatus;
		this.availStatus = availStatus;
	}

	@Override
	public String toString() {
		return "Book [book_code=" + book_code + ", title=" + title + ", author=" + author + ", issuableStatus="
				+ issuableStatus + ", availStatus=" + availStatus + "]";
	}

	public int getBook_code() {
		return book_code;
	}

	public void setBook_code(int book_code) {
		this.book_code = book_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIssuableStatus() {
		return issuableStatus;
	}

	public void setIssuableStatus(String issuableStatus) {
		this.issuableStatus = issuableStatus;
	}

	public String getAvailStatus() {
		return availStatus;
	}

	public void setAvailStatus(String availStatus) {
		this.availStatus = availStatus;
	}

}
