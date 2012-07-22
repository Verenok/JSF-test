package com.otv.user.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;


import com.otv.model.Supplier;

@Transactional(readOnly = true)
public class SupplierDAO implements ISupplierDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Transactional(readOnly = false)
	@Override
	public void add(Supplier supplier) {
		sessionFactory.getCurrentSession().save(supplier);
		
	}

	@Override
	public Supplier get(Long id) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Supplier> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier")
				.list();
	}
	
	@Transactional(readOnly = false)
	@Override
	public void remove(Long id) {
		Supplier supplier = (Supplier) sessionFactory.getCurrentSession().load(
				Supplier.class, id);
		if (supplier != null) {
			sessionFactory.getCurrentSession().delete(supplier);
		}
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void update(Long id) {
		Supplier supplier = (Supplier) sessionFactory.getCurrentSession().load(
				Supplier.class, id);
		if (supplier != null) {
			sessionFactory.getCurrentSession().delete(supplier);
		}
		sessionFactory.getCurrentSession().save(supplier);
		
	}

}
