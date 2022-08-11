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

	public static Zoo createZoo1(){
		Zoo zoo1 = new Zoo();
		zoo1.setName("Zootopia");
		zoo1.setTicketPrice(8.50);

		Animal animal1 = new Animal("Lion", "Simba", 1);
		Animal animal2 = new Animal("Elephant", "Jumbo", 5);
		Animal animal3 = new Animal("Wolf", "Fenrir", 5);
		Animal animal4 = new Animal("Chimp", "Bubba", 2);

		zoo1.animals = new Animal[]{animal1, animal2, animal3, animal4};
		return zoo1;
	}

	public static Zoo createZoo2(){
		Zoo zoo2 = new Zoo();
		zoo2.setName("TravelingZoo");
		zoo2.setTicketPrice(5);

		Animal animal1 = new Animal("Cat", "Thomas", 10);
		Animal animal2 = new Animal("Dog", "Sparkey", 13);
		Animal animal3 = new Animal("Raven", "Huginn", 100);
		Animal animal4 = new Animal("Worm", "Jim", 0);

		zoo2.animals = new Animal[]{animal1, animal2, animal3, animal4};
		return zoo2;
	}

	public static Zoo createZoo3(){
		Zoo zoo3 = new Zoo();
		zoo3.setName("Ape planet");
		zoo3.setTicketPrice(5);

		Animal animal1 = new Animal("Chimp", "Ooga", 3);
		Animal animal2 = new Animal("Makaka", "Booga", 2);
		Animal animal3 = new Animal("Gorilla", "Kong", 5);

		zoo3.animals = new Animal[]{animal1, animal2, animal3};
		return zoo3;
	}

	public static Zoo[] getZooArray(){
		return new Zoo[]{createZoo1(), createZoo2(), createZoo3()};
	}

	public static double getMediumPrice(Zoo[] zoos) {
		double sum = 0;
		for (Zoo zoo: zoos) {
			sum = sum + zoo.ticketPrice;
		}
		return sum / zoos.length;
	}

	//Needs to be improved: multiple zoos can have the same amount of animals
	public void findBiggestZoo(Zoo[] zoos) {
		int indexOfBiggestZoo = 0;
		int biggestCount = 0;
		for (int i = 0; i < zoos.length; i++) {
			if (zoos[i].animals.length > biggestCount) {
				indexOfBiggestZoo = i;
			}
			System.out.println("Biggest zoo is " + zoos[i].name);
		}
	}
}
