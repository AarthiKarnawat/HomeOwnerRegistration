package com.hoa.customerregisterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.hoa.customerregisterservice.resource.CustomerRegisterResource;

@SpringBootApplication

@ComponentScan(basePackageClasses = CustomerRegisterResource.class)
public class CustomerRegisterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRegisterServiceApplication.class, args);
	}

}
