package com.nqt.shoppingbackend.dao;

import java.util.List;

import com.nqt.shoppingbackend.dto.Product;

public interface ProductDAO {
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory( int categoryId);
	List<Product> getLastestActiveProducts(int count);
}
