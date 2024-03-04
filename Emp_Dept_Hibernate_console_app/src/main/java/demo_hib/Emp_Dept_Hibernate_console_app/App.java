package demo_hib.Emp_Dept_Hibernate_console_app;

import java.util.Scanner;
import java.util.List;

/* Packages imported so that we can establish connection between Hibernate and MySql(Database)*/
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class App {

	// 1st Function
	public void read(Session session) {
		// querying all the friends
		System.out.println("Querying all the Employees...");
		List<Employees> allEmployees = session.createQuery("from Employees").getResultList();
		// displaying all the employees
		System.out.println("\nDisplaying all the Employees");
		System.out.println("************************************************************");
		displayList(allEmployees);
		if (allEmployees.isEmpty()) {
			System.out.println("No Data Found in the database! }:-(");
		}
		System.out.println("************************************************************");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");

	}

	// 2nd Function
	public void create(Session... session) {
		Employees newEmp = new Employees();

		List<Department> allDept = session[1].createQuery("from Department").getResultList();
		System.out.println("************************************************************");

		// Taking the data of new Employee
		System.out.print("\nEnter the name : ");
		Scanner sc = new Scanner(System.in);
		newEmp.setEmpName(sc.nextLine());

		// Displaying all the dept's with their names
		System.out.println(
				"\nChoose department Id from below :-\nDepartment Id | Department Name\n------------------------------");
		for (Department dept : allDept) {
			System.out.println("      " + dept.getDeptId() + " : " + dept.getDeptName());
		}
		System.out.println("------------------------------");
		System.out.print("\nEnter the Department Id : ");
		newEmp.setEmpDeptId(sc.next());

		// Saving the New Employee
		System.out.println("\nSaving the details of New Employee...");
		session[0].save(newEmp);
		System.out.println("Saved Succesfully!!!");
		System.out.println("************************************************************");

		// Now calculating all the employees in each department
//		System.out.println("Now calculating all the employees in each department");
		for (Department dept : allDept) {
			String query = "from Employees emp where emp.empDeptId = '" + dept.getDeptId() + "'";
			List<Employees> tempEmps = session[0].createQuery(query).getResultList();
			Department tempdept = session[1].get(Department.class, dept.getDeptId());
			tempdept.setNoOfEmpInDept(tempEmps.size());
//			System.out.println("\nNumber of employees in " + dept.getDeptName() + " = " + tempEmps.size());
		}

		System.out.println(
				"------------------------------------------------------------------------------------------\n");

	}

	// 3rd Function
	public void update(Session... session) {
		System.out.println("************************************************************");
		System.out.print("\nEnter the Employee Id : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("\nFetching the Employee Details...");
		Employees emp = session[0].get(Employees.class, id);

		System.out.println("\nEmployee Details");
		System.out.println("------------------------------");
		System.out.println("Employee Id : " + emp.getEmpId());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee Department Id : " + emp.getEmpDeptId());
		System.out.println("------------------------------");

		System.out.println(
				"\nChoose any 1 option\n------------------------------\n1). Update Name\n2). Update Department Id\n3). Exit");
		System.out.println("\nNOTE : If you want to update Department Id then it must be accurate.");
		System.out.print("\nEnter your choice : ");
		int choice = sc.nextInt();
		System.out.println("------------------------------");

		switch (choice) {
		case 1:
			System.out.print("\nEnter the new Name : ");
			emp.setEmpName(sc.next());
			System.out.println("Updated Succesfully!!!");
			break;
		case 2:
			System.out.print("\nEnter the new Department Id : ");
			emp.setEmpDeptId(sc.next());
			System.out.println("Updated Succesfully!!!");
			break;
		case 3:
			break;

		default:
			System.out.println("\nChoose only the mentioned option");
			break;
		}
		System.out.println("************************************************************");
		
		// Now calculating all the employees in each department
		List<Department> tempAllDept = session[1].createQuery("from Department").getResultList();
//				System.out.println("Now calculating all the employees in each department");
		for (Department dept : tempAllDept) {
			String query = "from Employees emp where emp.empDeptId = '" + dept.getDeptId() + "'";
			List<Employees> tempEmps = session[0].createQuery(query).getResultList();
			Department tempdept = session[1].get(Department.class, dept.getDeptId());
			tempdept.setNoOfEmpInDept(tempEmps.size());
//					System.out.println("\nNumber of employees in " + dept.getDeptName() + " = " + tempEmps.size());
		}
		System.out.println(
				"------------------------------------------------------------------------------------------\n");

	}

	// 4th Function
	public void delete(Session... session) {

		System.out.println("************************************************************");
		System.out.print("\nEnter the Employee Id : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("\nFetching the Employee Details...");
		Employees emp = session[0].get(Employees.class, id);

		System.out.println("\nEmployee Details");
		System.out.println("------------------------------");
		System.out.println("Employee Id : " + emp.getEmpId());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee Department Id : " + emp.getEmpDeptId());
		System.out.println("------------------------------");

		session[0].delete(emp);
		System.out.println("\nDeleted Successfully!!!");

		System.out.println("************************************************************");
		// Now calculating all the employees in each department
		List<Department> tempAllDept = session[1].createQuery("from Department").getResultList();
//		System.out.println("Now calculating all the employees in each department");
		for (Department dept : tempAllDept) {
			String query = "from Employees emp where emp.empDeptId = '" + dept.getDeptId() + "'";
			List<Employees> tempEmps = session[0].createQuery(query).getResultList();
			Department tempdept = session[1].get(Department.class, dept.getDeptId());
			tempdept.setNoOfEmpInDept(tempEmps.size());
//			System.out.println("\nNumber of employees in " + dept.getDeptName() + " = " + tempEmps.size());
		}
		System.out.println(
				"------------------------------------------------------------------------------------------\n");

	}

	// 5th Function
	public void readDept(Session... session) {
		// 1st calculating all the employees in each department
		List<Department> tempAllDept = session[1].createQuery("from Department").getResultList();
//		System.out.println("Now calculating all the employees in each department");
		for (Department dept : tempAllDept) {
			String query = "from Employees emp where emp.empDeptId = '" + dept.getDeptId() + "'";
			List<Employees> tempEmps = session[0].createQuery(query).getResultList();
			Department tempdept = session[1].get(Department.class, dept.getDeptId());
			tempdept.setNoOfEmpInDept(tempEmps.size());
//			System.out.println("\nNumber of employees in " + dept.getDeptName() + " = " + tempEmps.size());
		}

		// querying all the departments
		System.out.println("\n\nQuerying all the departments...");
		List<Department> allDept = session[1].createQuery("from Department").getResultList();
		// displaying all the departments
		System.out.println("\nDisplaying all the Departments");
		System.out.println("************************************************************");
		displayList2(allDept);
		if (allDept.isEmpty()) {
			System.out.println("No Data Found in the database! }:-(");
		}
		System.out.println("************************************************************");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");
	}

	// Method used to print the extracted data from the Employee Table
	private static void displayList(List<Employees> tempList) {
		for (Employees tempEmp : tempList) {
			System.out.println(tempEmp);
		}
	}

	// Method used to print the extracted data from the Department Table
	private static void displayList2(List<Department> tempList2) {
		for (Department tempDept : tempList2) {
			System.out.println(tempDept);
		}
	}

	public void startingConsoleApp(Session... session) {
		int i = 0;
		while (i != 6) {
			System.out.println("\n\t\tWelcome to the Employee & Department Console Application");
			System.out.println(
					"------------------------------------------------------------------------------------------");
			System.out.print(
					"1). Show All Employees\n2). Add a new Employee\n3). Update an Employee\n4). Delete an Employee\n5). Show all Departments with their Id's\n6). Exit");
			System.out.print("\nEnter your choice : ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------");

			switch (i) {
			case 1:
				this.read(session[0]);
				i = 6; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 2:
				this.create(session);
				i = 6; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 3:
				this.update(session);
				i = 6; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 4:
				this.delete(session);
				i = 6; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 5:
				this.readDept(session);
				i = 6; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;

			case 6:
				System.out.println("Thanks for using the application!... }:-)");
				System.exit(1);
				break;
			default:
				System.out.println("Choose only the mentioned option");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		App obj = new App();
		/*
		 * Configuration object is created to configure the cfg.xml file and add the
		 * annotated class to the object
		 */
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employees.class);
		// for Dept Table
		Configuration config2 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Department.class);

		// Create session factory
		SessionFactory sf = config.buildSessionFactory();
		// for Dept Table
		SessionFactory sf2 = config2.buildSessionFactory();

		// Create session
		Session session = sf.getCurrentSession();
		// for Dept Table
		Session session2 = sf2.getCurrentSession();

		try {
			// start transaction
			System.out.println("Transaction is started...");
			session.beginTransaction();
			// for Dept Table
			session2.beginTransaction();

			// Calling the Starting Console App Method
			obj.startingConsoleApp(session, session2);

			// commit the transaction
			System.out.println("Committing the Transaction...");
			session.getTransaction().commit();

			// for Dept Table
			session2.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			System.out.println("Closing the Session Factory...");
			sf.close();

			// for Dept Table
			sf2.close();
			System.out.println("Session Factory is Closed");
		}

		// Code for exiting the Application or Not
		System.out.print("\nDo you want to explore the Application more [Y/n] : ");
		String chk = sc.nextLine();
		if ((chk.equalsIgnoreCase("n") || !(chk.equalsIgnoreCase("y"))) && !chk.isEmpty()) {
			System.out.println("Thanks for using the application!... }:-)");
			System.exit(1);
		} else {
			// Here calling the main method becoz this method is responsible for calling all
			// other methods
			main(args);
		}
	}
}
