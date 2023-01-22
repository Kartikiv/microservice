package com.example.orderservice.repository;

import java.security.spec.NamedParameterSpec;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.orderservice.model.Orders;

@Repository
public class OrderRepository {
	@Autowired
	NamedParameterJdbcTemplate template;
	static String INSERT = "insert into orders (id,customer_name,p_id) values (:id,:customer_name,:p_id)";

	public Orders save(Orders ord) {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("id", ord.getId());
		map.addValue("customer_name", ord.getCustomer_name());
		map.addValue("p_id", ord.getProduct().getP_id());
        template.update(INSERT, map);
		return ord;
	}

	public Orders cancel() {
		return null;
	}
}
