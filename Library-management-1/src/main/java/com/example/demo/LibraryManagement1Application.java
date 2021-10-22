package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo.model"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan
public class LibraryManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagement1Application.class, args);
		System.out.println("run successfully");
	}

}
