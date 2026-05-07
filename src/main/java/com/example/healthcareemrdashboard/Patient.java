package com.example.healthcareemrdashboard;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String bloodGroup;
    private String allergy;
    private String clinicalReport;
 public Patient() {

 }
    public Patient(int id, String name, int age, String bloodGroup, String allergy, String clinicalReport) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.allergy = allergy;
        this.clinicalReport = clinicalReport;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getBloodGroup() { return bloodGroup; }
    public String getAllergy() { return allergy; }
    public String getClinicalReport() { return clinicalReport; }
}
