package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	   static ArrayList<ContactPeople> personsList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program");
		  System.out.println("------------------");
		   AddressBookMain book = new AddressBookMain();
		       book.addContact();
		 book.editContact();
	}
	public void addContact(){

		System.out.println("Enter No of people You Want To Add in your Address Book");
		int numOfPersons = sc.nextInt();
		for (int i=0;i<numOfPersons;i++) {
			ContactPeople person1 = new ContactPeople();
				
			System.out.println("Enter  first name:");
			person1.setFirstName(sc.next());

			System.out.println("Enter last name:");
			person1.setLastName(sc.next());

			System.out.println("Enter Address:");
			person1.setAddress(sc.next());

			System.out.println("Enter  City name:");
			person1.setCity(sc.next());

			System.out.println("Enter state:");
			person1.setState(sc.next());

			System.out.println("Enter  zip code:");
			person1.setZipNo(sc.nextInt());

			System.out.println("Enter  phone number:");
			person1.setPhoneNo(sc.nextLong());
			System.out.println("---------------------");
			personsList.add(person1);
		}
			System.out.print(personsList);
			
	}
	
	public void editContact() {
		 System.out.println(" Enter the Name You Want to find");
		        String name = sc.next();
		for(int i = 0; i<personsList.size();i++)
		{
		if(personsList.get(i).getFirstName().equals(name)) {
			System.out.println("select options");
			System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number");		}
			int option = sc.nextInt();
			switch(option){
			   case 1:
				System.out.println("change FirstName");
				String editFirstName = sc.next();
				personsList.get(i).setFirstName(editFirstName);
				System.out.println(editFirstName);
				break;
			    case 2:
				System.out.print("Enter a Last name:");
				personsList.get(i).setLastName(sc.next());
				break;
			    case 3:
				System.out.print("Enter a Address:");
				personsList.get(i).setAddress(sc.next());
				break;
			     case 4:
				System.out.print("Enter a city:");
				personsList.get(i).setCity(sc.nextLine());
				break;
			     case 5:
				System.out.print("Enter a state:");
				personsList.get(i).setState(sc.nextLine());
				break;
			    case 6:
				System.out.print("Enter a zip code:");
				personsList.get(i).setZipNo(sc.nextInt());
				break;
			     case 7:
				    System.out.print("Enter a phone number:");
				   personsList.get(i).setPhoneNo(sc.nextLong());
				break;
			default:
				   System.out.println("enter valid contact");
			}
			               System.out.println("contacts are Edited");
			   System.out.println(personsList);
		
		}
	}
}
