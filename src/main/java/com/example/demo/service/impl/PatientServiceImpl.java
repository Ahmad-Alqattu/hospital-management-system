package com.example.demo.service.impl;

import com.example.demo.dto.PatientDto;
import com.example.demo.entity.Patient;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.PatientRepo;
import com.example.demo.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepo PatientRepo;

    public PatientServiceImpl(PatientRepo PatientRepo) {
        this.PatientRepo = PatientRepo;
    }

    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = mapToEntity(patientDto);
        Patient newPatient = PatientRepo.save(patient);
        return mapToDTO(newPatient);
    }

    @Override
    public List<PatientDto> getAllPatients() {
        List<Patient> patients = PatientRepo.findAll();
        return patients.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PatientDto getPatientById(Long id) {
        Patient patient = PatientRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", "id", id));
        return mapToDTO(patient);
    }

    @Override
    public PatientDto updatePatient(PatientDto patientDto, Long id) {
        Patient patient = PatientRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", "id", id));
        Patient updatedPatient = mapToEntity(patientDto);
        updatedPatient.setPatient_id(patient.getPatient_id()); // Ensure the ID is preserved
        Patient savedPatient = PatientRepo.save(updatedPatient);
        return mapToDTO(savedPatient);
    }

    @Override
    public void deletePatientById(Long id) {
        Patient patient = PatientRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", "id", id));
        PatientRepo.delete(patient);
    }

    private PatientDto mapToDTO(Patient patient) {
        PatientDto patientDto = new PatientDto();
        patientDto.setPatient_id(patient.getPatient_id());
        patientDto.setP_name(patient.getP_name());
        patientDto.setPhone(patient.getPhone());
        patientDto.setEmail(patient.getEmail());
        patientDto.setDOB(patient.getDOB());
        patientDto.setInsuranceID(patient.getInsuranceID());
        return patientDto;
    }

    private Patient mapToEntity(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setPatient_id(patientDto.getPatient_id());
        patient.setP_name(patientDto.getP_name());
        patient.setPhone(patientDto.getPhone());
        patient.setEmail(patientDto.getEmail());
        patient.setDOB(patientDto.getDOB());
        patient.setInsuranceID(patientDto.getInsuranceID());
        return patient;
    }
}
