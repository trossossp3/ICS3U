package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("enter the price of computer");
		double price = in.nextDouble();
		
		System.out.println("enter the sales tax");
		double tax = in.nextDouble()/100;
		
		double finalPrice = price + (tax*price);
		
		System.out.println(Math.round(finalPrice*100)/100);
		
		
		/*	
		double x = 0.84322343;

		System.out.println(Math.round(x * 1000) * 0.001); // rounding three decimal places

		//System.out.printf("print number: $%5.2f", x);
		 * 
		 */
	}
}
