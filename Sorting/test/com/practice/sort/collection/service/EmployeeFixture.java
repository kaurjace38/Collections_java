package com.practice.sort.collection.service;

import java.util.ArrayList;
import java.util.List;

import com.practice.sort.collection.domain.Employee;

public class EmployeeFixture {
	public static List<Employee> createEmployee() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Nayana", "Rao", 30));
		employees.add(new Employee(2, "Jaspreet", "kaur", 28));
		employees.add(new Employee(3, "Rasneet", "kaur", 25));
		employees.add(new Employee(4, "Abhi", "Patel", 39));
		employees.add(new Employee(5, "Ananya", "Pandith", 25));
		employees.add(new Employee(5, "Ananya", "Pande", 25));
		employees.add(new Employee(6, "Ananya", "Patel", 30));
		employees.add(new Employee(7, "Akash", "Jadav", 28));
		return employees;
	}
}
