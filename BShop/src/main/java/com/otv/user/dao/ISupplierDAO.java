package com.otv.user.dao;
import java.util.List;

import com.otv.model.Supplier;

public interface ISupplierDAO {
	
	public void add(Supplier supplier);

	public Supplier get(Long id);

	public List<Supplier> getAll();

	public void remove(Long id);
	
	public void update(Long id);

}
