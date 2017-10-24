package com.phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	List<Person>people = new ArrayList<>();
	
//	Yes, addAll adds all the references of the source List to the target List. It doesn't create copies of the instances 
//	these references refer to. This is sufficient when the List holds references to immutable objects. If you add or remove
//	elements from one of the Lists after the addAll operation, the changes won't be reflected in the other List. If the List 
//	holds references to mutable objects, and you are modifying the state of those objects, you must create copies 
//	(either using clone or a copy constructor) if you don't want changes in one List to be reflected in the other List.
	
//	ConcurrentHashMap is designed to optimize retrieval operations; in fact, successful get() operations usually succeed 
//	with no locking at all. Achieving thread-safety without locking is tricky and requires a deep understanding of the details 
//	of the Java Memory Model. 
	
	public PhoneBook(List<Person> people) {
		for (Person person : people) {
			this.people.add(person);
		}
	}
	public AbstractPerson LookupByName(String name) {
		for (Person person : people) {
			if(person.name.equalsIgnoreCase(name)) {
				return person;
			}
		}
		return new NullPerson();
		
	}
	public AbstractPerson LookupByPhoneNumber(String phoneNumber) {
		for (Person person : people) {
			if(person.phoneNumber.equalsIgnoreCase(phoneNumber))
				return person;
		}
		return new NullPerson();
		
	}
	public synchronized void AddPerson(Person person) {
		this.people.add(person);
	}
	public void printPhoneBook(){
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}
}
