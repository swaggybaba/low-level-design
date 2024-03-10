package Client;

import VehicleModule.*;

public class Main {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle bikeVehicle = vehicleFactory.getVehicleObject("BIKE");
		System.out.println("Seat Capacity: "+bikeVehicle.getSeatCapacity()+" TankCapacity: "+bikeVehicle.getTankCapacity());
		Vehicle vehicle = vehicleFactory.getVehicleObject("Truck");
		System.out.println("Seat Capacity: "+vehicle.getSeatCapacity()+" TankCapacity: "+vehicle.getTankCapacity());
	}

}
