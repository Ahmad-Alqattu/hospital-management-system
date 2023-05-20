package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.repo.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Doctor")
public class DoctorCotroller {
    @Autowired
    private com.example.demo.repo.DoctorsRepo DoctorsRepo;

    @GetMapping("")
    public List<Doctor> getAllAppointment(){

        return DoctorsRepo.findAll();
    }

}
