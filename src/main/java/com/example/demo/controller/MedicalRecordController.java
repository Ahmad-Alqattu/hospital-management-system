package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.MedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/MedicalRecord")
public class MedicalRecordController {
    @Autowired
    private com.example.demo.repo.MedicalRecordRepo MedicalRecordRepo;
    @GetMapping("")
    public List<MedicalRecord> getAllAppointment(){

        return MedicalRecordRepo.findAll();
    }
}
