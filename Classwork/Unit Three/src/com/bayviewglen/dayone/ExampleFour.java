package com.bayviewglen.dayone;

public class ExampleFour {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 98, -10};
		
		int sum = getSum(arr);
		System.out.println(sum);
		
		
		
	}

	public static int getSum(int[] arr) {
		
		int sum=0;
		for(int i =0; i< arr.length;i++) {
			sum+= arr[i];
		}
		
		return sum;
	}
	
	

}
