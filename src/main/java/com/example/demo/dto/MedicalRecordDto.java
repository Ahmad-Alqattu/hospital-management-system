package com.example.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields
public class MedicalRecordDto {

    private Long medical_id;
    private String diagnosis;
    private String treatments;
    private String medications;
    private String testResults;

}