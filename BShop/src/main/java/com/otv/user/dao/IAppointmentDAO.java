package com.otv.user.dao;

import java.util.List;

import com.otv.model.Appointment;

public interface IAppointmentDAO {

	public void add(Appointment app);

	public Appointment get(Long id);

	public List<Appointment> getAll();

	public void remove(Long id);
	
	public void update(Long id);

}
