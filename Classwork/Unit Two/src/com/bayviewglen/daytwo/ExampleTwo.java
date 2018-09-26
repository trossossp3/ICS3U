package com.bayviewglen.daytwo;

import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String temp = in.nextLine();
		int minutes;
		double seconds;
		
		int colon = temp.indexOf(":");
		minutes = Integer.parseInt(temp.substring(0, colon));
		seconds = Double.parseDouble(temp.substring(colon+1));
		
		//assume minutes = 5
		//assume seconds = 34.221
		
		//total time = 334.221
		//minutes * 60 + seconds
		
		//goal is to convert to 334.221 into 5 and 34.221
		
		System.out.println((int)(334.221/60)); // how to get amount of minutes in total time in seconds
		System.out.println(334.221%60); // how to get seconds in total time in minutes
		
		
	}

}
