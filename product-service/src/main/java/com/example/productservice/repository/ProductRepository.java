package com.example.productservice.repository;

import java.security.spec.NamedParameterSpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.productservice.model.Product;
@Repository
public class ProductRepository {
	@Autowired
	NamedParameterJdbcTemplate template;
	static String INSERT = "insert into product (p_id,name,price) values(:p_id,:name,:price)";
	static String GETBYID="select* from product where p_id=:p_id";
	public Product save(Product product) {
		MapSqlParameterSource map =new MapSqlParameterSource();
		map.addValue("p_id", product.getP_id());
		map.addValue("name", product.getName());
		map.addValue("price", product.getPrice());
		template.update(INSERT, map);
		return product;
	}
	
	public Product getById(Long p_id) {
		MapSqlParameterSource map =new MapSqlParameterSource();
		map.addValue("p_id", p_id);
		return template.queryForObject(GETBYID, map, new BeanPropertyRowMapper<Product>(Product.class));
		
	}

}
