package demo_hib.Emp_Dept_Hibernate_console_app;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employees")
//@SecondaryTable(name = "tbl_department")
public class Employees {
	// tbl_employees

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
	@Column(name = "EmpId")
	private int empId;

	@Column(name = "EmpDeptId")
	private String empDeptId;

	@Column(name = "EmpName")
	private String empName;

	// Getters & Setters
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
	@Column(name = "EmpId")
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(String empDeptId) {
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	// toString
	@Override
	public String toString() {
		return "Employees [empId = " + empId + " | empDeptId = " + empDeptId + " | empName = " + empName + "]";
	}	

}
