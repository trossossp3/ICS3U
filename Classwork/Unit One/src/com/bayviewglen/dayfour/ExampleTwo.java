package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length and width ");
		double length = in.nextDouble();
		double width = in.nextDouble();
		System.out.println("\nenter height");
		double height = in.nextDouble();

		double surfaceArea = 2*(length*width + length*height+ width*height);
		System.out.println("\nthe surface area is: " + surfaceArea);
		
		in.close(); //close it so the program does not slow down like connecting to database
		
	}

}
