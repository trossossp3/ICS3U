package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleThree {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		for (int i = 0; i<200000; i++){
			ints.add((int)(Math.random() * 10) + 1);
		}
		
		System.out.println("The numbers: " + ints);
		System.out.println("Size: " + ints.size());
		System.out.println("The sum: " + sumArrayList1(ints));
		System.out.println("The sum: " + sumArrayList2(ints));

	}

	private static int sumArrayList1(ArrayList<Integer> nums) {
		int sum = 0;
		for (int x : nums){
			sum += x;
		}
		
		return sum;
	}
	
	private static int sumArrayList2(ArrayList<Integer> nums) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++){
			sum += nums.get(i);
		}
		
		return sum;
	}

}
