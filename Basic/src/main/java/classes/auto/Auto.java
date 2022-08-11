package classes.auto;

public class Auto {
	private String model;
	private String manufacturer;
	private int seats;
	private String gearbox;

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSeats() {
		return seats;
	}

	public String getGearbox() {
		return gearbox;
	}

	public Auto (String model, String manufacturer, int seats, String gearbox) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.seats = seats;
		this.gearbox = gearbox;



		Auto[] cars = new Auto[5];
		cars[0] = new Auto("W212", "Mercedes", 4, "automatic");
		cars[1] = new Auto("M2", "BMW", 4, "automatic");
		cars[2] = new Auto("Testarossa", "Ferrari", 2, "manual");
		cars[4] = new Auto("Actros", "Mercedes", 3, "automatic");
	}
}
