package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkFour {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("insert inital speed");
		double Vi = in.nextDouble();
		
		System.out.println("insert acceleration");
		double a = in.nextDouble();
		
		System.out.println("insert time");
		double t = in.nextDouble();
		
		System.out.println("the velocity is: " + Vi + a*t );
		
	}

}
