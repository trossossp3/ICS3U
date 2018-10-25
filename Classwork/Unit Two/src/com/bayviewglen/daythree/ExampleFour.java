package com.bayviewglen.daythree;

public class ExampleFour {
	public static void main(String[] args) {
		//display a grid 3 x 5
		
		final int NUM_ROWS =10;		
		final int NUM_COLS =10;
		
		for(int j =0; j< NUM_ROWS; j++) {
			for(int i=0; i < NUM_COLS; i++) {
				System.out.print(".");
			}
			System.out.println();
		}	
	}

}
