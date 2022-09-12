package classes.zoo;

public class Zoo {
	private String name;
	private double ticketPrice;
	private Animal[] animals;

	//Getters
	public String getName() {
		return name;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}
}
