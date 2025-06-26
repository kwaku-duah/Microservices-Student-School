package com.school.school_core.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import com.school.school_core.dto.FullSchooLResponseDto;

/*using dynamic proxy generation at runtime for the actual implementation */

@FeignClient(name = "student-service", url = "http://localhost:8082/api/v1")
public interface StudentClient {
    
public List<FullSchooLResponseDto> getStudentBySchool(@PathVariable Long schoolId);
}