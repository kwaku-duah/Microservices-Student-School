package com.school.school_core.service;

import java.util.List;


import com.school.school_core.dto.SchoolRequestDto;
import com.school.school_core.dto.SchoolResponseDto;

public interface SchoolService {
    SchoolResponseDto saveStudent(SchoolRequestDto dto);

    List<SchoolResponseDto> findAllStudents();
}
