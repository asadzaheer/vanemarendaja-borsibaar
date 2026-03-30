package com.borsibaar.controller;

import com.borsibaar.entity.Student;
import com.borsibaar.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for Student operations
 */
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * Constructor injection
     */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * GET all students
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * GET student by ID
     */
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    /**
     * CREATE new student
     */
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    /**
     * UPDATE student
     */
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    /**
     * DELETE student
     */
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        //add new
        System.out.println("Student");

    }
}