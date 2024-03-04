package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

	private int techid;
	private String techname;
	
	// Getters & Setters
	public int getTechid() {
		return techid;
	}

	public void setTechid(int techid) {
		this.techid = techid;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}
	
	public void tech() {
		System.out.println("Completed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		

	}

}
