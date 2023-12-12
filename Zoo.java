package com.testing_zoo.TestingZoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {
	
	private int space;
	private List<Animal> animals;
	
	public Zoo(int space) {
		if(space <= 0) {
			throw new IllegalArgumentException("Space cannot be less than zero");
		}
		
		this.space = space;
		this.animals = new ArrayList<>();
	}
	
	public int getSpace() {
		return space;
	}
	
	public List<Animal> getAnimals() {
		return animals;
	}
	
	public void addAnimal(Animal animal) {
		if(animals.size() < space) {
			animals.add(animal);
		}
	}
	
	public String listAnimals() {
		List<String> animalNames = new ArrayList<>();
		for(Animal animal : animals) {
			animalNames.add(animal.getName());
		}
		Collections.sort(animalNames);
		return String.join(", ", animalNames);
	}
	
	public String checkFreeSpace() {
		 int freeSpace = space - animals.size();
	     if (freeSpace == 0) {
	         return "The zoo is full!";
	     } else {
	         return "The zoo has " + freeSpace + " free spaces!";
	     }
	}

}
