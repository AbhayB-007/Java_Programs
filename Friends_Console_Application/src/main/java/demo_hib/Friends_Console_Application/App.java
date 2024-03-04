package demo_hib.Friends_Console_Application;

import java.util.Scanner;
import java.util.List;
//import demo_hib.Friends_Console_Application.Friends;

/* Packages imported so that we can establish connection between Hibernate and MySql(Database)*/
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class App {

	// 1st Function
	public void getAllFriends(Session session) {
		// querying all the friends
		System.out.println("Querying all the friends...");
		List<Friends> allFriends = session.createQuery("from Friends frnd order by frnd.firstName asc").getResultList();

		// displaying the friends with phone numbers
		System.out.println("\nDisplaying all the friends");
		System.out.println("************************************************************");
		displayList(allFriends);
		if (allFriends.isEmpty()) {
			System.out.println("No Data Found in the database! }:-(");
		}
		System.out.println("************************************************************");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");
	}

	// 2nd Function
	public void subString1(Session session) {
		// querying the friend details acc. to substring matches with 1st Name
		System.out.print("Enter the substring : ");
		Scanner sc = new Scanner(System.in);
		String subString = sc.nextLine();
		String query = "from Friends frnd where frnd.firstName LIKE '" + subString + "%'";
		System.out.println("Querying friend details acc. to substring matches with 1st Name...");
		List<Friends> get1stName = session.createQuery(query).list();

		// displaying the friend details acc. to substring matches with 1st Name
		System.out.println("\nDisplaying the friends details acc. to substring matches with 1st Name");
		System.out.println("************************************************************");
		displayList(get1stName);
		if (get1stName.isEmpty()) {
			System.out.println("No Data Found regarding the entered sub-string! }:-(");
		}
		System.out.println("************************************************************");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");
	}

	// 3rd Function
	public void subString2(Session session) {
		// querying the friends details acc. to given substring that matches with full
		// name
		System.out.print("Enter the substring : ");
		Scanner sc = new Scanner(System.in);
		String subString = sc.nextLine();
//		String query = "from Friends frnd where (frnd.firstName LIKE '" + subString + "%') OR (frnd.lastName LIKE '"
//				+ subString + "%')";
		String query = "from Friends frnd where concat(frnd.firstName, ' ',frnd.lastName) LIKE '%" + subString + "'";
		System.out.println("Querying friends details acc. to given substring that matches with full name...");
		List<Friends> getName = session.createQuery(query).list();

		// displaying the friend details acc. to given substring that matches with full
		// name
		System.out.println("\nDisplaying the friends details acc. to given substring that matches with full name");
		System.out.println("************************************************************");
		displayList(getName);
		if (getName.isEmpty()) {
			System.out.println("No Data Found regarding the entered sub-string! }:-(");
		}
		System.out.println("************************************************************");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");
	}

	// 4th Function
	public void getallCommonFrnds(Session session) {
		// querying the friends details acc. to the given full name
		System.out.print("Enter the Full Name : ");
		Scanner sc = new Scanner(System.in);
		String fn = sc.nextLine();
		String query = "from Friends frnd where frnd.commonFrnd='" + fn + "'";
		System.out.println("Querying friends details acc. to the given full name...");
		List<Friends> getFrndName = session.createQuery(query).list();

		// displaying the friend details acc. to the given full name
		System.out.println("\nDisplaying the friends details acc. to the given full name");
		System.out.println("************************************************************");
		displayList(getFrndName);
		if (getFrndName.isEmpty()) {
			System.out.println(
					"No Data Found regarding the given Full Name! }:-( | (Note: Maybe the name is incomplete or entered the incorrect name)");
		}
		System.out.println("************************************************************");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");
	}

	// Method used to print the extracted data from the database
	private static void displayList(List<Friends> tempList) {
		for (Friends tempFrnd : tempList) {
			System.out.println(tempFrnd);
		}
	}

	public void startingConsoleApp(Session session) {
		int i = 0;
		while (i != 5) {
			System.out.println("\n\t\t\tWelcome to the Friends Console Application");
			System.out.println(
					"------------------------------------------------------------------------------------------");
			System.out.print(
					"1). Get all friends with their Phone Numbers\n2). Find friend whoose 1st name starts with given sub-string\n3). Find friend whoose name starts with given sub-string\n4). Get all friends corresponds to the full-name you entered\n5). Exit");
			System.out.print("\nEnter your choice : ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();			
			System.out.println(
					"------------------------------------------------------------------------------------------");

			switch (i) {
			case 1:
				this.getAllFriends(session);
				i = 5; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 2:
				this.subString1(session);
				i = 5; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 3:
				this.subString2(session);
				i = 5; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 4:
				this.getallCommonFrnds(session);
				i = 5; /*
						 * Value of i is updated to break the while after the desired method is executed
						 */
				break;
			case 5:
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
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Friends.class);

		// Create session factory
		SessionFactory sf = config.buildSessionFactory();

		// Create session
		Session session = sf.getCurrentSession();

		try {
			// start transaction
			System.out.println("Transaction is started...");
			session.beginTransaction();

			// Calling the Starting Console App Method
			obj.startingConsoleApp(session);

			// commit the transaction
			System.out.println("Committing the Transaction...");
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			System.out.println("Closing the Session Factory...");
			sf.close();
			System.out.println("Session Factory is Closed");
		}

		// Code for exiting the Application or Not
		System.out.print("\nDo you want explore the Application more [Y/n] : ");
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
