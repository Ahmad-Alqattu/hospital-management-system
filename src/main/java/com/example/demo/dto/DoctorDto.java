package com.example.demo.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.sql.Date;

@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields
public class DoctorDto{

    private Long dr_id;
    @NotNull
    @Size(min = 3, max = 250)
    private String dname;
    private Date DOB;
    private int phone;
    private int insurance_id;
    private String email;


}