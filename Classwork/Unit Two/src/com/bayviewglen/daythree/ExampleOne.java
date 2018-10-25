package com.bayviewglen.daythree;

public class ExampleOne {
	public static void main(String[] args) {
		
		/*
		 * 1. the counter int i =0; init the counter
		 * 2. i<10 condition; continue while this is true
		 * 3. i++; how we are going to increment 
		 * 4. System.out.println; this is body do body while true
		 */
			
			/* Order
			 * 1
			 * 2
			 * 4
			 * 3
			 * 2
			 * 4
			 */
		
		for (int i =0; i<10;i++) {
			System.out.println(i);
		
		}
		System.out.println("-----------------------");
		for (int i =0; i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}		
		}
		System.out.println("-----------------------");
		for (int i =0; i<10;i+=2) {
		
			System.out.println(i);
		}
		System.out.println("-----------------------");
		
		for (int i =1; i<10;i+=2) {
			
			System.out.println(i);
		}
		System.out.println("-----------------------");
		
		int i =0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
	}
}
