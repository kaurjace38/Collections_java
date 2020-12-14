package com.practice.insert.collection.domain;

import java.util.LinkedList;
import java.util.List;

public class Insert {
	private List<Object> list = new LinkedList<>();;

	public Insert() {
		list.add("One");
		list.add(2);
		list.add("Three");
		list.add(67.986);
		list.add('Z');
		list.add("ABC");
		list.add(123);
		list.add(true);
		list.add("xyz");
	}

	public List<Object> getList() {
		return list;
	}

	public boolean reverseValue(boolean booleanValue) {
		return !booleanValue;
	}

	public char nextCharacter(char charValue) {
		return (char) (charValue + 1);
	}

	public StringBuffer changeStringCase(StringBuffer stringValue) {
		for (int i = 0; i < stringValue.length(); i++) {
			char characterAti = stringValue.charAt(i);
			if (Character.isUpperCase(characterAti)) {
				stringValue.replace(i, i + 1, Character.toLowerCase(characterAti) + "");
			} else {
				stringValue.replace(i, i + 1, Character.toUpperCase(characterAti) + "");
			}
		}
		return stringValue;
	}

	

	public double addTwo(double value) {
		return value + 2;
	}

	public int addOne(int value) {
		return value + 1;
	}
}
