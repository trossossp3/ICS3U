package com.bayviewglen.dayfour;

public class ExampleOne {
	public static void main(String[] args) {
		int x = 7;
		int y = 3;
		int z = 5;

		boolean a = x > 10;
		boolean b = y < 10;
		boolean c = z >= 2;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//A(B+c) = AB + BC
		//&& is like multiplication
		//|| is like addition
		//false is zero A*0 = false
			//a&&false == false
		//true is 1
			//a&&true == a
		//true^2 == true
			//true&&true == true
		//!(a&&b) = !a||!b
		//!(a||b) = !a&&!b
		System.out.println(a&&(b||c));
		System.out.println((a&&b)||(a&&c));
		
		System.out.println();
		
		System.out.println(b);
		System.out.println(b&&true);
		System.out.println(b&&false);
		System.out.println();
		
		System.out.println(!(x > y || y <= z));
		System.out.println(x<=y && y > z);
		
	}

}
