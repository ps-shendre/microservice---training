package com.msedcl.main.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.msedcl.main.entity.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	private JdbcTemplate jdbcTemplate;

	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final String ADD_NEW_BOOK = "INSERT INTO BOOK_DETAILS(title, author, issuable_status, availablility_status) VALUES (?,?,?,?)";
	private static final String SELECT_bOOK_BY_BOOK_ID = "SELECT * from BOOK_DETAILS WHERE BOOK_code=?";
	private static final String UPDATE_BOOK_BY_AVAILABILITY_STATUS = "UPDATE BOOK_DETAILS SET availablility_status=? WHERE book_code=?";

	@Override
	public Book addNewBook(Book book) {
		int rowInserted = jdbcTemplate.update(ADD_NEW_BOOK, book.getTitle(), book.getAuthor(), book.getIssuableStatus(),
				book.getAvailStatus());
		if (rowInserted > 0)
			return book;
		else
			return null;
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SELECT_bOOK_BY_BOOK_ID,
				(rs, rw) -> new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)),
				bookId);
	}

	@Override
	public Book updateAvailabilityStatus(Book book) {
		System.out.println("In updateAvailabilityStatus");
		System.out.println(book);
		int rowUpdated = jdbcTemplate.update(UPDATE_BOOK_BY_AVAILABILITY_STATUS, book.getAvailStatus(),
				book.getBook_code());
		if (rowUpdated > 0)
			return book;
		else
			return null;
	}

}
