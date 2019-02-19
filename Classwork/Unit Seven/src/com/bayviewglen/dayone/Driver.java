package com.bayviewglen.dayone;

public class Driver {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Box box1 = new Box(4,5,3);
		
		System.out.println("Box surface area: " + box1.surfaceArea());
		System.out.println("Box Volume: " + box1.volume());
		System.out.println("Box Volume: " + box1.area());
		System.out.println("Box perimeter: " + box1.perimeter());
		/*
		System.out.println("Rectangle area: " + rect1.surfaceArea()); //you do not inherit
		System.out.println("Rectangle Volume: " + rect1.volume()); //child methods
		*/
		System.out.println("Rectangle area: " + rect1.area()); //you do not inherit
		System.out.println("Rectangle perimeter: " + rect1.perimeter()); //child methods
	}

}
