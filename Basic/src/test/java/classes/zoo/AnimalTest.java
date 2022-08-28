package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
	private static Zoo createZoo1(){
		Zoo zoo1 = new Zoo();
		zoo1.setName("Zootopia");
		zoo1.setTicketPrice(8.50);

		Animal animal1 = new Animal("Lion", "Simba", 1);
		Animal animal2 = new Animal("Elephant", "Jumbo", 5);
		Animal animal3 = new Animal("Wolf", "Fenrir", 5);
		Animal animal4 = new Animal("Chimp", "Bubba", 2);

		zoo1.setAnimals(new Animal[]{animal1, animal2, animal3, animal4});
		return zoo1;
	}

	private static Zoo createZoo2(){
		Zoo zoo2 = new Zoo();
		zoo2.setName("TravelingZoo");
		zoo2.setTicketPrice(5);

		Animal animal1 = new Animal("Cat", "Thomas", 10);
		Animal animal2 = new Animal("Dog", "Sparkey", 13);
		Animal animal3 = new Animal("Raven", "Huginn", 100);
		Animal animal4 = new Animal("Worm", "Jim", 0);

		zoo2.setAnimals(new Animal[]{animal1, animal2, animal3, animal4});
		return zoo2;
	}

	private static Zoo createZoo3(){
		Zoo zoo3 = new Zoo();
		zoo3.setName("Ape planet");
		zoo3.setTicketPrice(5);

		Animal animal1 = new Animal("Chimp", "Ooga", 3);
		Animal animal2 = new Animal("Makaka", "Booga", 2);
		Animal animal3 = new Animal("Gorilla", "Kong", 5);

		zoo3.setAnimals(new Animal[]{animal1, animal2, animal3});
		return zoo3;
	}

	private static Zoo[] zoos = new Zoo[]{createZoo1(), createZoo2(), createZoo3()};

	public static Zoo[] getZooArray() {
		return zoos;
	}


	@Test
	public void getAnimal(){
		Animal animal = new Animal();
		animal.setType(null);
		animal.setName(null);
		animal.setAge(0);
		Animal badAnimal = new Animal("1", ".", -1);

		/*
		System.out.println(animal.toString());
		System.out.println(badAnimal.toString());
		*/
		Assert.assertTrue(animal.equals(badAnimal));
	}
}