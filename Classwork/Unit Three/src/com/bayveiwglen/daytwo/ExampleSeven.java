package com.bayveiwglen.daytwo;

public class ExampleSeven {
	public static void main(String[] args) {
		
		/*
		int[] arr = {3, 5, 4,1,5};
			
		for(int i :arr) {
			System.out.println(i);
		}
		System.out.println();

		for(int i :arr) {
			i++;
		}
		System.out.println();

		for(int i :arr) {
			System.out.println(i);
		}
*/
		String[] arr = {"apple", "grape", "pine", "table", "table"};
		
		for(String i :arr) {
			System.out.println(i);
		}
		System.out.println();

		for(String i :arr) {
			i = i.substring(0,2);
		}
		System.out.println();

		for(String i :arr) {
			System.out.println(i);
		}
}
}