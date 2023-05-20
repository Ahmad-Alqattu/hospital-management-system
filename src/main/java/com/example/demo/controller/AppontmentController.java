package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repo.AppointmentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Appointment")
public class AppontmentController {
    @Autowired
    private AppointmentRepository AppointmentRepository;

    @GetMapping("")
    public List<Appointment> getAllAppointment(){

        return AppointmentRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Appointment> getAllAppointment(
        @PathVariable(name = "id") long id) {
            return ( AppointmentRepository.findById(id));


    }
    @PostMapping("/a")
    public ResponseEntity<Appointment> createCategory
            (@Valid @RequestBody Appointment Appointment) {

        Appointment newCategory = AppointmentRepository.save(Appointment);

        // convert entity to DTO
//        return newCategory;
        return new ResponseEntity(newCategory, HttpStatus.CREATED);
    }



}
