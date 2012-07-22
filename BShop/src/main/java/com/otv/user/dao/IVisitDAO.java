package com.otv.user.dao;

import java.util.List;

import com.otv.model.Visit;

public interface IVisitDAO {

	public void add(Visit visit);

	public Visit get(Long id);

	public List<Visit> getAll();

	public void remove(Long id);
	
	public void update(Long id);
}
