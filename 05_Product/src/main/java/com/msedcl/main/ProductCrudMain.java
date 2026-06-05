package com.msedcl.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msedcl.main.entity.Product;
import com.msedcl.main.service.ProductService;
import com.msedcl.main.service.ProductServiceImpl;

public class ProductCrudMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applcationContext = new AnnotationConfigApplicationContext(
				"com.msedcl.main");
		ProductService productService =applcationContext.getBean(ProductServiceImpl.class);
		
		Scanner scanner = new Scanner(System.in);
		int employeeId, choice;
		String name, continueChoice;
		double price;

		do {
			System.out.println("Menu");
			System.out.println("1. Add New Employee");
			System.out.println("2. Search Employee By Product name");
			
			System.out.println("3. Select All Employees");
			System.out.println("6. Seacrh name by name ");
			
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			
		/*	case 6 :
				System.out.println("Enter Name");
				name = scanner.next();
				 employeeList=employeeService.getEmployeeByName(name);
				employeeList.forEach(e-> System.out.println(e));
				break;*/
			
			case 1:
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Price");
				while (!scanner.hasNextDouble()) {
				    System.out.println("Invalid input. Please enter a numeric Price:");
				    scanner.next(); // discard invalid input
				}
				price = scanner.nextDouble();
				Product product = new Product(0, name, price);
				product= productService.addNewProduct(product);
				if ((product) != null) {
					System.out.println("New product added successfully");
					System.out.println("Product  :: " + product.getName());
				}
				break;
			case 2 :
				System.out.println("Enter Name");
				name = scanner.next();
				  name = productService.searchByProductName(name);
				 System.out.println("New product search successfully");
				 System.out.println("Product :: " + name);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		
		applcationContext.close();

	
	}
	

}
