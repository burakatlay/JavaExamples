package com.burak.shape;

public class ShapeMain {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape s = factory.createShape();
		s.draw();
		s.erase();
		System.out.println(s.calculateArea());
		System.out.println(s.calculateCircumference());
	}

}
