package com.burak.shape;

public class Square extends Shape {

	private double side;

	public Square() {
		super("Square",4);
		this.side = 0;
	}

	public Square(double side) {
		super("Square",4);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Square drawn");
	}

	@Override
	public void erase() {
		System.out.println("Square erased!");
	}

	@Override
	public double calculateArea() {
		return (Math.pow(side, 2));
	}

	@Override
	public double calculateCircumference() {
		return (4 * side);
	}
	
	
	
	
}
