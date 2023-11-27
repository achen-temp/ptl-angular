package com.volvo.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volvo.backend.domain.Appointment;
import com.volvo.backend.service.AppointmentService;

@CrossOrigin
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping("/new")
    public ResponseEntity<Appointment> confirmAppointment(@RequestBody Appointment appointment) {
        try {
            Appointment appt = service.addAppointment(appointment);
            return new ResponseEntity<Appointment>(appt, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}
