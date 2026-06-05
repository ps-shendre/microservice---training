package com.msedcl.main.repository;

import java.sql.JDBCType;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.msedcl.main.entity.Employee;
import com.msedcl.main.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private JdbcTemplate jdbcTemplate;

	private static final String ADD_NEW_PRODUCT = "Insert into Product_details(name, price) values (?,?)";
	private static final String SELECT_PRODUCT_BY_PRODUCT_NAME = "SELECT * from PRODUCT_details WHERE name=?";
	private static final String SELECT_ALL_PRODUCT = "select *  from PRODUCT_details ";
	@Override
	public Product addNewProduct(Product product) {
		int rowInserted = jdbcTemplate.update(ADD_NEW_PRODUCT, product.getName(),product.getPrice());
		if (rowInserted > 0)
			return product;
		else
			return null;
	}
	@Override
	public List getProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product searchByProductName(String name) {
		
		return jdbcTemplate.queryForObject(SELECT_PRODUCT_BY_PRODUCT_NAME,
				(rs, row) -> new prooduct(rs.getString(1), rs.getInt(2)), name);
	}
	
	public ProductRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}



}
