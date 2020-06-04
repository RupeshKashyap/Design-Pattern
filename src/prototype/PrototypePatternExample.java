package prototype;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable{

	private List<String> vehicleList;

	Vehicle(){
		this.vehicleList = new ArrayList<String>();
	}

	Vehicle(List<String> vehicleList){
		this.vehicleList = vehicleList;
	}

	public void insertData() {
		vehicleList.add("Honda amaze");
		vehicleList.add("Audi A4");
		vehicleList.add("Hyundai Creta");
		vehicleList.add("Maruti Baleno");
		vehicleList.add("Renault Duster");
	}
	public List<String> getVehicleList(){
		return this.vehicleList;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		List<String>  tempList = new ArrayList<String>();
		for(String l : this.getVehicleList())
			tempList.add(l);
		return new Vehicle(tempList);
		
	}
}

public class PrototypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.insertData();
		
		Vehicle v = (Vehicle) vehicle.clone();
		List<String> list = v.getVehicleList();
		list.add("Honda new Amaze");
	    
	    System.out.println(vehicle.getVehicleList());
	    System.out.println(list);
	    
	    v.getVehicleList().remove("Audi A4");
	    System.out.println(list);
	    System.out.println(vehicle.getVehicleList());
	}

}
