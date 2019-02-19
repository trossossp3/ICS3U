package com.bayviewglen.dayone;

public class Box extends Rectangle {
	private double height;

	/*
	 * if our parent has a implicit constructor (that takes arguments and does not
	 * have a default constructor) we must supply our own constructor
	 */

	public Box(double length, double height, double width) {
		super(length, width);
		this.height = height;
		// if you are going to call your parents constructor it
		// must be done in the first line

	}

	public Box() {
		super();
		height = 0;
	}

	public double getHeight() {
		return height;
	}

	public double surfaceArea() {
		return super.perimeter() * height + 2 * area();
	}

	public double volume() {
		return super.area() * height; // does not require super. because the child class has access to all public
								// stuff
	}
	
	@Override
	public double area() {
		throw new OutOfMemoryError("box doesnt have area");
	}
	
	public double perimeter() {
		throw new OutOfMemoryError("box doersnt have perimeter");
	}
}
