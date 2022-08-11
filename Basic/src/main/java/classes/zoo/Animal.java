package classes.zoo;

public class Animal {
	private String type;
	private String name;
	private int age;

	public Animal(String type, String name, int age) {
		this.type = type;
		this.name = name;

		if (age < 0) {
			System.out.println("Age cannot be negative");
		} else {
			this.age = age;
		}
	}
}
