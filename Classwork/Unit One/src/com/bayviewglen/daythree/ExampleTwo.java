package com.bayviewglen.daythree;

public class ExampleTwo {
	public static void main(String[] args) {
		
		int number = 18934;
		
		int digit1 = number / 10000; 		//get first digit
		int digit5 = number % 10; 			//get fifth digit
		int digit2 = number / 1000 %10; 	// 18934 / 1000 = 18 % 10 =8
		int digit3 = number /100 %10;		//18934 /100 =189 %10 = 9
		//or
		//digit3 = number % 1000/100		//18934 %1000 = 934/100 = 9
		
		int digit4 = number /10 % 10;			//18934 /10 = 1893 %10=5
	
		int sum = digit1 + digit2+ digit3 + digit4+digit5;
		System.out.println("the sum of the numbers is " + sum);
		
		
		
	}

}
