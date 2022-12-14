package com.burak.shape;

public class Triangle extends Shape {

	private double base;
	private double height;
	
	public Triangle() {
		super("Triangle",3);
		this.base = 0;
		this.height = 0;
	}

	public Triangle(double base, double height) {
		super("Triangle",3);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Triangle drawn");
	}

	@Override
	public void erase() {
		System.out.println("Triangle erased");
	}

	@Override
	public double calculateArea() {
		return ((base * height)/2);
	}

	@Override
	public double calculateCircumference() {
		double otherSide = Math.sqrt(Math.pow(height, 2) - Math.pow(base, 2));
		return (height + base + otherSide);
	}
	
	
	
}
