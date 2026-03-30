package com.borsibaar.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
//for a test

/**
 * Student entity represents a student in the system.
 * It stores academic and enrollment-related information.
 */
@Entity
@Table(name = "students")
public class Student {


    /**
     * Primary key of the student
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ID of the related user (authentication entity)
     */
    @Column(nullable = false)
    private Long userId;

    /**
     * Enrollment status of the student (PENDING, APPROVED, REJECTED)
     */
    @Column(nullable = false)
    private String enrollmentStatus = "PENDING";

    /**
     * Student GPA (Grade Point Average)
     */
    @Column(nullable = false)
    private Double gpa = 0.0;

    /**
     * ID of the parent linked to this student
     */
    private Long parentId;

    /**
     * Timestamp when the student record was created
     */
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    /**
     * Timestamp when the student record was last updated
     */
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    /**
     * Default constructor
     */
    public Student() {}

    /**
     * Automatically sets timestamps before inserting into DB
     */
    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    /**
     * Automatically updates timestamp before updating record
     */
    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // ===== GETTERS AND SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;

    }

}