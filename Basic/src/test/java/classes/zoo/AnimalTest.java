package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
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