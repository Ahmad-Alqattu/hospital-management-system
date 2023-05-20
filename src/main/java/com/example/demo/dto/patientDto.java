package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields
public class patientDto {

    private Long patient_id;
    private String p_name;
    private int phone;
    private String email;
    private Date DOB;
    private int insuranceID;
}
