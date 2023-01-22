package com.example.invertoryservice.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.invertoryservice.model.Inventory;
import com.example.invertoryservice.repository.InventoryRepository;

@Service
public class InventoryService implements ServiceInv {
@Autowired
InventoryRepository repo;
	@Override
	public Inventory save(Inventory inv) {
		if(inv.getProduct()==null || inv.getProd_count().equals(new BigDecimal(0))|| inv.getId()==null) {
			return null;
		}
		return repo.save(inv);
	}

	@Override
	public Inventory getByID(Long p_id) {

		return repo.getByID(p_id);
	}

	@Override
	public List<Inventory> getAll() {

		return repo.getAll();
	}
	
}
