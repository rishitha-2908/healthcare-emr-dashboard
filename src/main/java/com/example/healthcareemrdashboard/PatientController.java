package com.example.healthcareemrdashboard;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private List<Patient> patients = new ArrayList<>(Arrays.asList(
            new Patient(101, "Ravi Kumar", 32, "O+", "Penicillin Allergy", "Blood Test Completed"),
            new Patient(102, "Anjali Sharma", 27, "A+", "No Allergies", "MRI Scan Completed"),
            new Patient(103, "David John", 45, "B+", "Dust Allergy", "Diabetes Under Observation")
    ));

    @GetMapping
    public List<Patient> getAllPatients() {
        return patients;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return patients.stream()
                .filter(patient -> patient.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        patients.add(patient);
        return patient;
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        patients.removeIf(patient -> patient.getId() == id);
        return "Patient deleted successfully";
    }
}

