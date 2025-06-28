package com.school.school_core.client;


import org.springframework.cloud.openfeign.FeignClient;



/*using dynamic proxy generation at runtime for the actual implementation */

@FeignClient(name = "student-service", url = "http://localhost:8082")
public interface StudentClient {
   //methods sign
}