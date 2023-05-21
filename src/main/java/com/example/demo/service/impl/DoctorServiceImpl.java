package com.example.demo.service.impl;

import com.example.demo.dto.DoctorDto;
import com.example.demo.entity.Doctor;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DoctorsRepo;
import com.example.demo.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorsRepo DoctorsRepo;

    public DoctorServiceImpl(DoctorsRepo DoctorsRepo) {
        this.DoctorsRepo = DoctorsRepo;
    }

    @Override
    public DoctorDto createDoctor(DoctorDto doctorDto) {
        Doctor doctor = mapToEntity(doctorDto);
        Doctor newDoctor = DoctorsRepo.save(doctor);
        return mapToDTO(newDoctor);
    }

    @Override
    public List<DoctorDto> getAllDoctors() {
        List<Doctor> doctors = DoctorsRepo.findAll();
        return doctors.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDto getDoctorById(Long id) {
        Doctor doctor = DoctorsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor", "id", id));
        return mapToDTO(doctor);
    }

    @Override
    public DoctorDto updateDoctor(DoctorDto doctorDto, Long id) {
        Doctor doctor = DoctorsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor", "id", id));
        Doctor updatedDoctor = mapToEntity(doctorDto);
        updatedDoctor.setDr_id(doctor.getDr_id()); // Ensure the ID is preserved
        Doctor savedDoctor = DoctorsRepo.save(updatedDoctor);
        return mapToDTO(savedDoctor);
    }

    @Override
    public void deleteDoctorById(Long id) {
        Doctor doctor = DoctorsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor", "id", id));
        DoctorsRepo.delete(doctor);
    }

    private DoctorDto mapToDTO(Doctor doctor) {
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setDr_id(doctor.getDr_id());
        doctorDto.setDname(doctor.getDname());
        doctorDto.setDOB(doctor.getDOB());
        doctorDto.setPhone(doctor.getPhone());
        doctorDto.setInsurance_id(doctor.getInsurance_id());
        doctorDto.setEmail(doctor.getEmail());
        return doctorDto;
    }

    private Doctor mapToEntity(DoctorDto doctorDto) {
        Doctor doctor = new Doctor();
        doctor.setDr_id(doctorDto.getDr_id());
        doctor.setDname(doctorDto.getDname());
        doctor.setDOB(doctorDto.getDOB());
        doctor.setPhone(doctorDto.getPhone());
        doctor.setInsurance_id(doctorDto.getInsurance_id());
        doctor.setEmail(doctorDto.getEmail());
        return doctor;
    }
}
