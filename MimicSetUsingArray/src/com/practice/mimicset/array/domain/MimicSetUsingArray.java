package com.practice.mimicset.array.domain;

public class MimicSetUsingArray {
	private Object[] mimicSetArray;
	private int index;
	private int arraySize;

	public MimicSetUsingArray(int arraySize) {
		this.mimicSetArray = new Object[arraySize];
		this.index = 0;
		this.arraySize = arraySize;
	}

	public Object[] getMimicSetArray() {
		return mimicSetArray;
	}

	public int add(Object o) {
		if (o == null) {
			return -1;
		}
		if (index > 1) {
			for (int i = 0; i < index; i++) {
				if (mimicSetArray[i].equals(o)) {
					return -1;
				}
			}
		}

		if (this.index == this.arraySize) {
			arraySize++;
			Object[] newMimicSetArray = new Object[arraySize];
			for (int i = 0; i < index; i++) {
				newMimicSetArray[i] = mimicSetArray[i];
			}
			mimicSetArray = newMimicSetArray;
		}
		mimicSetArray[index++] = o;
		return (index - 1);
	}

	public void remove(Object o) {
		int elementIndex = -1;
		for (int i = 0; i < index; i++) {
			if (o.equals(mimicSetArray[i])) {
				elementIndex = i;
				for (int j = elementIndex; j < index; j++) {
					mimicSetArray[j] = mimicSetArray[j + 1];
				}
				mimicSetArray[index] = null;
				index--;
				break;
			}
		}
		
		if (elementIndex < 0) {
			System.out.println("element not found.");
		}

	}

	public void showAll() {
		for (Object value : mimicSetArray) {
			if (value != null) {
				System.out.println(value);
			}

		}
	}

}
