package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooTest {
	ZooService zooService = new ZooService();

	@Test
	public void getMediumPrice() {
		Zoo[] zoos = AnimalTest.getZooArray();
		double expected = 6.17;
		double result = zooService.getMediumPrice(zoos);
		Assert.assertEquals(expected, result, 0.01);
	}

	@Test
	public void findBiggestZoo(){
		Zoo[] zoos = AnimalTest.getZooArray();
		String result = zooService.findBiggestZoo(zoos);
		String expected = "Zootopia";
		Assert.assertEquals(expected, result);
	}
}