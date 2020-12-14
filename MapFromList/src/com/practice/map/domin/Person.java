package com.practice.map.domin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Person {
	private int id;
	private String name;
	private float salary;
	private static List<Person> people = new ArrayList<Person>();

	public Person(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

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

	public static Map<Float, Person> transform(List<Person> people) {
		Map<Float, Person> map = new TreeMap<Float, Person>();
		for (Person person : people) {
			float mapKey = (float) person.getId();
			int count = 0;
			while ((map.containsKey(mapKey))) {
				count++;
				mapKey = mapKey + (float) Math.pow((1 / 10.0), count);
			}
				map.put(mapKey, person);
		}
		return map;
	}

	public static void show(List<Person> listPerson) {
		for (Person person : listPerson) {
			System.out.println(person.getId() + " " + person.getName() + " " + person.getSalary());
		}

	}

	public static void show(Map<Float, Person> mapPerson) {
		mapPerson.forEach((key, value) -> System.out
				.println(key + " ->" + value.getId() + " " + value.getName() + " " + value.getSalary()));
	}
}
