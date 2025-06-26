package com.school.student_service.mapper;

import org.mapstruct.Mapper;

import com.school.student_service.dto.StudentRequestDto;
import com.school.student_service.entity.Student;

/*
 * mapper interface that mapstruct will implement automatically
 * dependencies are two, path, and dependency api
 * have to annotae this for spring to identify this as a component, spring
 * becomes responsible for its instantiation, management as a spring bean
 */

@Mapper(componentModel = "spring")
public interface StudentMapper {
    
    Student toEntity(StudentRequestDto dto);
}
