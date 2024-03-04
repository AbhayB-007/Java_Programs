package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String emp_name;
	private String emp_deptId;

	// Getters & Setters

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_deptId() {
		return emp_deptId;
	}

	public void setEmp_deptId(String emp_deptId) {
		this.emp_deptId = emp_deptId;
	}

	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_deptId=" + emp_deptId + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
