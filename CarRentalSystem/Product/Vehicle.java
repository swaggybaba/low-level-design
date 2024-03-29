package Product;

import java.util.Date;

public class Vehicle {

	int vehicleId;
	String vehicleNumber;
	String companyName;
	VehicleType vehicleType;
	Status vehicleStatus;
	int kmDriven;
	Date manufacturingDate;
	int average;
	int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    
    public Vehicle(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
    
	public int getVehicleId() {
		return vehicleId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public Status getVehicleStatus() {
		return vehicleStatus;
	}
	public int getKmDriven() {
		return kmDriven;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public int getAverage() {
		return average;
	}
	public int getCc() {
		return cc;
	}
	public int getDailyRentalCost() {
		return dailyRentalCost;
	}
	public int getHourlyRentalCost() {
		return hourlyRentalCost;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public void setVehicleStatus(Status vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void setDailyRentalCost(int dailyRentalCost) {
		this.dailyRentalCost = dailyRentalCost;
	}
	public void setHourlyRentalCost(int hourlyRentalCost) {
		this.hourlyRentalCost = hourlyRentalCost;
	}
    
}
