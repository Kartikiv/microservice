package com.example.orderservice.model;

import java.math.BigDecimal;

public class Product {
	private String name;
	private BigDecimal price;
	private Long p_id;

	public Product() {
		super();
	}

	public Product(String name, BigDecimal price, Long p_id) {
		super();
		this.name = name;
		this.price = price;
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

}