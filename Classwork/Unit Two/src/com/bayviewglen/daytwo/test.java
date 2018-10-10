package com.bayviewglen.daytwo;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String lastName = "Rossos";
		String firstName = "Trent";
		int minutes1 = 2;
		double seconds1 = 20.000;
		
		int minutes2 = 2;
		double seconds2 = 20.000;
		
		int minutes3 = 2;
		double seconds3 = 20.000;
		
		
		System.out.printf("%-20s%s\n", "Runner Name", lastName + ","+ firstName);
		System.out.printf("%-20s%d:%06.3f\n", "Split One", minutes1,seconds1);
		
		
		
		System.out.printf("%-20s%15s%15s%15s\n", "Runner Name", "Mile One", "Mile Two", "Mile Three");
		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f\n", lastName+ "," + firstName, minutes1, seconds1, minutes2, seconds2, minutes3, seconds3);
		

		
		
		
		
		
		System.out.println("\n\nRunner One Breakdown");
		System.out.println("#################\n");
		System.out.printf("Runner: %s, %s\n", lastName, firstName);
		System.out.printf("-----------------------------------\n", "");
		System.out.printf("%1sSplit 1", "", "");
		System.out.printf("%5sSplit 2", "", "");
		System.out.printf("%5sSplit 3\n", "", "");
		// the spacing only works when the minutes are two digits

		System.out.printf("%1s%03d:%-2.2f", "", runner1Mile1FinalMins, runner1Mile1FinalSecs, "");
		System.out.printf("%4s%03d:%-2.2f", "", runner1Mile2FinalMins, runner1Mile2FinalSecs, "");
		System.out.printf("%4s%03d:%-2.2f\n", "", runner1Mile3FinalMins, runner1Mile3FinalSecs, "");
		System.out.printf("-----------------------------------\n", args);
		System.out.printf("Total Time: %d:%.2f", runner1Mile3Minutes, runner1Mile3Seconds);

	}
}
