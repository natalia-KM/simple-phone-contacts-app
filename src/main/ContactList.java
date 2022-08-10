package main;

import java.util.Map;
import java.util.TreeMap;

public class ContactList {
	
	TreeMap<String, String> contactsList = new TreeMap<>();
	
	public void addNewContact(String name, String phoneNo) {
		contactsList.put(name, phoneNo); 
	}
	
	public void showAll() {
		if (contactsList.size()>0) {
			System.out.println("Name           Number");
			System.out.println("--------------------");
		for(Map.Entry<String, String> entry : contactsList.entrySet()) {
			int len = 15 - entry.getKey().length();
			String a = " ";
			
			System.out.println(entry.getKey() + a.repeat(len) + entry.getValue());
		}
		} else {
			System.out.println("There is no contacts in the registry.");
		}
	}
	
	public void updateNumber(String name, String number) {
		if(contactsList.get(name) == null) {
			System.out.println("Contact '" + name + "' does not exist.");
		} else {
		String phoneNumber = Checker.checkPhoneNo(number);
		if(phoneNumber == "inc") {
			System.out.println("Incorrect phone number.");
		} else {
			contactsList.replace(name, phoneNumber);
			System.out.println("Contact updated");
			System.out.println(name + ": " + contactsList.get(name));
		}
		
		}
	}
	
	public void deleteContact(String name) {
		if(contactsList.get(name) == null) {
			System.out.println("Contact '" + name + "' does not exist.");
		} else {
		contactsList.remove(name);
		System.out.println("Contact " + name + " removed.");
		}
	}
	
	public boolean isNameUnique(String name) {
		String a = contactsList.get(name);
		if(a==null) {
			return true;
		} else {
			return false;
		}
		
	}

}
