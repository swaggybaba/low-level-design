package Decorator;

import Base.BasePizza;

public class Mushroom extends ToppingDecorator {

	public Mushroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int cost() {
		System.out.println("In cost fn of Mushroom");
		return basePizza.cost()+20;
	}

}
