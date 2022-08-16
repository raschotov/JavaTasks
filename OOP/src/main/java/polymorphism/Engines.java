package polymorphism;

public abstract class Engines {

	private static class Engine2JZGTE extends Engines {}
	private static class Engine2UZFE extends Engines {}
	private static class Engine13BREW extends Engines {}
	private static class EngineSkyaktivG extends Engines {}
	private static class EngineG3LA extends Engines {}
	private static class EngineG4KL extends Engines {}

	//toyota L6
	public static Engines get2JZGTE(){
		return new Engine2JZGTE();
	}

	//toyota V8
	public static Engines get2UZFE(){
		return new Engine2UZFE();
	}

	//mazda rotary
	public static Engines get13BREW(){
		return new Engine13BREW();
	}

	//mazda L4
	public static Engines getSkyaktivG(){
		return new EngineSkyaktivG();
	}

	//kia 3-cyl
	public static Engines getG3LA(){
		return new EngineG3LA();
	}

	//kia L4 turbo
	public static Engines getG4KL(){
		return new EngineG4KL();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
