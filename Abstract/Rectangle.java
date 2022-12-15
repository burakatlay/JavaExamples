package com.burak.shape;

public class Rectangle extends Shape{
	
	private double shortEdge;
	private double longEdge;
	
	public Rectangle() {
		super("Rectangle",4);
		this.shortEdge = 0;
		this.longEdge = 0;
	}

	public Rectangle(double shortEdge, double longEdge) {
		super("Rectangle",4);
		this.shortEdge = shortEdge;
		this.longEdge = longEdge;
	}

	public double getShortEdge() {
		return shortEdge;
	}

	public void setShortEdge(double shortEdge) {
		this.shortEdge = shortEdge;
	}

	public double getLongEdge() {
		return longEdge;
	}

	public void setLongEdge(double longEdge) {
		this.longEdge = longEdge;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle drawn");
	}

	@Override
	public void erase() {
		System.out.println("Rectangle erased!");
	}

	@Override
	public double calculateArea() {
		return (shortEdge * longEdge);
	}

	@Override
	public double calculateCircumference() {
		return (2*(shortEdge + longEdge));
	}

}
