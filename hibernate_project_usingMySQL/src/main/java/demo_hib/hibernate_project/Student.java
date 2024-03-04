package demo_hib.hibernate_project;

import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;

// In this class we are annotating the java class
// Mapping database table to this java class and table name is optional
// Its Optional in case of identical name of the class and table.

@Entity
@Table(name = "tbl_student")
public class Student {
	// @Id Signifies that it is a primary key
	@Id
	// (Assign primary keys using database identity column) or auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "Email_Id")
	private String emailId;

	@Column(name = "Phone_No")
	private long phoneNo;
	
	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	// Default Constructor
	public Student() {
	}
	
	// Parameterized Constructor
	public Student(String Name, String Email_Id, long Phone_No) {
		this.name = Name;
		this.emailId = Email_Id;
		this.phoneNo = Phone_No;		
	}	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}

	public static void main(String[] args) {
		
	}	
}