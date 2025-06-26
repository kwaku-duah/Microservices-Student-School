package com.school.student_service.service;
/*
 * business logic for the service layer
 * depends on repository
 * would be injecting repository in it as a final field
 * 
 */

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.student_service.dto.StudentRequestDto;
import com.school.student_service.dto.StudentResponseDto;
import com.school.student_service.entity.Student;
import com.school.student_service.exception.DuplicateResourceException;
import com.school.student_service.exception.ResourceNotFoundException;
import com.school.student_service.mapper.StudentMapper;
import com.school.student_service.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    @Override
    public StudentResponseDto createStudent(StudentRequestDto dto) {
        if (studentRepository.findByEmail(dto.email()).isPresent())
            throw new DuplicateResourceException("Email already exists for this user");

        Student student = studentMapper.toEntity(dto);
        return studentMapper.toStudentResponseDto(studentRepository.save(student));

    }

    @Override
    public List<StudentResponseDto> findAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toStudentResponseDto)
                .toList();
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentResponseDto getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No student exists by this id"));

        return studentMapper.toStudentResponseDto(student);
    }

    @Override
    public List<StudentResponseDto> getBySchoolAttendedId(Long schoolId) {
        return studentRepository.findBySchoolId(schoolId)
                .stream()
                .map(studentMapper::toStudentResponseDto)
                .toList();
    }

}