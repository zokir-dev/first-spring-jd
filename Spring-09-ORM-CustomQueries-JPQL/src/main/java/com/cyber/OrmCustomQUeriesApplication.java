package com.cyber;

import com.cyber.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrmCustomQUeriesApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmCustomQUeriesApplication.class, args);



	}

	@PostConstruct
	public void testEmployee(){
		System.out.println("===================================================");
		System.out.println(employeeRepository.getEMployeeDetail());

		System.out.println(employeeRepository.getEmployeeSalary());

	}


}
