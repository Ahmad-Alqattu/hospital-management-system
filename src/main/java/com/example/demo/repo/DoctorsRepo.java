package com.example.demo.repo;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepo extends JpaRepository<Doctor,Long> {
}

