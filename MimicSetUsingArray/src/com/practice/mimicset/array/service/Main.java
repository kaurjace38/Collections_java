package com.practice.mimicset.array.service;

import com.practice.mimicset.array.domain.MimicSetUsingArray;

public class Main {
	public static void main(String[] args) {
		MimicSetUsingArray array = new MimicSetUsingArray(5);
		array.add("Hello");
		array.add(1);
		array.add(true);
		array.add('a');
		array.add('a');
		System.out.println("\n Array elements are:");
		array.showAll();
		System.out.println("\n Deleted the element: true");
		array.remove(true);
		System.out.println("\n New array elements are:");
		array.showAll();
	}
}
