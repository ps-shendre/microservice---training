package com.msedcl.main.service;

import com.msedcl.main.entity.Book;

public interface BookService {
	 Book addNewBook(Book book) ;

	Book getBookById(int bookId);

	Book updateAvailabilityStatus(Book book);
}
