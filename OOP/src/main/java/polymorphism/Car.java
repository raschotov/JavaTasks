package polymorphism;

public abstract class Car {
	Car() {}

	private Engines engine;

	public Engines getEngine(){
		return engine;
	}

	public void setEngine(Engines engine) {
		this.engine = engine;
	}
}
