package com.burak.shape;

public class ShapeFactory {

	public ShapeFactory() {
		//System.out.println("Object Create");
	}
	
	public Shape createShape() {
		Shape s = null;
		int i = (int) (4 * Math.random());
		switch (i) {
		case 0: {
			s = new Circle(10);
			break;
		}
		case 1: {
			s = new Rectangle(5, 10);
			break;
		}
		case 2: {
			s = new Square(4);
			break;
		}
		case 3: {
			s = new Triangle(4, 5);
			break;
		}
		default:
			System.out.println("illegal value: " + i);
			break;
		}
		return s;
	}

}
