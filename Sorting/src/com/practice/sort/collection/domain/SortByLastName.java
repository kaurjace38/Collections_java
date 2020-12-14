package com.practice.sort.collection.domain;

import java.util.Comparator;

public class SortByLastName implements Comparator<Object>{

	@Override
	public int compare(Object employee1, Object employee2) {
		if(!(employee1 instanceof Employee) || (!(employee2 instanceof Employee))) {
			throw new ClassCastException();
		}
		String firstName1 = ((Employee)employee1).getFirstName().toLowerCase();
		String firstName2 = ((Employee)employee2).getFirstName().toLowerCase();
		String lastName1 = ((Employee)employee1).getLastName().toLowerCase();
		String lastName2 = ((Employee)employee2).getLastName().toLowerCase();
		if(lastName1.equals(lastName2)) {
			return firstName1.compareTo(firstName2);
		}else {
			return lastName1.compareTo(lastName2);
		}
	}

}
