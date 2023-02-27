package com.appointment.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.Entity.Appointment;
import com.appointment.Service.AppointmentService;
import com.appointment.VO.ResponseTemplate;



@RestController
public class AppointmentController {

    @Autowired
    public AppointmentService appointmentService;

    @GetMapping("/appointment")
    public List<Appointment> getAllAppointments() {

        return appointmentService.getAllAppointment();

    }

    @GetMapping("/appointment/{id}")
    public Appointment getAppointment(@PathVariable("id") int id) {
        return appointmentService.getAppointmentById(id);
    }

//    @GetMapping("/appointment/doctorid/{did}")
//    public List<Appointment> getAppointmentBydId(@PathVariable("did") int did) {
//        return appointmentService.getAppointmentBydId(did);
//    }
    
    @PostMapping("/appointment")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        Appointment b =this.appointmentService.addAppointment(appointment);
        System.out.println(appointment);
        return b;
    }
    @DeleteMapping("/appointment/{appointmentid}")
    public void deleteAppointment(@PathVariable("appointmentid") int appointmentid) {
        this.appointmentService.deleteAppointment(appointmentid);
    
    }
    
    @PutMapping("/appointment/{appointmentid}")
    public Appointment updateAppointment(@RequestBody Appointment  appointment, @PathVariable("appointmentId") int aId) {
        this.appointmentService.updateAppointment(appointment,aId);
        return appointment;
    }
    
//    @GetMapping("/appointment/dd/{aid}")
//    public ResponseTemplate getAppointmentByaId(@PathVariable("aid") int aid) {
//    	return appointmentService.getAppointmentByaId(aid);
//    }
    
    @GetMapping("/appointmentDate/{aid}")
    public String getAppointmentDateByaId(@PathVariable("aid") int aid) {
    	return appointmentService.getAppointmentDateByaId(aid);
    }
}

