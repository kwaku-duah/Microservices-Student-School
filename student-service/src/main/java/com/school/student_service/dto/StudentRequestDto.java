package com.school.student_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


/*
 * best practice to use dto for data transferability
 * canonical constructors auto done 
 * does not have setters, thats where  mapstruct comes in
 */

public record StudentRequestDto(
    @NotBlank(message = "First Name is required")
    String firstName,


    @NotBlank(message = "Last Name is required") 
    String lastName,


    @NotBlank
    @Email(message = "Enter a valid email")
    String email,

    Long schoolId
) {}
