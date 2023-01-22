package com.example.invertoryservice.service;

import java.util.List;

import com.example.invertoryservice.model.Inventory;

public interface ServiceInv {
	public Inventory save(Inventory inv);

	public Inventory getByID(Long p_id);

	public List<Inventory> getAll();

}
