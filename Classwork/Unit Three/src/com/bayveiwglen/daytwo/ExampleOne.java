package com.bayveiwglen.daytwo;

public class ExampleOne {
	public static void main(String[] args) {

		String[] arr = new String[5];

		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		arr[0] = "Apple";
		arr[1] = "pear";
		arr[2] = "grapes";
		arr[4] = new String("Juice Box");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}
}
