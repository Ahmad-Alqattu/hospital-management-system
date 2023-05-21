package com.example.demo.service;

import com.example.demo.dto.AppointmentDto;

import java.util.List;

public interface AppointmentService {
    AppointmentDto createAppointment(AppointmentDto CategoryDto);

    List<AppointmentDto> getAllAppointment();

    AppointmentDto getAppointmentById(long id);

    AppointmentDto updateAppointment(AppointmentDto AppointmentDto, long id);

    void deleteAppointmentById(long id);

}
