package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter total games, and games won");
		
		double total = in.nextDouble();
		double wins = in.nextDouble();
		
		System.out.println((double)Math.round(wins/total*100*1000)/1000);
	}

}
