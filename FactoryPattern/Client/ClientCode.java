package Client;

import ShapeModule.Shape;

public class ClientCode {

	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape1=shapeFactory.getShape("Square");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("Circle");
		shape2.draw();
	}

}
