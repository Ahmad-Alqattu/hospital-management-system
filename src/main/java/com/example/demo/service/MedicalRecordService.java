package com.example.demo.service;

import com.example.demo.dto.MedicalRecordDto;

import java.util.List;

public interface MedicalRecordService {
    MedicalRecordDto createMedicalRecord(MedicalRecordDto medicalRecordDto);

    List<MedicalRecordDto> getAllMedicalRecords();

    MedicalRecordDto getMedicalRecordById(Long id);

    MedicalRecordDto updateMedicalRecord(MedicalRecordDto medicalRecordDto, Long id);

    void deleteMedicalRecordById(Long id);
}
