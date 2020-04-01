package com.nqt.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nqt.shoppingbackend.dao.ProductDAO;
import com.nqt.shoppingbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private static Product product;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.nqt.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	/*@Test
	public void testCRUDProduct() {
		
		  product = new Product(); 
		  product.setName("Opp Selfie S53");
		  product.setBrand("Oppo");
		  product.setDescription("This is some description for oppo mobile phone");
		  product.setUnitPrice(25000);
		  product.setActive(true);
		  product.setCategoryId(3);
		  product.setSupplierId(3);
		 
		  assertEquals("Something went wrong while inseting a new product", true,
		  productDAO.add(product));
		 
		  //update 
		 product = productDAO.get(2); 
		 product.setName("Samsung Galaxy S7");
		 assertEquals("Something went wrong while updating the existing record", true,
		 productDAO.update(product));
		  
		 
		  assertEquals("Something went wrong while deleting the existing record", true,
		  productDAO.delete(product));
		 
		
		//list
		assertEquals("Something went wrong while fetching the list of product", 6, productDAO.list().size());
		
	}*/
	
	/*@Test
	public void testListActiveProduct() {
		assertEquals("Something went wrong while fetching the list of product", 5, productDAO.listActiveProducts().size());
	}*/
	
	/*@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something went wrong while fetching the list of product", 3, productDAO.listActiveProductsByCategory(3).size());
	}*/
	
	@Test
	public void getLastestActiveProducts() {
		assertEquals("Something went wrong while fetching the list of product", 3, productDAO.getLastestActiveProducts(3).size());
	}
	
	
}
