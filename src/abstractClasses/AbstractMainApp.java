package abstractClasses;

public class AbstractMainApp {

	public static void main(String[] args) {
		
		Plane plane = new Plane();
		Car car = new Car();
		Boat boat = new Boat();
		
		print(plane.fly());
		print(plane.run());
		print(plane.stop());
		print(plane.accelerate());
		
		print(car.dumpTruck());
		print(car.run());
		print(car.stop());
		print(car.accelerate());
		
		print(boat.boatFloat());
		print(boat.run());
		print(boat.stop());
		
		
	}
	public static void print(String s){
		System.out.println(s);
	}

}
