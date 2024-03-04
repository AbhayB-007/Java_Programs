package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepo repo;
	
	// Get All Employees
	public List<Employees> listAll(){
		return repo.findAll();
	}
	
	// Adding/PUT employees in db
	public void save(Employees emp) {
        repo.save(emp);
    }
     
	// get employee by id or POST
    public Employees get(Integer id) {
        return repo.findById(id).get();
    }
     
    // delete employee
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
