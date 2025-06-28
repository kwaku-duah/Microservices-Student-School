package com.school.school_core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.school_core.dto.SchoolRequestDto;
import com.school.school_core.dto.SchoolResponseDto;
import com.school.school_core.entity.School;
import com.school.school_core.mapper.SchoolMapper;
import com.school.school_core.repository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    private final SchoolMapper schoolMapper;

    @Override
    public SchoolResponseDto saveStudent(SchoolRequestDto dto) {

        School school = schoolMapper.toEntity(dto);
        return schoolMapper.toResponseDto(schoolRepository.save(school));
    }

    @Override
    public List<SchoolResponseDto> findAllStudents() {
        return schoolRepository.findAll()
            .stream()
            .map(schoolMapper::toResponseDto)
            .toList();
         
    }


}
