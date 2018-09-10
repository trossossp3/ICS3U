package com.bayviewglen.daytwo;

public class HomeworkSix {
	public static void main(String[] args) {
		
		double a=2, b=17, c=4;
		double root1;
		double root2;
		
		root1 = ((b*-1)+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		root2 = ((b*-1)-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println(root1);
		System.out.println(root2);
	}

}
