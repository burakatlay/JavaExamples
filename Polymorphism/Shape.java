package com.burak.shape;

public class Shape {
	
	private String name;
	private int numberOfEdge;

	public Shape() {
		this.name = "";
		this.numberOfEdge = -1;
		System.out.println(this.toString());
	}

	public Shape(String name,int numberOfEdge) {
		this.name = name;
		this.numberOfEdge = numberOfEdge;
		System.out.println(this.toString());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEdge() {
		return numberOfEdge;
	}

	public void setNumberOfEdge(int numberOfEdge) {
		this.numberOfEdge = numberOfEdge;
	}

	@Override
	public String toString() {
		return "Shape name=" + name + ", Shape numberOfEdge=" + numberOfEdge;
	}

	public void draw() {
		System.out.println("Shape draw.");
	}
	
	public void erase() {
		System.out.println("Shape erase!");
	}
	
	public double calculateArea() {
		System.out.println("Shape area calculated.");
		return 0;
	}
	
	public double calculateCircumference() {
		System.out.println("Shape circumfrence calculated.");
		return 0;
	}

}
