package classes.zoo;

public class ZooService {
	public double getMediumPrice(Zoo[] zoos) {
		double sum = 0;
		for (Zoo zoo: zoos) {
			sum = sum + zoo.getTicketPrice();
		}
		return sum / zoos.length;
	}

//Needs to be improved: multiple zoos can have the same amount of animals
	public String findBiggestZoo(Zoo[] zoos) {
		String name = "";
		int numberOfAnimals = 0;
		for (Zoo zoo: zoos) {
			if (zoo.getAnimals().length > numberOfAnimals) {
				numberOfAnimals = zoo.getAnimals().length;
				name = zoo.getName();
			}
		} return name;
	}
}
