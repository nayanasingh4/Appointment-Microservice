package com.appointment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.appointment.Entity.Appointment;
import com.appointment.Repository.AppointmentRepository;
import com.appointment.VO.Doctor;
import com.appointment.VO.Patient;
import com.appointment.VO.ResponseTemplate;



@Service
public class AppointmentService {
//	@Autowired
//	public RestTemplate restTemplate;

	@Autowired
	public AppointmentRepository appointmentRepository;

	// To get a list of appointment
	public List<Appointment> getAllAppointment() {
		List<Appointment> list = (List<Appointment>) this.appointmentRepository.findAll();
		return list;
	}

	// To get a appointment by id
	public Appointment getAppointmentById(int aid) {
		Appointment appointment = null;
		appointment = this.appointmentRepository.findById(aid);
		return appointment;
	}

//	// To get a list of appointment by doctor id
//	public List<Appointment> getAppointmentBydId(int did) {
//		List<Appointment> list1 = (List<Appointment>) this.appointmentRepository.findBydId(did);
//		return list1;
//
//	}

	// To add appointment
	public Appointment addAppointment(Appointment appointment) {
		Appointment result = appointmentRepository.save(appointment);
		return result;

	}

	// To delete appointment
	public void deleteAppointment(int appointmentid) {
		appointmentRepository.deleteById(appointmentid);

	}

	// To update appointment
	public void updateAppointment(Appointment appointment, int aId) {
		appointment.setaId(aId);
		appointmentRepository.save(appointment);
	}

	public String getAppointmentDateByaId(int aid) {
		Appointment appointment = null;
		appointment = this.appointmentRepository.findById(aid);
		return appointment.getAppointmentDate();
	}

//	public ResponseTemplate getAppointmentByaId(int aid) {
//
//		ResponseTemplate a = new ResponseTemplate();
//		Appointment appointment = this.appointmentRepository.findByaId(aid);
//		Doctor doctor = restTemplate.getForObject("http://localhost:9095/doctors/" + appointment.getdId(),
//				Doctor.class);
//		Patient patient = restTemplate.getForObject("http://localhost:8007/patient/patientById/" + appointment.getpId(),
//				Patient.class);
//		a.setAppointment(appointment);
//		a.setDoctor(doctor);
//		a.setPatient(patient);
//		return a;
//
//	}

}
