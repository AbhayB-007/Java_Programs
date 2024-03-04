package demo_hib.Friends_Console_Application;

import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

/* In this class we are annotating the java class */
/* Mapping database table to this java class and table name is optional
(Its Optional in case of identical name of the class and table.) */

@Entity
@Table(name = "tbl_friends") /* Explicitly connecting the Table Name */
public class Friends {
	@Id /* @Id Signifies that it is a primary key */
	@Column(name = "PhoneNumber") /* Explicitly connecting the Column Name */
	private long phoneNumber;

	@Column(name = "FirstName") /* Explicitly connecting the Column Name */
	private String firstName;

	@Column(name = "LastName") /* Explicitly connecting the Column Name */
	private String lastName;

	@Column(name = "CommonFrnd") /* Explicitly connecting the Column Name */
	private String commonFrnd;

	// Getters & Setters
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCommonFrnd() {
		return commonFrnd;
	}

	public void setCommonFrnd(String commonFrnd) {
		this.commonFrnd = commonFrnd;
	}
	
	/*
	 * Here we r overriding the toString Method defined in Object Class and this
	 * methods executes when we only print the object of the class but in this case
	 * this overridden method gets executed
	 */
	@Override
	public String toString() {
		return "[ Phone Number = " + phoneNumber + " | First Name = " + firstName + " | Last Name = " + lastName
				+ " | Common Friend = " + commonFrnd + " ]";
	}

	/*
	 * public String getFrndWithPhoneNo() { return "Friends [ firstName=" +
	 * firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + " ]";
	 * }
	 */

	// Main Method
	public static void main(String[] args) {

	}
}
