package com.testing_zoo.TestingZoo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AnimalTest {
	
	@Test
	void hasName() {
		// Add an Animal Class which holds just the name of the animal. The name is required

		// given  <- base
        String name = "Tiger";
		String name_2 = "Bear";

		// when  <- input
		// I create a new instance
		Animal tiger = new Animal(name);
		Animal bear = new Animal(name_2);

		// then  <- Expected behavior/result
		// It should have the name
		assertEquals(name, tiger.getName());
		assertEquals(name_2, bear.getName());
	}
	
	void animalWithoutName_throwException() {
		assertThrows(IllegalArgumentException.class, () -> new Animal(""));
	}

}
