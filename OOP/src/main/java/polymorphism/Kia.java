package polymorphism;

public class Kia extends Car{
	public static class Picanto extends Kia{
		Picanto(){
			setEngine(Engines.getG3LA());
		}
	}

	public static class Stinger extends Kia{
		Stinger(){
			setEngine(Engines.getG4KL());
		}
	}
}
