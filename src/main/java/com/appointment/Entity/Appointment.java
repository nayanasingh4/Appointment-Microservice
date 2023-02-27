package com.appointment.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.appointment.VO.Doctor;
import com.appointment.VO.Patient;



@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
//	private int pId;
//	private int dId;
	
//	private Doctor doctor_id;
//	private Patient patient_id;
	
	String id = UUID.randomUUID().toString();

	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String appointmentDate;

	public Appointment(int i, int j, int k, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

//	public int getpId() {
//		return pId;
//	}
//
//	public void setpId(int pId) {
//		this.pId = pId;
//	}
//
//	public int getdId() {
//		return dId;
//	}
//
//	public void setdId(int dId) {
//		this.dId = dId;
//	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int aId, String appointmentDate) {
		super();
		this.aId = aId;
		this.appointmentDate = appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

//	public Doctor getDoctor_id() {
//		return doctor_id;
//	}
//
//	public void setDoctor_id(Doctor doctor_id) {
//		this.doctor_id = doctor_id;
//	}
//
//	public Patient getPatient_id() {
//		return patient_id;
//	}
//
//	public void setPatient_id(Patient patient_id) {
//		this.patient_id = patient_id;
//	}

	

}