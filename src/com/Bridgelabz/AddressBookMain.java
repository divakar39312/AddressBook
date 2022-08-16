package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	static ArrayList<ContactPeople> personsList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		AddressBookMain book = new AddressBookMain();
		book.addContact();
		
	}
	public void addContact(){

		System.out.println("Plase Enter Number of Persons Want To Add in Address Book");
		int numOfPersons = sc.nextInt();
		for (int i=0;i<numOfPersons;i++) {
			ContactPeople person1 = new ContactPeople();
				
			System.out.println("Enter first name:");
			person1.setFirstName(sc.next());

			System.out.println("Enter last name:");
			person1.setLastName(sc.next());

			System.out.println("Enter Address:");
			person1.setAddress(sc.next());

			System.out.println("Enter City name:");
			person1.setCity(sc.next());

			System.out.println("Enter state name:");
			person1.setState(sc.next());

			System.out.println("Enter zip code:");
			person1.setZipNo(sc.nextInt());

			System.out.println("Enter a phone number:");
			person1.setPhoneNo(sc.nextLong());
			personsList.add(person1);
		}
			System.out.print(personsList);
			
	}
}
