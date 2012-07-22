package com.otv.user.dao;

import java.util.List;

import com.otv.model.SupOrderStructure;

public interface ISupOrderStructDAO {
	
	public void add(SupOrderStructure structure);

	public SupOrderStructure get(Long id);

	public List<SupOrderStructure> getAll();

	public void remove(Long id);
	
	public void update(Long id);
	
}
