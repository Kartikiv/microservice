package com.example.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.orderservice.model.Inventory;
import com.example.orderservice.model.Orders;
import com.example.orderservice.model.Product;
import com.example.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository repo;
      @Autowired
      RestTemplate getRestTemp;
	public Orders save(Orders ord) {
		// rest call to set the product here
		
		Product p = getRestTemp.getForObject("http://PRODUCT-SERVICE/product/" + ord.getProduct().getP_id(), Product.class);
		// add another rest call to the inventory service to see the count
		Inventory inv = getRestTemp.getForObject("http://inventory-service/inventory/" + ord.getProduct().getP_id(),
				Inventory.class);
		if (inv.getProd_count() <= 0) {
			return null;
		}
		ord.setProduct(p);
		return repo.save(ord);
	}

}
