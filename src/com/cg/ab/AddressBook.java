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
		//sc.close();
	}

	public List<Contact> viewContacts() {
		return addressBook;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		List<AddressBook> book = new ArrayList<AddressBook>();
		System.out.println("How many address books do you want to make: ");
		int n = sc1.nextInt();
		sc1.nextLine();
		for (int i = 0; i < n; i++) {

			System.out.println("Enter name of address book for book no " + (i + 1) + " :");
			String aname = sc1.nextLine();
			AddressBook ab = new AddressBook(aname);

			book.add(ab);
		}
		System.out.println("Accessing Address Book:");
		boolean access = true;
		while (access) {
			System.out.println("Do you want to access any address book(Y/N):");
			char c = sc1.next().charAt(0);
			sc1.nextLine();
			if (c == 'y' || c == 'Y') {
				System.out.println("Enter Address Book:");
				String aname = sc1.nextLine();
				int counterAddressBook = -1;
				for (AddressBook a : book) {
					if (aname.equalsIgnoreCase(a.bookname)) {
						counterAddressBook++;
						AddressBook ab = a;

						System.out.println("Welcome to Address Book");
						
						boolean computation = true;
						
						while (computation) {
							System.out.println(
									"Menu \n1.Add a contact \n2.Edit a Contact \n3.Remove a contact \n4.View all contact \n5.Exit");
							int option = sc1.nextInt();
							switch (option) {
							case 1:
								ab.addContact();
								break;
							case 2:
								System.out.println("Update Contact:\nEnter name and all details:");
								System.out.println("Enter first name: ");
								sc1.nextLine();
								String firstName1 = sc1.nextLine();
								System.out.println("Enter last name: ");
								String lastName1 = sc1.nextLine();
								System.out.println("Enter address: ");
								String address1 = sc1.nextLine();
								System.out.println("Enter city: ");
								String city1 = sc1.nextLine();
								System.out.println("Enter state: ");
								String state1 = sc1.nextLine();
								System.out.println("Enter zip: ");
								long zip1 = sc1.nextLong();
								System.out.println("Enter phone number: ");
								sc1.nextLine();
								String phoneNumber1 = sc1.nextLine();
								System.out.println("Enter email: ");
								String email1 = sc1.nextLine();

								Contact update = new Contact(firstName1, lastName1, address1, city1, state1, zip1,
										phoneNumber1, email1);
								String s = ab.updateContact(update);
								System.out.println(s);
								break;
							case 3:
								System.out.println("Enter first name of contact to remove: ");
								sc1.nextLine();
								String fname = sc1.nextLine();
								System.out.println("Enter last name of contact to remove: ");
								String lname = sc1.nextLine();
								boolean b = ab.removeContact(fname, lname);
								if (b)
									System.out.println("Contact removed");
								else
									System.out.println("Contact not found");
								break;
							case 4:
								List<Contact> cl = new ArrayList<Contact>();
								cl = ab.viewContacts();
								System.out.println("The Contact in Address Book is: ");
								for (Contact z : cl) {
									System.out.println(z);
								}
								break;

							case 5:
								computation = false;
								System.out.println("Thank You :)");
								break;

							}

						}

					}
				}
				if (counterAddressBook == -1) {
					System.out.println("No AddressBook Found.");
				}

			} else {
				access = false;
				System.out.println("Thank You :)");
				break;
			}
		}

		sc1.close();
	}
}
