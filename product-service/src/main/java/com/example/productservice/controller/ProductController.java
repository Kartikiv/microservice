package com.example.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository repo;
@PostMapping
public Product save(@RequestBody Product product) {
return repo.save(product);	
}
@GetMapping("/{id}")
public Product getById(@PathVariable("id") Long p_id) {
	return repo.getById(p_id);
}
}
