package com.example.demo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.sql.Date;
@Data
public class AppointmentDto{

    private Long appointment_id;
    private Date date;
    private int dr_id;
    private int patient_id;
    private String dr_notes;
    private int medical_id;


}