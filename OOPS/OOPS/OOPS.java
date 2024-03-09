package OOPS;

abstract class Vehicle {
	private double speed;
	private double cc;
	private String numberOnPlate;
	private int numberOfTyres;
	
	public Vehicle(double speed, double cc, String numberOnPlate,int numberOfTyres) {
		this.speed = speed;
		this.cc = cc;
		this.numberOnPlate = numberOnPlate;
		this.numberOfTyres=numberOfTyres;
	}
	
	public void drive() {
		System.out.println("Prafful Chauhan is driving Vehicle");
	}
	
	public abstract void blowHorn();
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	public String getNumberOnPlate() {
		return numberOnPlate;
	}

	public void setNumberOnPlate(String numberOnPlate) {
		this.numberOnPlate = numberOnPlate;
	}

	public int getNumberOfTyres() {
		return numberOfTyres;
	}

	public void setNumberOfTyres(int numberOfTyres) {
		this.numberOfTyres = numberOfTyres;
	}
	
	
}
class Bus extends Vehicle{
	int doors;
	int capacity;
	public Bus(double speed, double cc, String numberOnPlate, int numberOfTyres,int capacity) {
		super(speed, cc, numberOnPlate, numberOfTyres);
		this.capacity=capacity;
		doors=2;
	}
	
	//overriding
	public void drive() {
		System.out.println("Prafful Chauhan is driving Bus");
	}
	//overloading
	public void drive(int capacity) {
		System.out.println("Prafful Chauhan is driving Bus with capacity "+ capacity);
	}
	
	public void blowHorn() {
		System.out.println("Prafful Chauhan is blowing horn of bus");
	}
	
}
class Car extends Vehicle{
	int doors;
	public Car(double speed, double cc, String numberOnPlate, int numberOfTyres) {
		super(speed, cc, numberOnPlate, numberOfTyres);
		doors=4;
	}
	
	public void blowHorn() {
		System.out.println("Prafful Chauhan is blowing horn of car");
	}
}
class Bike extends Vehicle{

	public Bike(double speed, double cc, String numberOnPlate, int numberOfTyres) {
		super(speed, cc, numberOnPlate, numberOfTyres);
	}
	
	public void blowHorn() {
		System.out.println("Prafful Chauhan is blowing horn of bike");
	}
}
public class OOPS{
	public static void main(String args[]) {
		Bus bus=new Bus(200,600,"UP20AB0049",6,50);
		Bike bike=new Bike(180,250,"UP20AH0049",2);
		bus.drive();
		bus.drive(bus.capacity);
		bus.blowHorn();
		bike.drive();
		bike.blowHorn();
	}
}
