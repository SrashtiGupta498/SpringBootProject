
package com.greatlearning.BACKEND_WORK.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.BACKEND_WORK.entity.Product;
import com.greatlearning.BACKEND_WORK.serviceImplementation.ProductServiceImpl;

@RequestMapping("/Product")
@RestController
public class ProductController {
	@Autowired
	private ProductServiceImpl ProductServiceImpl;

	@GetMapping(value="getAllProduct")
	public List<Product> findAll() {
		return this.ProductServiceImpl.findAll();
	}
}
