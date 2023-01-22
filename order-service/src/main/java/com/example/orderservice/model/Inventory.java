package com.example.orderservice.model;

public class Inventory {

	private Long id;
	private Product product;
	private Long prod_count;

	public Inventory() {
		super();
	}

	public Inventory(Long id, Product product, Long prod_count) {
		super();
		this.id = id;
		this.product = product;
		this.prod_count = prod_count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getProd_count() {
		return prod_count;
	}

	public void setProd_count(Long prod_count) {
		this.prod_count = prod_count;
	}

}