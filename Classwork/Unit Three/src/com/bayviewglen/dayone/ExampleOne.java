package com.bayviewglen.dayone;

public class ExampleOne {
	public static void main(String[] args) {
		//an array stores a series of related values all of the same type
		
		
		// first you say type
		//then the name
		//then new int[size]
		int[] arr = new int[5];
		//declared a reference to an int array
		//it constructs a new int array of size 5
		//it assigns the variable arr to the new int array
		
		//to access the indivisual elements we use []

		for(int i =0; i<arr.length;i++) {
			System.out.println(i+": " + arr[i]);
		}
		System.out.println();
		arr[0] = 5;
		arr[1] =2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] =1;
		
		//if the no value is assigned the default is 0
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(i+": " + arr[i]);
		}
	}
}
