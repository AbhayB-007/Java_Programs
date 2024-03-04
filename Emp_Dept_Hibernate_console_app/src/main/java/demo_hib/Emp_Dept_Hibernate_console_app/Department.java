package demo_hib.Emp_Dept_Hibernate_console_app;

import javax.persistence.*;

//@SecondaryTable(name = "tbl_employees")
@Entity
@Table(name = "tbl_department")
public class Department {
	
	@Id
	@Column(name = "DeptId")
	private String DeptId;
	
	@Column(name = "DeptName")
	private String DeptName;
	
	@Column(name = "NoOfEmpInDept")
	private int NoOfEmpInDept;
	
	// Getters & Setters
	
	public String getDeptId() {
		return DeptId;
	}

	public void setDeptId(String deptId) {
		DeptId = deptId;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public int getNoOfEmpInDept() {
		return NoOfEmpInDept;
	}

	public void setNoOfEmpInDept(int noOfEmpInDept) {
		NoOfEmpInDept = noOfEmpInDept;
	}
	
	// toString
	@Override
	public String toString() {
		return "Department [DeptId = " + DeptId + " | DeptName = " + DeptName + " | NoOfEmpInDept = " + NoOfEmpInDept + "]";
	}

	
	
	

}
