package com.bayviewglen.daythree;

public class ExampleOne {
	// integer division
	public static void main(String[] args) {

		int x = 100; // single equals is assignment operator "="
		int y = 3;
		System.out.println(x / y); // prints "2" value because int/int is an int

		System.out.println(x % y); // returns the remainder ie. "1"

		// the if will tell us if x is even or odd
		if (x % 2 == 0) { // "==" is comparing primitive data
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}

		// checking if x is divisable by 4
		if (x % 4 == 0) {
			System.out.println(x + " is divisable by 4");
		} else {
			System.out.println(x + " is not divisable by 4");
		}

		int counter = 1;

		while (counter <= 1000) {
			if (counter % 25 == 0) {
				System.out.println(counter + ": this only happens every 15 iterations");
			}
			counter++;

		}

	}

}
