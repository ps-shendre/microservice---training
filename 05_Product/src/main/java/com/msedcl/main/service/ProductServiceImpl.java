package com.msedcl.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.msedcl.main.entity.Product;
import com.msedcl.main.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;

	
	public Product addNewProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.addNewProduct(product);
	}

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public List<Product> getProductByProductName(String name) {
		// TODO Auto-generated method stub
		return productRepository.getProductByName(name);
	}

	public Product searchByProductName( Product product) {
		return null;
	}

	@Override
	public String searchByProductName(String name) {
		// TODO Auto-generated method stub
		return productRepository.searchByProductName(name);
	}

}
