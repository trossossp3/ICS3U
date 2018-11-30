package com.bayveiwglen.daytwo;

public class ExampleThree {
	public static void main(String[] args) {
		String[] arr = { "Apple", "pear", "grape", "almond" };

		// arr = {2, 3};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

		System.out.println();		

		
		//for each loop is used just to iterate 
		int i =0;
		for (String el : arr) {
			System.out.println(el);
			System.out.println(arr[i]);
			i++;
		}
		
		
	}
}
