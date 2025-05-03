package com.greatlearning.BACKEND_WORK.serviceImplementation;

import java.util.ArrayList;

import java.util.List;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.BACKEND_WORK.entity.Product;
import com.greatlearning.BACKEND_WORK.repository.ProductRepository;

@Service
public class ProductServiceImpl {
	@Autowired
	public ProductRepository Pro;

	public List<Product> findAll() {
		return Pro.findAll();
	}

}
