package com.practice.insert.collection.service;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.practice.insert.collection.domain.Insert;

public class Main {
	public static void main(String[] args) {
		Insert insert = new Insert();
		List<Object> list = insert.getList();
		Scanner scanner = new Scanner(System.in);
		boolean flag1 = true;
		boolean flag2 = true;
		int location = 0;
		System.out.println("Elements in the lsit are :");
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------");
		while (flag1) {
			while (flag2) {
				System.out.println("Please enter the location to insert the element:(1-5 only)");

				try {
					location = scanner.nextInt();
					if (location > 0 && location <= 5) {
						flag2 = false;
					} else {
						System.out.println("Only values between 1-5 are allowed, please try again.");
					}
				} catch (InputMismatchException e) {
					flag2 = false;
					System.out.println("Only integer numbers(1-5) are allowed.");
				}

			}
			flag2 = true;
			System.out.println("Please enter the element");
			if (scanner.hasNextBoolean()) {
				boolean booleanValue = scanner.nextBoolean();
				list.add((location - 1), insert.reverseValue(booleanValue));
			} else if (scanner.hasNextInt()) {
				int intValue = scanner.nextInt();
				list.add((location - 1), insert.addOne(intValue));
			} else if (scanner.hasNextFloat()) {
				float floatValue = scanner.nextFloat();
				list.add((location - 1), insert.addTwo(floatValue));
			} else if (scanner.hasNextDouble()) {
				double doubleValue = scanner.nextDouble();
				list.add((location - 1), insert.addTwo(doubleValue));
			} else if (scanner.hasNext()) {
				String string = scanner.next();
				StringBuffer stringBuffer = new StringBuffer(string);
				if (string.length() > 1) {
					list.add((location - 1), insert.changeStringCase(stringBuffer));
				} else {
					if (string.equals("#")) {
						flag1 = false;
					} else {
						Character character = string.charAt(0);
						list.add((location - 1), insert.nextCharacter(character));
					}

				}
			}
			System.out.println("\n New list elements are: ");
			Iterator<Object> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println();
		}
		scanner.close();
	}
}
