package com.phone;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setSid("n640943");
		person.setName("UB");
		person.setPhoneNumber("9986643211");
		
		List<Person> listOfPersons = new ArrayList<>();
		listOfPersons.add(person);

		person = new Person();
		person.setSid("n640999");
		person.setName("USB");
		person.setPhoneNumber("9987743211");
		
		listOfPersons.add(person);
		
		PhoneBook pb = new PhoneBook(listOfPersons);
//		pb.printPhoneBook();
		System.out.println(pb.LookupByName("UB"));
		
		person = new Person();
		person.setSid("n640987");
		person.setName("UBidkar");
		person.setPhoneNumber("9987993212");
		
		pb.AddPerson(person);
		
		System.out.println(pb.LookupByPhoneNumber("9987993212"));
		
	}

}
