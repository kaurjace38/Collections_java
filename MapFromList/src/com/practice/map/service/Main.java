package com.practice.map.service;

import java.util.List;
import java.util.Map;

import com.practice.map.domin.Person;

public class Main {
	public static void main(String[] args) {
		List<Person> people = Person.generateList();
		System.out.println("\n List elements are:");
		Person.show(people);
		System.out.println("\n Map elements are:");
		Map<Float, Person> mapPeople = Person.transform(people);
		Person.show(mapPeople);
	}
}
