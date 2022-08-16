package com.Bridgelabz;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		System.out.println("*******************************");
		ContactPeople people = new ContactPeople();
		people.contactDetails();
		people.show();

	}
}
