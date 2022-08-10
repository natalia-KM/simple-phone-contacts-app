package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactList a = new ContactList();
		
		try (Scanner inp = new Scanner(System.in)) {
			char opt;

			MenuOptions.menu();
			
			do {
			opt = inp.next().toLowerCase().charAt(0);
			
			switch(opt) {
			case 'a': a.showAll(); MenuOptions.menu(); break;
			case 'b': MenuOptions.addContact(a); MenuOptions.menu(); break;
			case 'c': MenuOptions.changeNum(a); MenuOptions.menu(); break;
			case 'd': MenuOptions.deleteNum(a); MenuOptions.menu(); break;
			case 'e': System.out.println("Exit");break;
			case 'f': MenuOptions.addRandomContacts(a); MenuOptions.menu(); break;
			default: System.out.println("Type one of the options: a, b, c, d, e or f"); MenuOptions.menu();break;
			}
			
			} while(opt!='e');
		} catch(Exception e) {
			System.out.println(e);
		}
		


	}

}
