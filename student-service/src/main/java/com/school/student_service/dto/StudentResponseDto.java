package com.school.student_service.dto;

public record StudentResponseDto(
        String firstName,
        String lastName,
        String email,
        Long schoolId) {

}
