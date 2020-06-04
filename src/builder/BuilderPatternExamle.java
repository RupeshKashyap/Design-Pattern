package builder;
class Vehicle{
	//required parameter
	private String engine;
	private int wheel;

	// optional parameter
	private int airBag;

	public String getEngine() {
		return this.engine;
	}

	public int getWheel() {
		return this.wheel;
	}

	public int getAirBag() {
		return this.airBag;
	}

	private Vehicle(VehicleBuilder builder) {
		this.engine = builder.engine;
		this.wheel = builder.wheel;
		this.airBag = builder.airBag;
	}




	public static class VehicleBuilder{
		private String engine;
		private int wheel;

		private int airBag;
		public VehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		public VehicleBuilder setAirBag(int airbag) {
			this.airBag = airbag;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}
}



public class BuilderPatternExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirBag(4).build();
	    Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build(); 
	    
		System.out.println(car.getEngine());
	    System.out.println(car.getWheel());
	    System.out.println(car.getAirBag());
	    
	    System.out.println(bike.getEngine());
	    System.out.println(bike.getWheel());
	    System.out.println(bike.getAirBag());

	}

}
