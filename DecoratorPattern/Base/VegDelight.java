package Base;

public class VegDelight extends BasePizza {

	@Override
	public int cost() {
		System.out.println("In cost fn of VegDelight");
		return 200;
	}

}
