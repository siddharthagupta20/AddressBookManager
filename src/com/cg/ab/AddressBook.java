package com.cg.ab;

import java.util.*;

public class AddressBook {
	private List<Contact> addressBook = new ArrayList<Contact>();

	public void setAddressBook(List<Contact> m) {
		this.addressBook = m;
	}

	public List<Contact> getAddressBook() {
		
		return this.addressBook;
	}

	public void addContact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println("Enter state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip: ");
		long zip = sc.nextLong();
		System.out.println("Enter phone number: ");
		sc.nextLine();
		String phoneNumber = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		Contact addedContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		addressBook.add(addedContact);
		sc.close();
	}

	public List<Contact> viewContacts() {
		return addressBook;
	}

	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		System.out.println("Welcome to Address Book");
		ab.addContact();
		ab.addContact();
		List<Contact> cl = new ArrayList<Contact>();
		cl = ab.viewContacts();
		System.out.println("The Contact in Address Book is: ");
		for (Contact z : cl) {
			System.out.println(z);
		}
	}
}
