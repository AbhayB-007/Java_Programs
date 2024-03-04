package demo_hib.hibernate_project;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App_Query_Objects {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

		// Create session factory
		SessionFactory sf = config.buildSessionFactory();

		// Create session
		Session s = sf.getCurrentSession();

		try {
			// start transaction
			System.out.println("Transaction is started...");
			s.beginTransaction();

			// Query all the Students
			// list() is used in older versions before Hibernate 5.2 and in after version we
			// use getResultList()
			List<Student> theStudents = s.createQuery("from Student").getResultList();

			// display the students
			System.out.println("\nDisplaying all the Students");
//			displayStudents(theStudents);
			for (Student tempstudent : theStudents) {
				System.out.println(tempstudent);
			}

			// Query a particular Student
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter the name of the student for w/c u want details : ");
			String name = sc.nextLine();
			String query = "from Student s where s.name = '" + name + "'";
			theStudents = s.createQuery(query).list();

			// Display the student
			System.out.println("\n\nDetails of Student have name " + name);
			displayStudents(theStudents);

			// commit the transaction
			s.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			sf.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempstudent : theStudents) {
			System.out.println(tempstudent);
		}
	}

}
