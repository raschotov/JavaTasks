package polymorphism;

import java.sql.SQLOutput;

public class CarShow {
	public static void main(String[] args) {
		showAllCarsEngines();
	}

	public static void showAllCarsEngines() {
		Car car0 = new Kia.Picanto();
		Car car1 = new Kia.Stinger();
		Car car2 = new Toyota.LandCruiser();
		Car car3 = new Toyota.Supra();
		Car car4 = new Mazda.mx5ND();
		Car car5 = new Mazda.rx7();

		Car[] cars = {car0, car1, car2, car3, car4, car5};

		System.out.println("Названия двигателей:");
		for (Car car: cars) {
			System.out.println(car.getEngine());
		}
	}
}
