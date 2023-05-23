package com.example.demo.service.impl;

import com.example.demo.dto.AppointmentDto;
import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository AppointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository AppointmentRepository) {
        this.AppointmentRepository = AppointmentRepository;
    }

    @Override
    public AppointmentDto createAppointment(AppointmentDto AppointmentDto) {
        // convert DTO to entity
        Appointment Appointment = mapToEntity(AppointmentDto);
        Appointment newAppointment = AppointmentRepository.save(Appointment);

        // convert entity to DTO
        AppointmentDto AppointmentResponse = mapToDTO(newAppointment);
        return AppointmentResponse;
    }

    @Override
    public List<AppointmentDto> getAllAppointment() {
        List<Appointment> Appointments = AppointmentRepository.findAll();
        return Appointments.stream()
                .map(Appointment -> mapToDTO(Appointment))
                .collect(Collectors.toList());
    }

    @Override
    public AppointmentDto getAppointmentById(long id) {
        Appointment Appointment = AppointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment", "id", id));
        return mapToDTO(Appointment);
    }

    @Override
    public AppointmentDto updateAppointment(AppointmentDto AppointmentDto, long id) {
        // get Appointment by id from the database
        Appointment Appointment = AppointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment", "id", id));
        Appointment saveAppointment = mapToEntity(AppointmentDto);
        saveAppointment.setAppointment_id(Appointment.getAppointment_id()); // Ensure the ID is preserved

        Appointment updatedAppointment = AppointmentRepository.save(saveAppointment);
        return mapToDTO(updatedAppointment);
    }

    @Override
    public void deleteAppointmentById(long id) {
        // get Appointment by id from the database
        Appointment Appointment = AppointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment", "id", id));
        AppointmentRepository.delete(Appointment);
    }

    // convert Entity into DTO
    private AppointmentDto mapToDTO(Appointment Appointment) {
        AppointmentDto AppointmentDto = new AppointmentDto();
        AppointmentDto.setAppointment_id(Appointment.getAppointment_id());
        AppointmentDto.setDr_notes(Appointment.getDr_notes());
        AppointmentDto.setDate(Appointment.getDate());
        AppointmentDto.setPatient_id(Appointment.getPatient_id());
        AppointmentDto.setDr_id(Appointment.getDr_id());
        AppointmentDto.setMedical_id(Appointment.getMedical_id());

        return AppointmentDto;
    }

    // convert DTO to entity
    private Appointment mapToEntity(AppointmentDto appointmentDto) {
        Appointment appointment = new Appointment();
        appointment.setAppointment_id(appointmentDto.getAppointment_id());
        appointment.setDr_notes(appointmentDto.getDr_notes());
        appointment.setDate(appointmentDto.getDate());
        appointment.setPatient_id(appointmentDto.getPatient_id());
        appointment.setDr_id(appointmentDto.getDr_id());
        appointment.setMedical_id(appointmentDto.getMedical_id());

        return appointment;
    }
}
