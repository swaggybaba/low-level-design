package Vehicle;

import Strategy.OffRoadDriveStrategy;

public class SportyVehicle extends Vehicle {

	public SportyVehicle() {
		super(new OffRoadDriveStrategy());
	}

}
