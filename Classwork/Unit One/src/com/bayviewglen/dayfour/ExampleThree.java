package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleThree {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number = 0;
		/*
		 * if (number <100 || number >999) { in.close(); throw new
		 * IllegalArgumentException("number must be three digit"); }
		 */

		while (number < 100 || number > 999) {

			System.out.println("enter a three digit integer");
			System.out.println("enter a three digit number: ");
			number = in.nextInt();
		}
		int digit1 = number / 100; // for first digit always divide by the the length of number ie. 100||1000
		int digit3 = number % 10; // for the last digit mod ten
		int digit2 = number / 10 % 10; // for second digit / 10 %10

		System.out.println("the sum is: " + digit1 + digit2 + digit3);
		in.close();

	}
}
