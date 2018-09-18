package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEight {
	public static void main(String[] args) {
	
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("enter positive number");
	
	double num = in.nextDouble();
	double square = Math.pow(num,2);
	double sqrt = Math.sqrt(num);
	
	System.out.println("the square is " + square);
	System.out.println("the sqrt is: "+sqrt);
	
	}
}
