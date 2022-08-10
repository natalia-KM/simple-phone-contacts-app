package main;

import java.util.Scanner;

public class MenuOptions {


	public static void menu() {
		System.out.println("---------------------------");
		System.out.println("What would you like to do?");
		System.out.println("Type: ");
		System.out.println("a) Show all contacts");
		System.out.println("b) Add new contact");
		System.out.println("c) Update the number");
		System.out.println("d) Delete contact");
		System.out.println("e) Exit");
		System.out.println("f) Add some random contacts");
		System.out.println("---------------------------");
	}
	
	public static void addContact(ContactList a) {

		Scanner input = new Scanner(System.in);
			System.out.println("What's the name? ");
			String name = input.nextLine();
			System.out.println("What's the number? ");
			String number = input.nextLine();
			
			System.out.println();
			
			String check = Checker.generalCheck(a, name, number);
			if(check!="inc") {
				a.addNewContact(name, check);
				System.out.println("Contact added successfully.");
			}
	
	}
	
	public static void changeNum(ContactList a) {
		Scanner input = new Scanner(System.in);
			System.out.println("What's the name? ");
			String name = input.nextLine();
			System.out.println("What's the new number? ");
			String number = input.nextLine();
			
			System.out.println();
			
			a.updateNumber(name, number);

	}
	
	public static void deleteNum(ContactList a) {
		Scanner input = new Scanner(System.in);
			System.out.println("What's the name? ");
			String name = input.nextLine();
			
			System.out.println();
			
			a.deleteContact(name);
	
	}
	
	public static void addRandomContacts(ContactList a) {
		a.addNewContact("Bob", "+447576543345");
		a.addNewContact("Mark", "+447536543345");
		a.addNewContact("Stacy", "+441446543342");
		a.addNewContact("Bella", "+447276543343");
		
		System.out.println("Contacts added successfully.");
		System.out.println("Enter 'a' to check the result.");
	}
	
}
