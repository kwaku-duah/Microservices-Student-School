package com.school.student_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.student_service.dto.StudentRequestDto;
import com.school.student_service.dto.StudentResponseDto;
import com.school.student_service.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/*
 * controller depends on the service interface
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping()
    public ResponseEntity<StudentResponseDto> addStudent(@RequestBody @Valid StudentRequestDto dto) {
        return ResponseEntity.ok(studentService.createStudent(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDto> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @GetMapping("/school/{schoolId}")
    public ResponseEntity<List<StudentResponseDto>> getSchoolById(@PathVariable Long schoolId) {
        return ResponseEntity.ok(studentService.getBySchoolAttendedId(schoolId));
    }

    @DeleteMapping("delete/{id}")
    public void deleteByStudentId(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

}
