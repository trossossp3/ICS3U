package com.bayviewglen.daysix;

public class ExampleOne {
	public static void main(String[] args) {

		double x = Math.random(); // [0.0,1.0)
		
		System.out.println(x);
		/*
		final int UNIQUE_NUMBERS = 10;
		
		int[] frequency = new int[UNIQUE_NUMBERS];
		
		for (int i=0; i<50000; i++) { // repeats for i
			int y =(int)(Math.random()*10); // wil always be zero because casting before mutlipling by 10	
			frequency[y]++;		
		}
		//System.out.println("hi");//[0,10) 0-9 inclusive
	*/
		
		
	//-10 and 10 inclusive
		final int LOWER_BOUND = -10;
		final int UNIQUE_NUMBERS = 21;
		
		for (int i =0; i<500; i++) {
			int y = (int)(Math.random()*UNIQUE_NUMBERS) + LOWER_BOUND; // [0,20] or [0,21)
			
			System.out.println(y);
			
		}
		
	}
	
	

}
