package com.burak.shape;


public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {
		super("Circle",0);
		this.radius = 0;
	}

	public Circle(double radius) {
		super("Circle",0);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle drawn");
	}

	@Override
	public void erase() {
		System.out.println("Circle erased!");
	}

	@Override
	public double calculateArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double calculateCircumference() {
		return (Math.PI * 2 * radius);
		
	}
	
	
	
}
