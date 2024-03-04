package com.company;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;

public class Main {

	// 1st Function
	public static void listAllItems() {

		try {
			File myFile = new File("ItemsList.txt");
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			Scanner myReader = new Scanner(myFile);
			// Checks file has at least 1 item or not.
			if (myReader.hasNextLine()) {
				int i = 0;
				while (myReader.hasNextLine()) {
					String tempLine = myReader.nextLine();
					// Neglects the '\n'(newline character)
					if (!tempLine.equals("\n") && !tempLine.equals("")) {
						String[] tempArr = tempLine.split(",|:");
						System.out.println(" " + ++i + ")." + "\tItem Name : " + tempArr[1].trim());
						System.out.println("\tItem Quantity : " + tempArr[3].trim());
						System.out.println("\tItem Entry Date[yyyy-mm-dd] : " + tempArr[5].trim());
						System.out.println("-----------------------------------------------------------------");
					}
				}
				System.out.println("\tTotal Items in the Store : " + i);
			} else {
				System.out.println("\nNo Data Found!\nPlease add some Items in the File");
			}
			myReader.close();

		} catch (IOException e) {
			System.out.println("\nUnable to enter data in file..! }:-(");
			e.printStackTrace();
		}
	}

	// 2nd Function
	public static void addNewItems() {
		Scanner sc = new Scanner(System.in);
		try {
			File myFile = new File("ItemsList.txt");
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			FileWriter myWriter = new FileWriter("ItemsList.txt", true);
			LocalDate date = LocalDate.now();

			// Initializing the Item Properties
			System.out.print("\nEnter the Name of the item: ");
			String itemName = sc.nextLine();
			
			// Checking item already exists in the list or not
			Scanner fileReader = new Scanner(myFile);
			if (fileReader.hasNextLine()) {
				String var;
				while (fileReader.hasNextLine()) {
					String tempLine = fileReader.nextLine();
					// Neglects the '\n'(newline character)
					if (!tempLine.equals("\n") && !tempLine.equals("")) {
						String[] tempArr = tempLine.split(",|:");						
						var = tempArr[1].trim();
						var = var.replace("\s", "");						
						if(var.equalsIgnoreCase(itemName)) {
							System.out.println("\nItem already Exists!!...\n\nTry Again...");
							System.out.println("-----------------------------------------------------------------");												
							String[] args = {};
							main(args);
							System.exit(1);
						}
					}
				}
				fileReader.close();
			}
			
			
			System.out.print("Enter the Quantity of the item: ");
			String itemQuantity = sc.nextLine();
			String itemEntryDate = date.toString();
			
			// writing into the file
			myWriter.append("\n");
			myWriter.append("Item Name: " + itemName + ", ");
			myWriter.append("Item Quantity: " + itemQuantity + ", ");
			myWriter.append("Item Entry Date(yyyy-mm-dd): " + itemEntryDate);
			myWriter.append("\n");
			myWriter.close();
			System.out.println("\n>>> Item added successfully!!! }:-)");

		} catch (IOException e) {
			System.out.println("\nUnable to create this file..! }:-(");
			e.printStackTrace();
		}
	}

	// 3rd Function
	public static void removeExistingItem() {
		try {
			File myFile = new File("ItemsList.txt");
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			Scanner myReader = new Scanner(myFile);
			Scanner sc = new Scanner(System.in);
			StringBuffer buffer = new StringBuffer();
			boolean chk = false;

			if (myReader.hasNextLine()) {
				System.out.print("\nEnter the Item you want to delete from record: ");
				String delItemName = sc.nextLine();
				String var;
				while (myReader.hasNextLine()) {
					String tempLine = myReader.nextLine();
					// Neglects the '\n'(newline character)
					if (!tempLine.equals("\n") && !tempLine.equals("")) {
						String[] tempArr = tempLine.split(",|:");
						var = tempArr[1].trim();
						var = var.replace("\s", "");
						if (!var.equalsIgnoreCase(delItemName)) {
							buffer.append("\n" + tempLine + System.lineSeparator());
						} else {
							chk = true;
						}
					}
				}
				// 'chk' is used to check weather the item is exists in the record or not.
				if (chk) {
					String fileContents = buffer.toString();
					FileWriter myWriter = new FileWriter("ItemsList.txt");
					myWriter.append(fileContents);
					System.out.println("Item removed..!! }:-)");
					myWriter.close();
				} else {
					System.out.println("\nItem doesn't exists in the records..!! }:-[");
				}
				myReader.close();
			} else {
				System.out.println("\nNo Data Found!\nPlease add some Items in the File");
			}
		} catch (IOException e) {
			System.out.println("\nUnable to create this file..! }:-(");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// write your code here
		Scanner scan = new Scanner(System.in);		
		int choice = 0;
		while (choice != 4) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\t\tWelcome to the Super Market Application");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\tApp Menu");
			System.out.println("<|*******************|>");
			System.out.print(
					"1). List All Items\n2). Add New Item\n3). Remove Existing Item\n4). Exit\nPlease Enter Your Choice: ");
			choice = scan.nextInt();
			System.out.println("-----------------------------------------------------------------");
			String str;
			switch (choice) {
			case 1:
				str = "Items List";
				System.out.printf("%40s\n", str);
				listAllItems();
				System.out.println("\nPress Enter to Continue...");
				scan.nextLine();
				scan.nextLine();
				break;
			case 2:
				str = "Enter Item Details";
				System.out.printf("%40s\n", str);
				addNewItems();
				System.out.println("\nPress Enter to Continue...");
				scan.nextLine();
				scan.nextLine();
				break;
			case 3:
				str = "Deleting an Item from List";
				System.out.printf("%40s\n", str);
				removeExistingItem();
				System.out.println("\nPress Enter to Continue...");
				scan.nextLine();
				scan.nextLine();
				break;
			case 4:
				System.out.println("Thanks for using our Application!!!");
				break;
			default:
				System.out.println("");
				break;
			}
		}
		scan.close();
	}
}
