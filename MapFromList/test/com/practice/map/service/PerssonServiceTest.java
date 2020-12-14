package com.practice.map.service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import com.practice.map.domin.Person;

public class PerssonServiceTest {
	private List<Person> people;

	@Test
	public void generateListTest() {
		people = Person.generateList();
		assertEquals(9, people.size());
		assertEquals(1, people.get(0).getId());
		assertEquals("Anita", people.get(0).getName());
		assertEquals(50000.0f, people.get(0).getSalary(), 0.0f);
	}

	@Test
	public void transformTest() {
		people = PersonListFixture.generateList();
		Map<Float, Person> mapPeople = Person.transform(people);
		assertEquals(9, mapPeople.size());
		assertEquals(1.0f, mapPeople.get(1.0f).getId(), 0.0f);
		assertEquals("Anita", mapPeople.get(1.0f).getName());
		assertEquals(50000.0f, mapPeople.get(1.0f).getSalary(), 0.0f);
	}

	
}
