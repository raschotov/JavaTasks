package classes.zoo;

public class Animal {
	private String type;
	private String name;
	private int age;

	public Animal(){}

	public Animal(String type, String name, int age) {

		if (isStringCorrect(type)) {
			this.type = type;
		} else {
			this.type = null;
		}

		if (isStringCorrect(name)) {
			this.name = name;
		} else {
			this.name = null;
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

	//Проверка на корректность строк для конструктора
	boolean isStringCorrect(String input){
		if (input.matches("[a-zA-Z]+")) {
			return true;
		} else {
			System.out.println("Строки должны содержать только буквы");
			return false;
		}
	}
}
