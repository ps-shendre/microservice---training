package com.msedcl.main.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.msedcl.main.entity.BookIssue;

@Repository
public class BookIssueRepositoryImpl implements BookIssueRepository {

	private JdbcTemplate jdbcTemplate;

	public BookIssueRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final String ISSUE_NEW_BOOK = "INSERT INTO ISSUE_BOOK_DETAILS(issue_code, issue_date, return_date, member_code,book_code) VALUES (?,?,?,?,?)";
	private static final String SELECT_BOOK_BY_BOOK_ID = "SELECT * from ISSUE_BOOK_DETAILS WHERE BOOK_code=?";
	private static final String SELECT_BOOK_BY_ISSUE_ID = "SELECT * from ISSUE_BOOK_DETAILS WHERE issue_code=?";
	private static final String SELECT_BOOK_BY_MEMBER_ID = "SELECT * from ISSUE_BOOK_DETAILS WHERE member_code=?";
	private static final String UPDATE_BOOK_BY_AVAILABILITY_STATUS = "UPDATE BOOK_DETAILS SET availablility_status=? WHERE book_code=?";

	@Override
	public BookIssue issueBook(BookIssue bookIssue) {
		int rowInserted = jdbcTemplate.update(ISSUE_NEW_BOOK, bookIssue.getIssueCode(), bookIssue.getIssueDate(),
				bookIssue.getReturnDate(), bookIssue.getMemberCode(), bookIssue.getBookCode());
		if (rowInserted > 0)
			return bookIssue;
		else
			return null;
	}

	@Override
	public BookIssue returnBook(BookIssue bookIssue) {
		int rowUpdated = jdbcTemplate.update(UPDATE_BOOK_BY_AVAILABILITY_STATUS, bookIssue.getIssueCode(), bookIssue.getIssueDate(),
				bookIssue.getReturnDate(), bookIssue.getMemberCode(), bookIssue.getBookCode());
		if (rowUpdated > 0)
			return bookIssue;
		else
			return null;
	}

	@Override
	public BookIssue getIssueBookByIssueId(int bookIssueId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SELECT_BOOK_BY_ISSUE_ID,
				(rs, rw) -> new BookIssue(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4), rs.getInt(5)),
				bookIssueId);
	}

	@Override
	public BookIssue returnBookByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SELECT_BOOK_BY_MEMBER_ID,
				(rs, rw) -> new BookIssue(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4), rs.getInt(5)),
				memberId);
	}

	@Override
	public BookIssue returnBookByBookId(int bookId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SELECT_BOOK_BY_BOOK_ID,
				(rs, rw) -> new BookIssue(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4), rs.getInt(5)),
				bookId);
		
	}

	@Override
	public int getBookIssueCountByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
