package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

// 'ComponentScan' is basically provides support to scan
// every component we want
@ComponentScan
@SpringBootApplication
public class SubmissionFormsSpringAppApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SubmissionFormsSpringAppApplication.class);		
	}
	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormsSpringAppApplication.class, args);
	}

}
