package com.nqt.shoppingbackend.test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nqt.shoppingbackend.dao.CategoryDAO;
import com.nqt.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.nqt.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	/*public void testAddCategory() {
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is television");
		category.setImageURL("TV.png");
		
		assertEquals("Sucessfully",true,categoryDAO.add(category));
	}*/
	
	
	/*public void testGetCategory() {
		category = categoryDAO.get(1);
		assertEquals("Sucessfully fetch data from table","Television",category.getName());
	}*/
	
	/*public void testUpdateCategory() {
		category = categoryDAO.get(2);
		category.setName("sdf");
		assertEquals("Sucessfully update",true,categoryDAO.update(category));
	}*/
	
	/*public void testDeleteCategory() {
		category = categoryDAO.get(2);
		category.setName("sdf");
		assertEquals("Sucessfully delete",true,categoryDAO.delete(category));
	}*/
	
	/*public void testListCategory() {
		
		assertEquals("Sucessfully fetch data list category",1,categoryDAO.list().size());
	}*/
	
	public void testCRUDCategory() {
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some for laptop");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Sucessfully added a category inside table",true,categoryDAO.add(category));
		
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some for television");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Sucessfully added a category inside table",true,categoryDAO.add(category));
		
		
		//update
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Sucessfully updated a single category in table",true,categoryDAO.update(category));
		
		//delete
		category = categoryDAO.get(2);
		category.setName("sdf");
		assertEquals("Sucessfully delete a single category in table",true,categoryDAO.delete(category));
		
		//fetch the list
		assertEquals("Sucessfully fetch data list category",1,categoryDAO.list().size());
	}
	
}
