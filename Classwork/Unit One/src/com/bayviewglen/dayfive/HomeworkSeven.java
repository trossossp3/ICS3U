package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSeven {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the temperature in fahrenheit");
		double far = in.nextDouble();
		
		System.out.println((far-32)*(5/9));
	}

}
