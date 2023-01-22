package com.example.invertoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.invertoryservice.model.Inventory;
import com.example.invertoryservice.service.InventoryService;
import com.example.invertoryservice.service.ServiceInv;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	ServiceInv repo;
    @GetMapping("/{id}")
    public Inventory getById(@PathVariable("id") Long p_id) {
    	return repo.getByID(p_id);
    }
    @PostMapping
    public Inventory save(@RequestBody Inventory inv) {
    	return repo.save(inv);
    }
    @GetMapping
    public List<Inventory> getAll(){
    	return repo.getAll();
    }
	}

