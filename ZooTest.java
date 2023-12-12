package com.testing_zoo.TestingZoo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ZooTest {
	
	@Test
	void createZooWithSpaceLimit() {
		Zoo zoo = new Zoo(5);
		
		assertEquals(5, zoo.getSpace());
		assertEquals(0, zoo.getAnimals().size());
	}
	
	@Test
	void createZooWithNagativeSpaceLimit_ThrowException() {
		assertThrows(IllegalArgumentException.class, () -> new Zoo(-1));
	}
	

    @Test
    void addAnimalToZoo() {
        Zoo zoo = new Zoo(3);
        Animal lion = new Animal("Lion");
        zoo.addAnimal(lion);
        
        assertEquals(1, zoo.getAnimals().size());
        assertTrue(zoo.getAnimals().contains(lion));
    }

    @Test
    void addAnimalsToFillZoo_ShouldStopAdding() {
        Zoo zoo = new Zoo(2);
        Animal elephant = new Animal("Elephant");
        Animal giraffe = new Animal("Giraffe");
        Animal tiger = new Animal("Tiger");
        
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(tiger); // Adding the third animal should not be successful
        
        assertEquals(2, zoo.getAnimals().size());
        assertFalse(zoo.getAnimals().contains(tiger));
    }

    @Test
    void listAllAnimalsInZoo() {
        Zoo zoo = new Zoo(5);
        Animal tiger = new Animal("Tiger");
        Animal lion = new Animal("Lion");
        Animal elephant = new Animal("Elephant");

        zoo.addAnimal(tiger);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        assertEquals("Elephant, Lion, Tiger", zoo.listAnimals());
    }

    @Test
    void checkFreeSpaceInZoo() {
        Zoo zoo = new Zoo(3);
        assertEquals("The zoo has 3 free spaces!", zoo.checkFreeSpace());

        Animal lion = new Animal("Lion");
        zoo.addAnimal(lion);
        assertEquals("The zoo has 2 free spaces!", zoo.checkFreeSpace());

        // Fill up the zoo
        Animal tiger = new Animal("Tiger");
        Animal elephant = new Animal("Elephant");
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);
        assertEquals("The zoo is full!", zoo.checkFreeSpace());
    }
}


