package com.school.school_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SchoolCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolCoreApplication.class, args);
	}

}
