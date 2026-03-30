package com.borsibaar.repository;

import com.borsibaar.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Student entity.
 * Provides basic CRUD operations.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}