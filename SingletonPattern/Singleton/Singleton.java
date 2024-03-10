package Singleton;

public class Singleton {
	
	private static volatile Singleton instance=null;
	
	//private constructor can be accessed by reflection
	private Singleton() {
		if(instance!=null) {
			throw new RuntimeException("Don't try to be smart");
		}
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	
}
