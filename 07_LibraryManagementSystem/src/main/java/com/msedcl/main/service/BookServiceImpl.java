package com.msedcl.main.service;

import org.springframework.stereotype.Service;

import com.msedcl.main.entity.Book;
import com.msedcl.main.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
  private BookRepository bookRepository;
  
  
	public BookServiceImpl(BookRepository bookRepository) {
	super();
	this.bookRepository = bookRepository;
}

	@Override
	public Book addNewBook(Book book) {
		
		return bookRepository.addNewBook(book);
	}

	@Override
	public Book getBookById(int bookId) {
		
		return bookRepository.getBookById(bookId);
	}

	@Override
	public Book updateAvailabilityStatus(Book book) {
		
		return bookRepository.updateAvailabilityStatus(book);
	}

}
