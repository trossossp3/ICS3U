package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter length then width of rectangle");
		
		double length = in.nextDouble();
		double width = in.nextDouble();
		
		System.out.println("the perimeter: " + length*2+width*2);
		System.out.println("the area is: " + length*width);
		
		
		/*
		double x = 0.765686545;
		System.out.printf("%5.2f", 0.445);
	*/
		}
}
