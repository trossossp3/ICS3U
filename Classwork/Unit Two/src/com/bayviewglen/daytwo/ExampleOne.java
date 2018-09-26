package com.bayviewglen.daytwo;

public class ExampleOne {
	public static void main(String[] args) {

		int x = 317;
		System.out.println("the number is: " + x);
		System.out.printf("the number is: %d\n", x);

		int num1 = 10;
		int num2 = 19;
		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		System.out.printf("%d+%d=%d\n",num1, num2, sum);
		
		int a = 212;
		System.out.printf("%10d\n",a);
		
		int b = -212;		
		System.out.printf("%10d\n", b);
		
		int c = 212;		
		System.out.printf("%+10d\n", c);
		
		int d = -212;		
		System.out.printf("%+10d\n", d);
		
		double i = 1.32624324532453;
		System.out.printf("%-10.2f\n", i);	// width of 10 for a floating point number and has 2 decimal places (rounds0
		
		System.out.printf("%5s%d%5s", "", 6, "");
		
		
		int minutes = 11;
		double seconds = 34.2;
		
		System.out.printf("%3d:%.3f\n",minutes, seconds);
		
		
		String name = "Phillip";
		System.out.printf("hello %s",name);

	}

}
