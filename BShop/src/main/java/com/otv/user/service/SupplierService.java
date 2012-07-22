package com.otv.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.otv.model.Supplier;
import com.otv.user.dao.ISupplierDAO;

@Transactional(readOnly = true)
public class SupplierService implements ISupplierDAO{

	ISupplierDAO supplierDAO;
	
	private ISupplierDAO getSupplierDAO() {
	return supplierDAO;
	}

	@Transactional(readOnly = false)
	@Override
	public void add(Supplier supplier) {
		getSupplierDAO().add(supplier);
		
	}



	@Override
	public Supplier get(Long id) {
	return getSupplierDAO().get(id);
	}

	@Override
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
