package com.borsibaar.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentSelfController {

    // 1. Dashboard
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Student dashboard";
    }

    // 2. Enroll to class
    @PostMapping("/enrollments")
    public String enroll() {
        return "Enrollment request sent";
    }

    // 3. View grades
    @GetMapping("/grades")
    public String grades() {
        return "Student grades";
    }

    // 4. Submit assignment
    @PostMapping("/submissions")
    public String submit() {
        return "Assignment submitted";
    }
}