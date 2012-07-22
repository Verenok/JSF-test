package com.otv.managed.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.otv.model.Supplier;
import com.otv.model.User;
import com.otv.user.dao.ISupplierDAO;


@ManagedBean(name="supplierMB")
@RequestScoped
public class SupplierManagedBean  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{SupplierDAO}")
	ISupplierDAO supplierDAO;
	
	List<Supplier> supplierList=new ArrayList<Supplier>();

	public ISupplierDAO getSupplierDAO() {
		return supplierDAO;
	}

	public void setSupplierDAO(ISupplierDAO supplierDAO) {
		this.supplierDAO = supplierDAO;
	}

	public List<Supplier> getSupplierList() {
        supplierList=new ArrayList<Supplier>();
        supplierList.addAll(supplierDAO.getAll());
		return supplierList;
	}

	public void setSupplierList(List<Supplier> supplierList) {
		this.supplierList = supplierList;
	}
	
	

}
