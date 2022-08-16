package polymorphism;

public class Toyota extends Car{

	public static class Supra extends Toyota{
		Supra(){
			setEngine(Engines.get2JZGTE());
		}
	}

	public static class LandCruiser extends Toyota{
		LandCruiser(){
			setEngine(Engines.get2UZFE());
		}
	}
}
