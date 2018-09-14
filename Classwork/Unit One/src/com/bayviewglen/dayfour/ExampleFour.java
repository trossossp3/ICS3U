package com.bayviewglen.dayfour;

public class ExampleFour {
	public static void main(String[] args) {
		int x = 7;
		/*
		 * System.out.println(x); x++; System.out.println(x); ++x;
		 * System.out.println(x);
		 */
		/*
		 * System.out.println(x); System.out.println(x++); System.out.println(x);
		 */
		/*
		 * System.out.println(x); System.out.println(++x); System.out.println(x);
		 */
		/*
		 * ++x will add before it prints
		 */

		int y = ++x + 10;
		System.out.println(y); // prints 18
								// when it is ++x it does that first due to order of things

		int z = x++ + 10;
		System.out.println(z); // prints 17

		x = x + 1;
		x++;

		x += 1; // this means that x + 1 =x

		x += 27;
		x -= 27;
		
		x*=27;
		x/=27;
		x%=27;
		
		boolean isHappy = true;
		isHappy = !isHappy;
	}

}
