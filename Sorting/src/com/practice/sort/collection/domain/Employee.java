package com.practice.sort.collection.domain;

public class Employee implements Comparable {
	int id;
	String firstName;
	String lastName;
	int age;

	public Employee(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Object anotherEmployee) {
		if (!(anotherEmployee instanceof Employee))
			throw new ClassCastException();
		int anotherEmployeeAge = ((Employee) anotherEmployee).getAge();
		return this.age - anotherEmployeeAge;
	}

}
