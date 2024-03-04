package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
// Consists All Mapping annotations
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices service;

	// get all Employees
	@GetMapping("/employees")
	public List<Employees> list() {
		return service.listAll();
	}

	// get employee by id
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employees> get(@PathVariable Integer id) {
		try {
			Employees emp = service.get(id);
			return new ResponseEntity<Employees>(emp, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Employees>(HttpStatus.NOT_FOUND);
		}
	}
	
	// add employee in db
	@PostMapping("/saveEmployee")
	public void add(@RequestBody Employees emp) {
	    service.save(emp);
	}
	
	// update any employee by id 
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<?> update(@RequestBody Employees emp, @PathVariable Integer id) {
	    try {
	    	Employees existEmp = service.get(id);
	        service.save(emp);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}

	// delete employee by id
	@DeleteMapping("/deleteEmployee/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
