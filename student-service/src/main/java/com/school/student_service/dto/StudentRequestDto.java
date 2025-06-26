package com.school.student_service.dto;

/*
 * best practice to use dto for data transferability
 * canonical constructors auto done 
 * does not have setters, thats where  mapstruct comes in
 */

public record StudentRequestDto(
    String firstName,
    String lastName,
    String email,
    Long schoolId
) {}
