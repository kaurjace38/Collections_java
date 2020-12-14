package com.practice.sort.collection.service;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practice.sort.collection.domain.Employee;
import com.practice.sort.collection.domain.SortByFirstName;
import com.practice.sort.collection.domain.SortByLastName;

public class EmplyeeTest {
	private List<Employee> employees;

	@BeforeEach
	public void setup() {
		employees = EmployeeFixture.createEmployee();
	}

	@Test
	public void SortByFirstNameTest() {
		SortByFirstName sortByFirstName = new SortByFirstName();
		Collections.sort(employees, sortByFirstName);
		assertEquals(2, employees.get(0).getId());
		assertEquals("Abhay", employees.get(0).getFirstName());
		assertEquals("Desai", employees.get(0).getLastName());
		assertEquals(28, employees.get(0).getAge());
		assertEquals(4, employees.get(1).getId());
		assertEquals("Abhi", employees.get(1).getFirstName());
		assertEquals("Patel", employees.get(1).getLastName());
		assertEquals(39, employees.get(1).getAge());
	}

	@Test
	public  void SortByLastNameTest() {
		SortByLastName sortByLastName = new SortByLastName();
		Collections.sort(employees, sortByLastName);
		assertEquals(2, employees.get(0).getId());
		assertEquals("Abhay", employees.get(0).getFirstName());
		assertEquals("Desai", employees.get(0).getLastName());
		assertEquals(28, employees.get(0).getAge());
		assertEquals(7, employees.get(1).getId());
		assertEquals("Akash", employees.get(1).getFirstName());
		assertEquals("Jadav", employees.get(1).getLastName());
		assertEquals(28, employees.get(1).getAge());
	}
	
	@Test
	public  void SortByAgeTest() {
		Collections.sort(employees);
		assertEquals(3, employees.get(0).getId());
		assertEquals("Maitree", employees.get(0).getFirstName());
		assertEquals("Logan", employees.get(0).getLastName());
		assertEquals(25, employees.get(0).getAge());
		assertEquals(5, employees.get(1).getId());
		assertEquals("Ananya", employees.get(1).getFirstName());
		assertEquals("Pandith", employees.get(1).getLastName());
		assertEquals(25, employees.get(1).getAge());
	}
@Test
public void mainTest() {
	Main.main(null);
}
}
