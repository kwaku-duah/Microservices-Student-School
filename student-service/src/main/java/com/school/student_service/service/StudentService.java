package com.school.student_service.service;

import java.util.List;

import com.school.student_service.dto.StudentRequestDto;
import com.school.student_service.dto.StudentResponseDto;

/*
 * discusses what should be done
 * an interface is a blueprints that details what methods a class should have
 * not how it should implement them
 */

public interface StudentService {
    StudentResponseDto createStudent(StudentRequestDto dto);

    List<StudentResponseDto> findAllStudents();

    StudentResponseDto getStudentById(Long id);

    void deleteStudent(Long id);

    List<StudentResponseDto> getBySchoolAttendedId(Long schoolId);
}
