package com.practice.map.service;

import java.util.ArrayList;
import java.util.List;

import com.practice.map.domin.Person;

public class PersonListFixture {
	private static List<Person> people = new ArrayList<Person>();

	public static List<Person> generateList() {
		people.add(new Person(1, "Anita", 50000));
		people.add(new Person(2, "Akash", 60000));
		people.add(new Person(3, "Rahul", 30000));
		people.add(new Person(4, "Micah", 80000));
		people.add(new Person(4, "Anagha", 70000));
		people.add(new Person(4, "Krish", 40000));
		people.add(new Person(4, "Vasanth", 50000));
		people.add(new Person(4, "Ravi", 50000));
		people.add(new Person(2, "Akash", 60000));
		return people;
	}
}
