package com.school.school_core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.school_core.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {
    
}
