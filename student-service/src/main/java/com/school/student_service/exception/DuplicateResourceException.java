package com.school.student_service.exception;

public class DuplicateResourceException extends RuntimeException {
    
    public DuplicateResourceException(String message) {
        super(message);
    }
}
