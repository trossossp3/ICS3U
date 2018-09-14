package com.bayviewglen.dayfour;

import java.util.Scanner; //fully qualified name for the class

public class ExampleOne {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		/*
		 * scanner is a class create an object and it will be a scanner in references a
		 * scanner it is a object type
		 */

		int x, y, z;
		System.out.println("enter three numbers");
		x = in.nextInt(); 		//grabbing next value from buffer and treating it as int
		y = in.nextInt(); 
		z = in.nextInt(); 
		
		double average = (x + y + z) / 3.0;
		System.out.println("the averager is: " + average);

	}
}