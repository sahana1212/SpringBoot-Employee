package com.mindtree.employeeProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mindtree.employeeProj")
@SpringBootApplication
public class EmployeeProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjApplication.class, args);

	}

}
