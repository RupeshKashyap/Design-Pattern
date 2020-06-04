package factory;

abstract class Vehicle{
	public abstract int getWheel();

	/*
	 * public String toString() { return "Wheel " +this.getWheel(); }
	 */
}

class Car extends Vehicle{

	int wheel;
	Car(int wheel){
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {

		return this.wheel;
	}

}

class Bike extends Vehicle{
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return this.wheel;
	}
}

class VehicleFactory{
	public static Vehicle getInstance(String type, int wheel) {
		
		if(type.equalsIgnoreCase("car"))
			return new Car(wheel);
		
		if(type.equalsIgnoreCase("bike"))
			return new Bike(wheel);
		
		return null;
	}
}

public class FactoryPatternExample {
	public static void main(String arg[]) {
		
		System.out.println(VehicleFactory.getInstance("bike", 2));
		System.out.println(VehicleFactory.getInstance("car", 4));

	}

}
