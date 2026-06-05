package com.msedcl.main.service;

import org.springframework.stereotype.Service;

import com.msedcl.main.entity.BookIssue;
import com.msedcl.main.repository.BookIssueRepository;

@Service
public class BookIssueServiceImpl implements BookIssueService {
	private BookIssueRepository bookIssueRepository;

	public BookIssueServiceImpl(BookIssueRepository bookIssueRepository) {
		super();
		this.bookIssueRepository = bookIssueRepository;
	}
	
	

	@Override
	public BookIssue issueBook(BookIssue bookIssue) {

		return bookIssueRepository.issueBook(bookIssue);
	}

	@Override
	public BookIssue returnBook(BookIssue bookIssue) {

		return null;
	}

	@Override
	public BookIssue getIssueBookByIssueId(int bookIssueId) {

		return bookIssueRepository.getIssueBookByIssueId(bookIssueId);
	}

	@Override
	public BookIssue returnBookByMemberId(int memberId) {

		return bookIssueRepository.returnBookByMemberId(memberId);
	}

	@Override
	public BookIssue returnBookByBookId(int bookId) {

		return bookIssueRepository.returnBookByBookId(bookId);
	}

	@Override
	public int getBookIssueCountByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return bookIssueRepository.getBookIssueCountByMemberId(memberId);
	}

}
