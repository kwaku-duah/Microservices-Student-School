package com.school.school_core.dto;

public record FullSchooLResponseDto(
        String firstName,
        String lastName,
        String email,
        Long schoolId
// List<Student> students About to establish openfeign client for comms Open
// Feign client
) {}
