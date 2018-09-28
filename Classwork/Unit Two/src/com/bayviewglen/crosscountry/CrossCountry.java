package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class CrossCountry {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// getting first and last name runner 1
		System.out.print("Please enter Name of Runner1(First name Last name): ");
		String fullName = in.nextLine();
		String firstName = fullName.substring(0, fullName.indexOf(" "));
		String lastName = fullName.substring(fullName.indexOf(" "));
		// getting mile one numbers
		System.out.print(firstName + ", please eneter your Mile one Time (mm:ss.sss): ");
		String runner1Mile1 = in.nextLine();
		int colon = runner1Mile1.indexOf(":");
		int runner1Mile1Minutes = Integer.parseInt(runner1Mile1.substring(0, colon));
		double runner1Mile1Seconds = Double.parseDouble(runner1Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(firstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner1Mile2 = in.nextLine();
		int runner1Mile2Minutes;
		double runner1Mile2Seconds;
		colon = runner1Mile2.indexOf(":");
		runner1Mile2Minutes = Integer.parseInt(runner1Mile2.substring(0, colon));
		runner1Mile2Seconds = Double.parseDouble(runner1Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(firstName + ", please eneter your total time(mm:ss.sss):");
		String runner1Mile3 = in.nextLine();
		int runner1Mile3Minutes;
		double runner1Mile3Seconds;
		colon = runner1Mile3.indexOf(":");
		runner1Mile3Minutes = Integer.parseInt(runner1Mile3.substring(0, colon));
		runner1Mile3Seconds = Double.parseDouble(runner1Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner1Mile1Sec = runner1Mile1Minutes * 60 + runner1Mile1Seconds;
		double runner1Mile2Sec = runner1Mile2Minutes * 60 + runner1Mile2Seconds;
		double runner1Mile3Sec = runner1Mile3Minutes * 60 + runner1Mile3Seconds;
		// finding mile times values
		double runner1Mile2SecTime = runner1Mile2Sec - runner1Mile1Sec;
		double runner1Mile3SecTime = runner1Mile3Sec - runner1Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner1Mile1FinalMins = (int) (runner1Mile1Sec / 60);
		double runner1Mile1FinalSecs = runner1Mile1Sec % 60;
		// mile 2
		int runner1Mile2FinalMins = (int) (runner1Mile2SecTime / 60);
		double runner1Mile2FinalSecs = runner1Mile2SecTime % 60;
		// mile 3
		int runner1Mile3FinalMins = (int) (runner1Mile3SecTime / 60);
		double runner1Mile3FinalSecs = runner1Mile3SecTime % 60;

		// Printing stuff
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

		// runner two

		// getting first and last name runner
		System.out.print("\n\n\nPlease enter Name of Runner2(First name Last name): ");
		fullName = in.nextLine();
		firstName = fullName.substring(0, fullName.indexOf(" "));
		lastName = fullName.substring(fullName.indexOf(" "));
		// getting mile one numbers
		System.out.print(firstName + ", please eneter your Mile one Time (mm:ss.sss): ");
		String runner2Mile1 = in.nextLine();
		colon = runner2Mile1.indexOf(":");
		int runner2Mile1Minutes = Integer.parseInt(runner2Mile1.substring(0, colon));
		double runner2Mile1Seconds = Double.parseDouble(runner2Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(firstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner2Mile2 = in.nextLine();
		int runner2Mile2Minutes;
		double runner2Mile2Seconds;
		colon = runner2Mile2.indexOf(":");
		runner2Mile2Minutes = Integer.parseInt(runner2Mile2.substring(0, colon));
		runner2Mile2Seconds = Double.parseDouble(runner2Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(firstName + ", please eneter your total time(mm:ss.sss):");
		String runner2Mile3 = in.nextLine();
		int runner2Mile3Minutes;
		double runner2Mile3Seconds;
		colon = runner2Mile3.indexOf(":");
		runner2Mile3Minutes = Integer.parseInt(runner2Mile3.substring(0, colon));
		runner2Mile3Seconds = Double.parseDouble(runner2Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner2Mile1Sec = runner2Mile1Minutes * 60 + runner2Mile1Seconds;
		double runner2Mile2Sec = runner2Mile2Minutes * 60 + runner2Mile2Seconds;
		double runner2Mile3Sec = runner2Mile3Minutes * 60 + runner2Mile3Seconds;
		// finding mile times values
		double runner2Mile2SecTime = runner2Mile2Sec - runner2Mile1Sec;
		double runner2Mile3SecTime = runner2Mile3Sec - runner2Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner2Mile1FinalMins = (int) (runner2Mile1Sec / 60);
		double runner2Mile1FinalSecs = runner2Mile1Sec % 60;
		// mile 2
		int runner2Mile2FinalMins = (int) (runner2Mile2SecTime / 60);
		double runner2Mile2FinalSecs = runner2Mile2SecTime % 60;
		// mile 3
		int runner2Mile3FinalMins = (int) (runner2Mile3SecTime / 60);
		double runner2Mile3FinalSecs = runner2Mile3SecTime % 60;

		// Printing stuff
		System.out.println("\n\nRunner Two Breakdown");
		System.out.println("#################\n");
		System.out.printf("Runner: %s, %s\n", lastName, firstName);
		System.out.printf("-----------------------------------\n", "");
		System.out.printf("%1sSplit 1", "", "");
		System.out.printf("%5sSplit 2", "", "");
		System.out.printf("%5sSplit 3\n", "", "");
		// the spacing only works when the minutes are two digits

		System.out.printf("%1s%03d:%-2.2f", "", runner2Mile1FinalMins, runner2Mile1FinalSecs, "");
		System.out.printf("%4s%03d:%-2.2f", "", runner2Mile2FinalMins, runner2Mile2FinalSecs, "");
		System.out.printf("%4s%03d:%-2.2f\n", "", runner2Mile3FinalMins, runner2Mile3FinalSecs, "");
		System.out.printf("-----------------------------------\n", args);
		System.out.printf("Total Time: %d:%.2f", runner2Mile3Minutes, runner2Mile3Seconds);

		// runner three

		// getting first and last name runner
		System.out.print("\n\n\nPlease enter Name of Runner3(First name Last name): ");
		fullName = in.nextLine();
		firstName = fullName.substring(0, fullName.indexOf(" "));
		lastName = fullName.substring(fullName.indexOf(" "));
		// getting mile one numbers
		System.out.print(firstName + ", please eneter your Mile one Time (mm:ss.sss): ");
		String runner3Mile1 = in.nextLine();
		colon = runner3Mile1.indexOf(":");
		int runner3Mile1Minutes = Integer.parseInt(runner3Mile1.substring(0, colon));
		double runner3Mile1Seconds = Double.parseDouble(runner3Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(firstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner3Mile2 = in.nextLine();
		int runner3Mile2Minutes;
		double runner3Mile2Seconds;
		colon = runner3Mile2.indexOf(":");
		runner3Mile2Minutes = Integer.parseInt(runner3Mile2.substring(0, colon));
		runner3Mile2Seconds = Double.parseDouble(runner3Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(firstName + ", please eneter your total time(mm:ss.sss):");
		String runner3Mile3 = in.nextLine();
		int runner3Mile3Minutes;
		double runner3Mile3Seconds;
		colon = runner3Mile3.indexOf(":");
		runner3Mile3Minutes = Integer.parseInt(runner3Mile3.substring(0, colon));
		runner3Mile3Seconds = Double.parseDouble(runner3Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner3Mile1Sec = runner3Mile1Minutes * 60 + runner3Mile1Seconds;
		double runner3Mile2Sec = runner3Mile2Minutes * 60 + runner3Mile2Seconds;
		double runner3Mile3Sec = runner3Mile3Minutes * 60 + runner3Mile3Seconds;
		// finding mile times values
		double runner3Mile2SecTime = runner3Mile2Sec - runner3Mile1Sec;
		double runner3Mile3SecTime = runner3Mile3Sec - runner3Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner3Mile1FinalMins = (int) (runner3Mile1Sec / 60);
		double runner3Mile1FinalSecs = runner3Mile1Sec % 60;
		// mile 2
		int runner3Mile2FinalMins = (int) (runner3Mile2SecTime / 60);
		double runner3Mile2FinalSecs = runner3Mile2SecTime % 60;
		// mile 3
		int runner3Mile3FinalMins = (int) (runner3Mile3SecTime / 60);
		double runner3Mile3FinalSecs = runner3Mile3SecTime % 60;

		// Printing stuff
		System.out.println("\n\nRunner Three Breakdown");
		System.out.println("#################\n");
		System.out.printf("Runner: %s, %s\n", lastName, firstName);
		System.out.printf("-----------------------------------\n");
		System.out.printf("%1sSplit 1", "", "");
		System.out.printf("%5sSplit 2", "", "");
		System.out.printf("%5sSplit 3\n", "", "");
		// the spacing only works when the minutes are two digits

		System.out.printf("%1s%03d:%-2.2f", "", runner3Mile1FinalMins, runner3Mile1FinalSecs, "");
		System.out.printf("%4s%03d:%-2.2f", "", runner3Mile2FinalMins, runner3Mile2FinalSecs, "");
		System.out.printf("%4s%d:%-2.2f\n", "", runner3Mile3FinalMins, runner3Mile3FinalSecs, "");
		System.out.print("-----------------------------------\n");
		System.out.printf("Total Time: %d:%.2f", runner3Mile3Minutes, runner3Mile3Seconds);

	}

}
