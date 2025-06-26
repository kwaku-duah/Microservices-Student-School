package com.school.student_service.repository;
import java.util.List;
/*
 * student repository
 */
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.student_service.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
    List<Student> findBySchoolId(Long schoolId);
}
