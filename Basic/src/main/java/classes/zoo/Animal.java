package classes.zoo;

public class Animal {
	private String type;
	private String name;
	private int age;

	public Animal(){}

	public Animal(String type, String name, int age) {
		if (!type.contains("[a-zA-Z]+")) {
			System.out.println("Тип животного должен содержать только буквы");
			this.type = null;
		} else {
			this.type = type;
		}

		if (!name.contains("[a-zA-Z]+")) {
			System.out.println("Имя животного должно содержать только буквы");
			this.name = null;
		} else {
			this.name = name;
		}

		if (age < 0) {
			System.out.println("Age cannot be negative");
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Animal animal){
		return ((this.type == animal.type) && (this.name == animal.name) && (this.age == animal.age));
	}

	public String toString(){
		return this.type + ", " + this.name + ", "+ this.age;
	}
}
