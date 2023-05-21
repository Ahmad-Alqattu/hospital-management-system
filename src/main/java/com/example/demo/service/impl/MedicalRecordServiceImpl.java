package com.example.demo.service.impl;

import com.example.demo.dto.MedicalRecordDto;
import com.example.demo.entity.MedicalRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.MedicalRecordRepo;
import com.example.demo.service.MedicalRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    private final MedicalRecordRepo MedicalRecordRepo;

    public MedicalRecordServiceImpl(MedicalRecordRepo MedicalRecordRepo) {
        this.MedicalRecordRepo = MedicalRecordRepo;
    }

    @Override
    public MedicalRecordDto createMedicalRecord(MedicalRecordDto medicalRecordDto) {
        MedicalRecord medicalRecord = mapToEntity(medicalRecordDto);
        MedicalRecord newMedicalRecord = MedicalRecordRepo.save(medicalRecord);
        return mapToDTO(newMedicalRecord);
    }

    @Override
    public List<MedicalRecordDto> getAllMedicalRecords() {
        List<MedicalRecord> medicalRecords = MedicalRecordRepo.findAll();
        return medicalRecords.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MedicalRecordDto getMedicalRecordById(Long id) {
        MedicalRecord medicalRecord = MedicalRecordRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MedicalRecord", "id", id));
        return mapToDTO(medicalRecord);
    }

    @Override
    public MedicalRecordDto updateMedicalRecord(MedicalRecordDto medicalRecordDto, Long id) {
        MedicalRecord medicalRecord = MedicalRecordRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MedicalRecord", "id", id));
        MedicalRecord updatedMedicalRecord = mapToEntity(medicalRecordDto);
        updatedMedicalRecord.setMedical_id(medicalRecord.getMedical_id()); // Ensure the ID is preserved
        MedicalRecord savedMedicalRecord = MedicalRecordRepo.save(updatedMedicalRecord);
        return mapToDTO(savedMedicalRecord);
    }

    @Override
    public void deleteMedicalRecordById(Long id) {
        MedicalRecord medicalRecord = MedicalRecordRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MedicalRecord", "id", id));
        MedicalRecordRepo.delete(medicalRecord);
    }

    private MedicalRecordDto mapToDTO(MedicalRecord medicalRecord) {
        MedicalRecordDto medicalRecordDto = new MedicalRecordDto();
        medicalRecordDto.setMedical_id(medicalRecord.getMedical_id());
        medicalRecordDto.setDiagnosis(medicalRecord.getDiagnosis());
        medicalRecordDto.setTreatments(medicalRecord.getTreatments());
        medicalRecordDto.setMedications(medicalRecord.getMedications());
        medicalRecordDto.setTestResults(medicalRecord.getTestResults());
        return medicalRecordDto;
    }

    private MedicalRecord mapToEntity(MedicalRecordDto medicalRecordDto) {
        MedicalRecord medicalRecord = new MedicalRecord();
      medicalRecord.setMedical_id(medicalRecordDto.getMedical_id());
        medicalRecord.setDiagnosis(medicalRecordDto.getDiagnosis());
        medicalRecord.setTreatments(medicalRecordDto.getTreatments());
        medicalRecord.setMedications(medicalRecordDto.getMedications());
        medicalRecord.setTestResults(medicalRecordDto.getTestResults());
        return medicalRecord;
    }
}
