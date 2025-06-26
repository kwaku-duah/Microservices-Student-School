package com.school.student_service.repository;
/*
 * student repository
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.student_service.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
