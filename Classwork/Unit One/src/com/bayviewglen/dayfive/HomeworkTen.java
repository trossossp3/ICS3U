package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTen {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter mass");
		double mass = in.nextDouble();
		System.out.println("enter velocity");
		double velocity = Math.pow(in.nextDouble(),2);
		
		System.out.println(0.5*mass*velocity);
		
		
		
	}

}
