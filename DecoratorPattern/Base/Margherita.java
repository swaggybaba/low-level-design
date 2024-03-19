package Base;

public class Margherita extends BasePizza {

	@Override
	public int cost() {
		System.out.println("In cost fn of Margherita");
		return 150;
	}

}
