package Vehicle;

import Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle() {
		super(new NormalDriveStrategy());
	}
	
}
