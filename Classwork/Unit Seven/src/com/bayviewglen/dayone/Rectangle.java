package com.bayviewglen.dayone;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		this.length =0;
		this.width=0;
		
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;	
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	 double area() {
		return length*width;
	}
	public double perimeter() {
		return 2*length + 2*width;
	}
}
