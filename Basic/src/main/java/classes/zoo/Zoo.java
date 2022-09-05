package classes.zoo;

public class Zoo {
	private String name;
	private double ticketPrice;
	private Animal[] animals;

	public void setName(String name) {
		this.name = name;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public static double getMediumPrice(Zoo[] zoos) {
		double sum = 0;
		for (Zoo zoo: zoos) {
			sum = sum + zoo.ticketPrice;
		}
		return sum / zoos.length;
	}

	//Needs to be improved: multiple zoos can have the same amount of animals
	public static String findBiggestZoo(Zoo[] zoos) {
		String name = "";
		int numberOfAnimals = 0;
		for (Zoo zoo: zoos) {
			if (zoo.animals.length > numberOfAnimals) {
				numberOfAnimals = zoo.animals.length;
				name = zoo.name;
			}
		} return name;
	}
}
