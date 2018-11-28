package com.bayviewglen.dayone;

public class ExampleFive {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 98, -10 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		System.out.println();
		
		
		mystery(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

	}

	public static void mystery(int[] arr) {
		arr[2] = 29;
		
		
		
		
	}
}
