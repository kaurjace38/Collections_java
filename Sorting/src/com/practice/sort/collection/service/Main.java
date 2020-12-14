package com.practice.sort.collection.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.practice.sort.collection.domain.Employee;
import com.practice.sort.collection.domain.SortByFirstName;
import com.practice.sort.collection.domain.SortByLastName;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee employee;
		employees.add(new Employee(1, "Nayana", "Rao", 30));
		employees.add(new Employee(2, "Abhay", "Desai", 28));
		employees.add(new Employee(3, "Maitree", "Logan", 25));
		employees.add(new Employee(4, "Abhi", "Patel", 39));
		employees.add(new Employee(5, "Ananya", "Pandith", 25));
		employees.add(new Employee(5, "Ananya", "Pande", 25));
		employees.add(new Employee(6, "Ananya", "Patel", 30));
		employees.add(new Employee(7, "Akash", "Jadav", 28));

		System.out.println("Employee list before sorting");
		ListIterator<Employee> iterator = employees.listIterator();
		while (iterator.hasNext()) {
			employee = iterator.next();
			System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " "
					+ employee.getAge());
		}

		System.out.println("\n Sorting the employees based on their FirstName");
		Collections.sort(employees, new SortByFirstName());
		ListIterator<Employee> sortedByFirstNameIterator = employees.listIterator();
		while (sortedByFirstNameIterator.hasNext()) {
			employee = sortedByFirstNameIterator.next();
			System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " "
					+ employee.getAge());
		}
		
		System.out.println("\n Sorting the employees based on their LastName");
		Collections.sort(employees, new SortByLastName());
		ListIterator<Employee> sortedByLastNameIterator = employees.listIterator();
		while (sortedByLastNameIterator.hasNext()) {
			employee = sortedByLastNameIterator.next();
			System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " "
					+ employee.getAge());
		}
		
		System.out.println("\n Sorting the employees based on their age");
		Collections.sort(employees);
		ListIterator<Employee> sortedIterator = employees.listIterator();
		while (sortedIterator.hasNext()) {
			employee = sortedIterator.next();
			System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " "
					+ employee.getAge());
		}
	}
}
