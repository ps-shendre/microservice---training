package com.msedcl.main.service;

import com.msedcl.main.entity.Product;

public interface ProductService {
	Product addNewProduct(Product product);

	String searchByProductName(String name) ;
}
