package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoDependencySpringBootAppApplication {

	public static void main(String[] args) {		
		/* 
		so here we tell the spring container that we need 
		need spring object of customers class 
		*/
		ConfigurableApplicationContext context =  SpringApplication.run(DemoDependencySpringBootAppApplication.class, args);
		Customers c = context.getBean(Customers.class);		
		c.display();
	}

}
