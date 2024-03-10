package Singleton;

public class Main {
	public static void main(String[] args) {
		Singleton singleton1=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		//printing address to check same or not
		System.out.println(singleton1+" "+singleton2);
	}
}
