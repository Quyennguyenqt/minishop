package com.nqt.minishopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nqt.shoppingbackend.dao.ProductDAO;
import com.nqt.shoppingbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {
		return productDAO.listActiveProducts();
	}

	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int categoryId) {
		return productDAO.listActiveProductsByCategory(categoryId);
	}
}
