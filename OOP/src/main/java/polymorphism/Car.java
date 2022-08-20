package polymorphism;

public class Car {
	private Engine engine;

	public Car(){}

	public Car(String engineName){
		this.engine = new Engine(engineName);
	}

	public String getEngineType(){
		return engine.getName();
	}
}
