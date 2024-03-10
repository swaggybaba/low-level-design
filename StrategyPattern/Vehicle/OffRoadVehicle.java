package Vehicle;

import Strategy.OffRoadDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new OffRoadDriveStrategy());
	}

}
