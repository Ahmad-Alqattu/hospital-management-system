package com.example.demo.controller;

import com.example.demo.dto.MedicalRecordDto;
import com.example.demo.exception.BadRequestException;
import com.example.demo.service.MedicalRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/medical-records")
public class MedicalRecordController {
    private final Logger log = LoggerFactory.getLogger(MedicalRecordController.class);

    private final MedicalRecordService medicalRecordService;

    public MedicalRecordController(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }

    @GetMapping
    public ResponseEntity<List<MedicalRecordDto>> getAllMedicalRecords() {
        return ResponseEntity.ok().body(medicalRecordService.getAllMedicalRecords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicalRecordDto> getMedicalRecordById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(medicalRecordService.getMedicalRecordById(id));
    }

    @PostMapping
    public ResponseEntity<MedicalRecordDto> createMedicalRecord(@Valid @RequestBody MedicalRecordDto medicalRecordDto) {
        if (medicalRecordDto.getMedical_id() != null) {
            log.error("Cannot have an ID {}", medicalRecordDto);
            throw new BadRequestException(MedicalRecordController.class.getSimpleName(), "Medical Record ID");
        }
        return new ResponseEntity<>(medicalRecordService.createMedicalRecord(medicalRecordDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicalRecordDto> updateMedicalRecord(@Valid @RequestBody MedicalRecordDto medicalRecordDto,
                                                                @PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(medicalRecordService.updateMedicalRecord(medicalRecordDto, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMedicalRecord(@PathVariable(name = "id") Long id) {
        medicalRecordService.deleteMedicalRecordById(id);
        return new ResponseEntity<>("Deleted successfully.", HttpStatus.OK);
    }
}
