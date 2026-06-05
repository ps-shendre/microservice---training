package com.msedcl.main.repository;

import com.msedcl.main.entity.Book;

public interface BookRepository {
	Book addNewBook(Book book);

	Book getBookById(int bookId);

	Book updateAvailabilityStatus(Book book);
}
