package PrototypePattern;
/**
 * Prototype pattern is used when we want to create a multiple copies of an object without having to copy each parameter separately.
 * It can be used to create both shallow and deep copies.
 */
public class PrototypePattern {
	public static void main(String[] args) {
		Car car=new Car(20, "White", 7);
		System.out.println(car);
		Car car2=car.deepClone();
		Car car3=car.shallowClone();
		System.out.println(car2+" "+car3);
	}
}
