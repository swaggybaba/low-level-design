package Decorator;

import Base.BasePizza;

public class ExtraCheese extends ToppingDecorator {
	
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int cost() {
		System.out.println("In cost fn of ExtraCheese");
		return basePizza.cost()+10;
	}

}
