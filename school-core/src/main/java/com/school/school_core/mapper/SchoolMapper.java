package com.school.school_core.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.school.school_core.dto.SchoolRequestDto;
import com.school.school_core.dto.SchoolResponseDto;
import com.school.school_core.entity.School;

@Mapper(componentModel = "spring")
public interface SchoolMapper {

    @Mapping(target = "schoolId", ignore = true)
    School toEntity(SchoolRequestDto dto);

    SchoolResponseDto toResponseDto(School school);

}
