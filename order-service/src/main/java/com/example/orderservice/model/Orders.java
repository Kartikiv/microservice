package com.example.orderservice.model;

public class Orders {
	private Product product;
	private String customer_name;
	private Long id;

	public Orders() {
		super();
	}

	public Orders(Product product, String customer_name, Long id) {
		super();
		this.product = product;
		this.customer_name = customer_name;
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
