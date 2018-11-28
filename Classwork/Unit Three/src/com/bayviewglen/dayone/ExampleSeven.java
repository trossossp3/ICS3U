package com.bayviewglen.dayone;

public class ExampleSeven {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 12, -2, 11 };
		int value =1212;

		int index = findMe(arr, value);

		
		if(index>=0) {
			System.out.println("The value was located at index: " + index);
		}else {
			System.out.println("the value was not in the array");
		}
		
	
	}
	
	public static int findMe(int[] arr, int value) {
			
		for(int i =0; i<arr.length; i++) {
			if (arr[i]== value) {
				return i;
			}
		}return -1;
	}

}
