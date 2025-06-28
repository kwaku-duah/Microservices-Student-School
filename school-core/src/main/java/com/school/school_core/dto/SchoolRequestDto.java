package com.school.school_core.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SchoolRequestDto(
        @NotBlank(message = "Enter a  name") String name,

        @Email(message = "Enter a valid email") String email) {

}
