package com.msedcl.main;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msedcl.main.entity.Book;
import com.msedcl.main.entity.BookIssue;
import com.msedcl.main.entity.Member;
import com.msedcl.main.service.BookIssueService;
import com.msedcl.main.service.BookIssueServiceImpl;
import com.msedcl.main.service.BookService;
import com.msedcl.main.service.BookServiceImpl;
import com.msedcl.main.service.MemberService;
import com.msedcl.main.service.MemberServiceImpl;

public class LiberaryManagementSystemMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				"com.msedcl.main");

		MemberService memberService = applicationContext.getBean(MemberServiceImpl.class);
		BookService bookService = applicationContext.getBean(BookServiceImpl.class);
		BookIssueService bookIssueService= applicationContext.getBean(BookIssueServiceImpl.class);
		Scanner scanner = new Scanner(System.in);
		int memberCode, choice;
		String name, continueChoice, type;
		Date issueDate = null;Date returnDate= null;
	//	System.out.print("Enter date (dd/MM/yyyy): ");
     //   String input = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		do {
			System.out.println("Menu");
			System.out.println("1. Add New Member");
			System.out.println("2. Search Member By MemberId");
			System.out.println("3. Add New Book");
			System.out.println("4. Search Book  By BookId");
			System.out.println("5. Update book");
			System.out.println("6. Add in issue book ");
			System.out.println("7. Search book by book  id ");
			System.out.println("8. Search issue book by member id ");
			System.out.println("9. Search issue book by issue id ");
			System.out.println("10. update issue book by book id ");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			/*
			 * case 8 : //System.out.println("Enter Name"); //name = scanner.next();
			 * List<Employee> employeeList=employeeService.getMaxSalary();
			 * employeeList.forEach(e-> System.out.println(e)); break; case 6 :
			 * System.out.println("Enter Name"); name = scanner.next();
			 * employeeList=employeeService.getEmployeeByName(name);
			 * employeeList.forEach(e-> System.out.println(e)); break; case 7 : long
			 * count=employeeService.getCountOfEmployees();
			 * System.out.println("Total employee count " + count);
			 * 
			 * break;
			 */
			case 1:
				System.out.println("Enter Member name");
				name = scanner.next();
				System.out.println("Enter type");

				type = scanner.next();
				Member member = new Member(0, name, type);
				if (memberService.addNewMember(member) != null) {
					System.out.println("New employee added successfully");
					System.out.println("EmployeeId :: " + member.getMember_code());
				}
				break;
			case 2:
				System.out.println("Enter MemberId");
				memberCode = scanner.nextInt();
				member = memberService.getMemberById(memberCode);
				if (member != null)
					System.out.println(member);
				else
					System.out.println("Invalid MemberId");
				break;
			case 3:
				System.out.println("Enter Book Title");
				String title = scanner.next();
				System.out.println("Enter Author");

				String author = scanner.next();
				System.out.println("Enter Issuable Status");
				String status = scanner.next();
				System.out.println("Enter Availability status");

				String availStatus = scanner.next();
				Book book = new Book(0, title, author, status, availStatus);
				if (bookService.addNewBook(book) != null) {
					System.out.println("New book added successfully");
					System.out.println("EmployeeId :: " + book.getBook_code());
				}
				break;
			case 4:
				System.out.println("Enter Book Id");
				int bookCode = scanner.nextInt();
				book = bookService.getBookById(bookCode);
				if (book != null)
					System.out.println(book);
				else
					System.out.println("Invalid book code");
				break;
			case 5:
				System.out.println("Enter Book Id ");
				bookCode = scanner.nextInt();
				System.out.println("Enter availability status ");
				availStatus = scanner.next();
				book = bookService.getBookById(bookCode);
				System.out.println("Book Received");
				System.out.println(book);
				System.out.println("Starting Update");
				System.out.println(book);
				book.setAvailStatus(availStatus);
				book = bookService.updateAvailabilityStatus(book);
				if (book != null)
					System.out.println(book);
				else
					System.out.println("Invalid MemberId");
				break;
			case 6:
				
				
				System.out.println("Enter Issue code");
				 String issue = scanner.next();
				// String date= scanner.next();
				
				System.out.println("Enter Issue date (dd/MM/yyyy)");
				String issueInput = scanner.next();
				issueDate = Date.valueOf(issueInput);
			/*	try {
					 // issueDate = Date.valueOf(date);
				} catch (ParseException e) {
				    e.printStackTrace();
				}*/

				System.out.println("Enter Return date (dd/MM/yyyy)");
				String returnInput = scanner.next();

				returnDate = Date.valueOf(returnInput);
				System.out.println("Enter member code");
				 memberCode = scanner.nextInt();

				System.out.println("Enter Book code");
				 bookCode = scanner.nextInt();

				BookIssue bookIssue = new BookIssue(0, issueDate, returnDate, memberCode, bookCode);
				if (bookIssueService.issueBook(bookIssue) != null) {
				    System.out.println("New book issue added successfully");
				    System.out.println("Issue Id :: " + bookIssue.getIssueCode());
				}
			case 7:
				System.out.println("Enter Book Id");
				 bookCode = scanner.nextInt();
				bookIssue = bookIssueService.returnBookByBookId(bookCode);
				if (bookIssue != null)
					System.out.println(bookIssue);
				else
					System.out.println("Invalid issue book code");
				break;
			case 8:
				System.out.println("Enter Member Id");
				 memberCode = scanner.nextInt();
				 bookIssue = bookIssueService.returnBookByMemberId(memberCode);
				if (bookIssue != null)
					System.out.println(bookIssue);
				else
					System.out.println("Invalid member code");
				break;
			case 9:
				System.out.println("Enter Issue Id");
				int issueCode = scanner.nextInt();
				bookIssue = bookIssueService.getIssueBookByIssueId(issueCode);
				if (bookIssue != null)
					System.out.println(bookIssue);
				else
					System.out.println("Invalid book code");
				break;

			
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

		applicationContext.close();

	}
}
