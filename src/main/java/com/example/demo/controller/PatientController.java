package com.example.demo.controller;

import com.example.demo.entity.MedicalRecord;
import com.example.demo.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/p")
public class PatientController {

    @Autowired
    private com.example.demo.repo.PatientRepo PatientRepo;
    @GetMapping("")
    public List<Patient> getAllAppointment(){

        return PatientRepo.findAll();
    }
}
