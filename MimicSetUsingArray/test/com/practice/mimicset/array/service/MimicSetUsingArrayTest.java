package com.practice.mimicset.array.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practice.mimicset.array.domain.MimicSetUsingArray;

public class MimicSetUsingArrayTest {
private MimicSetUsingArray array;
	@BeforeEach
	public void setup() {
		array = new MimicSetUsingArray(5);
	}
	@Test
	public void addStringTest() {
		assertEquals(0,array.add("Hello"));
		
	}
	@Test
	public void addCharacterTest() {
		assertEquals(0,array.add("J"));
	}
	@Test
	public void addNumberTest() {
		assertEquals(0,array.add(-2));
	}
	@Test
	public void addBooleanTest() {
		assertEquals(0,array.add(true));
	}
	@Test
	public void addDuplicateTest() {
		assertEquals(0,array.add("Hello"));
		assertEquals(1,array.add("World"));
		assertEquals(-1,array.add("World"));
		
	}
	@Test
	public void removeTest() {
		assertEquals(0,array.add("Hello"));
		assertEquals(1,array.add("World"));
		array.remove("Hello");
		assertEquals(1,array.add("Hello"));
		
	}
	@Test
	public void removeNonExistingObjectTest() {
		assertEquals(0,array.add("Hello"));
		assertEquals(1,array.add("World"));
		array.remove("Test");
		assertEquals(2,array.add(5));
		
	}
	@Test
	public void mainTest() {
		Main.main(null);
	}
}
