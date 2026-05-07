package com.example.healthcareemrdashboard;

import java.util.Arrays;
import java.util.List;

public class PatientService {

    public static List<Patient> getPatients() {

        return Arrays.asList(

                new Patient(
                        101,
                        "Ravi Kumar",
                        32,
                        "O+",
                        "Penicillin Allergy",
                        "Blood Test Completed"
                ),

                new Patient(
                        102,
                        "Anjali Sharma",
                        27,
                        "A+",
                        "No Allergies",
                        "MRI Scan Completed"
                ),

                new Patient(
                        103,
                        "David John",
                        45,
                        "B+",
                        "Dust Allergy",
                        "Diabetes Under Observation"
                )
        );
    }
}