package com.testing_zoo.TestingZoo;

public class Animal {
	
	private String name;

	public Animal(String name) {
		if(name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be black!");
		}
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

}
