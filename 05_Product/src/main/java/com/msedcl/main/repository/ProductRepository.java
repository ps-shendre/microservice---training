package com.msedcl.main.repository;

import java.util.List;

import com.msedcl.main.entity.Product;

public interface ProductRepository {

	Product addNewProduct(Product product);

	// Product searchByProductName( Product product);

	List<Product> getProductByName(String name);
	
	String searchByProductName(String name) ;

}
