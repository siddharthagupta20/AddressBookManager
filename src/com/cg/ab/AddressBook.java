package com.cg.ab;

import java.util.*;

//already saving multiple contacts
public class AddressBook {
	private List<Contact> addressBook = new ArrayList<Contact>();
	public String bookname;

	public AddressBook(String name) {
		bookname = name;
	}

	public void setAddressBook(List<Contact> m) {
		this.addressBook = m;
	}

	public List<Contact> getAddressBook() {

		return this.addressBook;
	}

	public String updateContact(Contact a) {
		int y = -1;
		for (Contact x : addressBook) {
			y++;
			if (x.firstName.equalsIgnoreCase(a.firstName) && x.lastName.equalsIgnoreCase(a.lastName)) {
				addressBook.remove(y);
				addressBook.add(y, a);
			}
		}
		if (y == -1)
			return "No contact found with this name";
		else
			return "Contact Updated";
	}

	public boolean removeContact(String firstName, String lastName) {
		Contact a = new Contact("", "", "", "", "", 0, "", "");
		for (Contact x : addressBook) {
			if (x.firstName.equalsIgnoreCase(firstName) && x.lastName.equalsIgnoreCase(lastName)) {
				a = x;
			}
		}
		return addressBook.remove(a);
	}

	public void addContact() {
		Scanner sc = new Scanner(System.in);
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

	public String updateContact(Contact a) {
		int y = -1;
		for (Contact x : addressBook) {
			y++;
			if (x.firstName.equalsIgnoreCase(a.firstName) && x.lastName.equalsIgnoreCase(a.lastName)) {
				addressBook.remove(y);
				addressBook.set(y, a);
			}
		}
		if (y == -1)
			return "No contact found with this name";
		else
			return "Contact Updated";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		System.out.println("Welcome to Address Book");
		ab.addContact();
		System.out.println("�pdate Contact:\nEnter name and all details:");
		System.out.println("Enter first name: ");
		String firstName1 = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName1 = sc.nextLine();
		System.out.println("Enter address: ");
		String address1 = sc.nextLine();
		System.out.println("Enter city: ");
		String city1 = sc.nextLine();
		System.out.println("Enter state: ");
		String state1 = sc.nextLine();
		System.out.println("Enter zip: ");
		long zip1 = sc.nextLong();
		System.out.println("Enter phone number: ");
		sc.nextLine();
		String phoneNumber1 = sc.nextLine();
		System.out.println("Enter email: ");
		String email1 = sc.nextLine();

		Contact update = new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, email1);
		String s = ab.updateContact(update);
		System.out.println(s);

		List<Contact> cl = new ArrayList<Contact>();
		cl = ab.viewContacts();
		System.out.println("The Contact in Address Book is: ");
		for (Contact z : cl) {
			System.out.println(z);
		}
		sc.close();

	}
}
