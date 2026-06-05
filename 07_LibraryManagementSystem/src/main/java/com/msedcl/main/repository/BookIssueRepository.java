package com.msedcl.main.repository;

import com.msedcl.main.entity.BookIssue;

public interface BookIssueRepository {

	BookIssue issueBook(BookIssue bookIssue);

	BookIssue returnBook(BookIssue bookIssue);

	BookIssue getIssueBookByIssueId(int bookIssueId);

	BookIssue returnBookByMemberId(int memberId);

	BookIssue returnBookByBookId(int bookId);
	
	int getBookIssueCountByMemberId( int memberId);
}
