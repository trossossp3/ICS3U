package com.bayviewglen.daytwo;

public class ExampleTwo {
	public static void main(String[] args) {
		double markOne, markTwo, markThree;
		double averageMark;
		
		markOne = 10;
		markTwo = 10;
		markThree = 10;
		
		averageMark = (markOne + markTwo + markThree)/3;
		
		System.out.println("the average was "+averageMark);
		
		int testOne, testTwo, testThree;
		
		testOne = 70;
		testTwo = 75;
		testThree = 70;
		
		averageMark = (testOne + testTwo + testThree)/3;
		System.out.println("the average was "+averageMark);
		// the average was 71.0
		
		averageMark = (testOne + testTwo + testThree)/3.0;
		System.out.println("the average was "+averageMark);
		// the average was 71.666666667 		
		//since we did double division the answer was different
		
		averageMark = (double)(testOne + testTwo + testThree)/3.0;
		System.out.println("the average was "+averageMark);
		//prints 71.0
		//incorrect cast as it cast 71 to double
		
	}

}
