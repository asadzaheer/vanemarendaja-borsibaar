package com.borsibaar.service;

import com.borsibaar.entity.Student;
import com.borsibaar.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer for Student.
 * Contains business logic and handles communication with repository.
 */
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    /**
     * Constructor injection
     */
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Create a new student
     */
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * Get all students
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * Get student by ID
     */
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    /**
     * Update student data
     */
    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = getStudentById(id);

        student.setGpa(updatedStudent.getGpa());
        student.setEnrollmentStatus(updatedStudent.getEnrollmentStatus());
        student.setParentId(updatedStudent.getParentId());

        return studentRepository.save(student);
    }

    /**
     * Delete student
     */
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}