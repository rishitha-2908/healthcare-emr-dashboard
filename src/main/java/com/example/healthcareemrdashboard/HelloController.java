package com.example.healthcareemrdashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("api")
    public String home() {
        return "Healthcare EMR Dashboard Running Successfully!";
    }
}