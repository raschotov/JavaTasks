package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooTest {

	@Test
	public void getMediumPrice() {
		Zoo[] zoos = AnimalTest.getZooArray();
		double expected = 6.17;
		double result = Zoo.getMediumPrice(zoos);
		Assert.assertEquals(expected, result, 0.01);
	}

	@Test
	public void findBiggestZoo(){
		Zoo[] zoos = AnimalTest.getZooArray();
		String result = Zoo.findBiggestZoo(zoos);
		String expected = "Ape planet";
		Assert.assertEquals(expected, result);
	}
}