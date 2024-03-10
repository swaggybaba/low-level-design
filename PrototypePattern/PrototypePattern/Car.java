package PrototypePattern;

public class Car {
	public int mileage;
    public String color;
    public int seats;

    public Car(int mileage, String color, int seats) {
        this.mileage = mileage;
        this.color = color;
        this.seats = seats;
    }
    
    public Car deepClone() {
        Car car = new Car(this.mileage, this.color, this.seats);
        return car;
    }

    public Car shallowClone() {
        return this;
    }
}
