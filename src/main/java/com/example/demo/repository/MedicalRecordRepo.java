package com.example.demo.repository;

import com.example.demo.entity.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepo extends JpaRepository<MedicalRecord,Long> {
        }
