package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="customers", path="customers")
public interface EmployeesRepo extends JpaRepository<Employees, Integer>{

}
