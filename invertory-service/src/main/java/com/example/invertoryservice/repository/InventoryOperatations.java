package com.example.invertoryservice.repository;

import java.util.List;

import com.example.invertoryservice.model.Inventory;

public interface InventoryOperatations {

	public Inventory save(Inventory inv);

	public Inventory getByID(Long p_id);

	public List<Inventory> getAll();
}
