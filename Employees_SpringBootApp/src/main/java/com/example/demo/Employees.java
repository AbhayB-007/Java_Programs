package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {

	private int empId;
	private String empDept;	
	private String empName;
	
	// Constructors
	public Employees() {
		super();
	}
	public Employees(int empId, String empDept, String empName) {
		super();
		this.empId = empId;
		this.empDept = empDept;
		this.empName = empName;
	}

	// Getters & Setters
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
	public int getEmpId() {
		return empId;
	}	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	//toString
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empDept=" + empDept + ", empName=" + empName + "]";
	}
	
	


}
