package Main;

import Base.BasePizza;
import Base.VegDelight;
import Decorator.ExtraCheese;
import Decorator.Mushroom;

public class Main {

	public static void main(String[] args) {
		BasePizza basePizza = new ExtraCheese(new Mushroom(new VegDelight()));
		int cost=basePizza.cost();
		System.out.println(cost);
	}

}
