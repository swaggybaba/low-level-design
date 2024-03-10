package Client;

import Vehicle.*;

public class Strategy {
	public static void main(String[] args) {
		Vehicle vehicle=new SportyVehicle();
		vehicle.drive();
	}
}
