package Client;

import VehicleModule.*;

public class VehicleFactory {

	Vehicle getVehicleObject(String vehicleName) {
		if(vehicleName.equals("BIKE")) {
			return new Bike();
		}
		if(vehicleName.equals("CAR")) {
			return new Car();
		}
		return new NullVehicle();
	}
	
}
