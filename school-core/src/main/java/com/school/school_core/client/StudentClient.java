package com.school.school_core.client;

import org.springframework.cloud.openfeign.FeignClient;

/*using dynamic proxy generation at runtime for the actual implementation */

@FeignClient
public interface StudentClient {
    
}
