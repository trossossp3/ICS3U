package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkThree {
	public static void main(String[] args) {

		System.out.println("insert a 5 digit number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		int digit4 = number / 10 % 10; // number /10 % 10
		int digit2 = number / 1000 % 10; // number/1000%10

		if (number < 10000 || number > 99999) {
			throw new IllegalArgumentException("number must be five digit");
		} else {
			System.out.println(digit4 * digit2);

		}
	}

}
