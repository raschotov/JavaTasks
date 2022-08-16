package polymorphism;

public class Mazda extends Car{
	public static class mx5ND extends Mazda{
		mx5ND(){
			setEngine(Engines.getSkyaktivG());
		}
	}

	public static class rx7 extends Mazda{
		rx7(){
			setEngine(Engines.get13BREW());
		}
	}
}
