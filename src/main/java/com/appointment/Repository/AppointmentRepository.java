package com.appointment.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appointment.Entity.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

	public Appointment findById(int aid);

//	public List<Appointment> findBydId(int did);

	public Appointment findByaId(int aid);
}
