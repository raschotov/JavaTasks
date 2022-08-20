package polymorphism;

import java.sql.SQLOutput;

public class CarShow {
	public static void main(String[] args) {
		showAllCarsEngines();
	}

	public static void showAllCarsEngines() {
		Car car0 = new Kia("kiaEngineName");
		Car car1 = new Toyota("toyotaEngineName");
		Car car2 = new Mazda("mazdaEngineName");

		Car[] cars = {car0, car1, car2};

		System.out.println("Названия двигателей:");
		for (Car car: cars) {
			System.out.println(car.getEngineType());
		}
	}
}
