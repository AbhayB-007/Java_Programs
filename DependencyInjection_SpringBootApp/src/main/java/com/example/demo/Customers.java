package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* 
Here we add 'component' annotation so that application
class check is it present in the package or not. And 
if it finds the customer class then it injects its
object to the application.
*/
@Component 
public class Customers {
	
	private int custid;
	private String custname;
	private String coursename;
	
	/*
	 'Autowired' annotations used so that Customers
	 class can identify the Technologies class also used
	 for automatic configuration.
	 */
	@Autowired
	private Technologies techdetail;

	// Getters & Setters
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	
	public Technologies getTechdetail() {
		return techdetail;
	}

	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
	}
	
	public void display() {
		System.out.println("Customers Object Returned Successfully");
		techdetail.tech();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
	}

}
