package abstractClasses;

public abstract class Vehicle {
	
	public String run(){
		return "The Vehcile can run..";
	}
	
	public String stop(){
		return "The Vechile stops..";
	}

	public String accelerate(){
		return "The Vehcile can accelerate...";
	}
	public abstract String fly();
	public abstract String boatFloat();
	public abstract String dumpTruck();
	
}
