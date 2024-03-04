package demo_hib.hibernate_project;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App_Read_Student_ {
	public static void main(String[] args) {

		/*
		 * Configuration object is created to configure the cfg.xml file and add the
		 * annotated class to the object
		 */
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

		// Create session factory
		SessionFactory sf = config.buildSessionFactory();

		// Create session
		Session s = sf.getCurrentSession();

		try {

			// Student object is created
			System.out.println("Creating the student object...");
			Student s1 = new Student("Arya", "arya@gmail.com", 666597238l);

			// start transaction
			System.out.println("Transaction is started...");
			s.beginTransaction();

			// save the student
			System.out.println("Saving the student...");
			s.save(s1);
			
			// commit the transaction
			s.getTransaction().commit();

			
			// My New Code
			// find out the student's id: primary key
			System.out.println("Saved student. Generated id: " + s1.getId());

			// now get a new session and start transaction
			s = sf.getCurrentSession();
			s.beginTransaction();

			// Getting student using the same object
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + s1.getId());
			Student myStudent = s.get(Student.class, s1.getId());
			System.out.println("Get Completed : " + myStudent);
			// Here object implicitly calls the toString method but it executes
			// the Overridden method not the method defined in Object Class
			// commit the transaction
			s.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			sf.close();
		}
	}
}
