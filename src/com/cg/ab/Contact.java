package com.cg.ab;

public class Contact {
	 String firstName;
	 String lastName;
	 String address;
	 String city;
	 String state;
	 long zip;
	 String phoneNumber;
	 String email;

	public Contact(String firstname, String lastname, String address, String city, String state, long zip, String phoneNumber, String email) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	@Override
	public String toString() {
		return "First Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip: "+zip+"\nPhone Number: "+phoneNumber+"\nEmail: "+email;
	}

	}