package com.bayviewglen.crosscountry;

import java.util.Scanner;

/*
 * Name: CrossCountry
 * Author:Trent Rossos
 * Date: October 10, 2018
 * Description: This program will output 5 cross country runner's mile splits given a) there first mile time b) there time to end of mile two c) total time.
 * 
 */
public class CrossCountry {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		final int SECONDS_IN_MINUTE = (Integer) null;

		// getting first and last name runner 1
		System.out.print("Please enter Name of Runner1(First name Last name ex. Trent Rossos): ");
		String fullName = in.nextLine();
		String runner1FirstName = fullName.substring(0, fullName.indexOf(" "));
		String runner1LastName = fullName.substring(fullName.indexOf(" ") + 1);

		// getting mile one numbers
		System.out.print(runner1FirstName + ", please eneter your Mile 1 Time (mm:ss.sss): ");
		String runner1Mile1 = in.nextLine();
		int colon = runner1Mile1.indexOf(":");
		int runner1Mile1Minutes = Integer.parseInt(runner1Mile1.substring(0, colon));
		double runner1Mile1Seconds = Double.parseDouble(runner1Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(runner1FirstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner1Mile2 = in.nextLine();
		int runner1Mile2Minutes;
		double runner1Mile2Seconds;
		colon = runner1Mile2.indexOf(":");
		runner1Mile2Minutes = Integer.parseInt(runner1Mile2.substring(0, colon));
		runner1Mile2Seconds = Double.parseDouble(runner1Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(runner1FirstName + ", please eneter your total time(mm:ss.sss): ");
		String runner1Mile3 = in.nextLine();
		int runner1Mile3Minutes;
		double runner1Mile3Seconds;
		colon = runner1Mile3.indexOf(":");
		runner1Mile3Minutes = Integer.parseInt(runner1Mile3.substring(0, colon));
		runner1Mile3Seconds = Double.parseDouble(runner1Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner1Mile1Sec = runner1Mile1Minutes * SECONDS_IN_MINUTE + runner1Mile1Seconds;
		double runner1Mile2Sec = runner1Mile2Minutes * SECONDS_IN_MINUTE + runner1Mile2Seconds;
		double runner1Mile3Sec = runner1Mile3Minutes * SECONDS_IN_MINUTE + runner1Mile3Seconds;

		// finding mile times values
		double runner1Mile2SecTime = runner1Mile2Sec - runner1Mile1Sec;
		double runner1Mile3SecTime = runner1Mile3Sec - runner1Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner1Mile1FinalMins = (int) (runner1Mile1Sec / SECONDS_IN_MINUTE);
		double runner1Mile1FinalSecs = runner1Mile1Sec % SECONDS_IN_MINUTE;
		// mile 2
		int runner1Mile2FinalMins = (int) (runner1Mile2SecTime / SECONDS_IN_MINUTE);
		double runner1Mile2FinalSecs = runner1Mile2SecTime % SECONDS_IN_MINUTE;
		// mile 3
		int runner1Mile3FinalMins = (int) (runner1Mile3SecTime / SECONDS_IN_MINUTE);
		double runner1Mile3FinalSecs = runner1Mile3SecTime % SECONDS_IN_MINUTE;

		// total time
		int runner1TotalMins = (int) (runner1Mile3Sec / SECONDS_IN_MINUTE);
		double runnner1TotalSecs = runner1Mile3Sec % SECONDS_IN_MINUTE;

		// Printing stuff
		System.out.println("\n\nRunner One Breakdown");
		System.out.println("######################\n");
		System.out.printf("%-20s%s\n", "Runner Name", runner1LastName + "," + runner1FirstName);
		System.out.printf("\n%-20s%d:%06.3f\n", "Split One", runner1Mile1FinalMins, runner1Mile1FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Two", runner1Mile2FinalMins, runner1Mile2FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Three", runner1Mile3FinalMins, runner1Mile3FinalSecs);
		System.out.printf("\n%-20s%d:%06.3f\n", "Total Time", runner1TotalMins, runnner1TotalSecs);

		// runner two

		// getting first and last name runner
		System.out.print("\nPlease enter Name of Runner2(First name Last name): ");
		fullName = in.nextLine();
		String runner2FirstName = fullName.substring(0, fullName.indexOf(" "));
		String runner2LastName = fullName.substring(fullName.indexOf(" ") + 1);
		// getting mile one numbers
		System.out.print(runner2FirstName + ", please eneter your Mile 1 Time (mm:ss.sss): ");
		String runner2Mile1 = in.nextLine();
		colon = runner2Mile1.indexOf(":");
		int runner2Mile1Minutes = Integer.parseInt(runner2Mile1.substring(0, colon));
		double runner2Mile1Seconds = Double.parseDouble(runner2Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(runner2FirstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner2Mile2 = in.nextLine();
		int runner2Mile2Minutes;
		double runner2Mile2Seconds;
		colon = runner2Mile2.indexOf(":");
		runner2Mile2Minutes = Integer.parseInt(runner2Mile2.substring(0, colon));
		runner2Mile2Seconds = Double.parseDouble(runner2Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(runner2FirstName + ", please eneter your total time(mm:ss.sss):");
		String runner2Mile3 = in.nextLine();
		int runner2Mile3Minutes;
		double runner2Mile3Seconds;
		colon = runner2Mile3.indexOf(":");
		runner2Mile3Minutes = Integer.parseInt(runner2Mile3.substring(0, colon));
		runner2Mile3Seconds = Double.parseDouble(runner2Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner2Mile1Sec = runner2Mile1Minutes * SECONDS_IN_MINUTE + runner2Mile1Seconds;
		double runner2Mile2Sec = runner2Mile2Minutes * SECONDS_IN_MINUTE + runner2Mile2Seconds;
		double runner2Mile3Sec = runner2Mile3Minutes * SECONDS_IN_MINUTE + runner2Mile3Seconds;

		// finding mile times values
		double runner2Mile2SecTime = runner2Mile2Sec - runner2Mile1Sec;
		double runner2Mile3SecTime = runner2Mile3Sec - runner2Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner2Mile1FinalMins = (int) (runner2Mile1Sec / SECONDS_IN_MINUTE);
		double runner2Mile1FinalSecs = runner2Mile1Sec % SECONDS_IN_MINUTE;
		// mile 2
		int runner2Mile2FinalMins = (int) (runner2Mile2SecTime / SECONDS_IN_MINUTE);
		double runner2Mile2FinalSecs = runner2Mile2SecTime % SECONDS_IN_MINUTE;
		// mile 3
		int runner2Mile3FinalMins = (int) (runner2Mile3SecTime / SECONDS_IN_MINUTE);
		double runner2Mile3FinalSecs = runner2Mile3SecTime % SECONDS_IN_MINUTE;

		// total time
		int runner2TotalMins = (int) (runner2Mile3Sec / SECONDS_IN_MINUTE);
		double runnner2TotalSecs = runner2Mile3Sec % SECONDS_IN_MINUTE;

		// Printing stuff
		System.out.println("\n\nRunner Two Breakdown");
		System.out.println("######################\n");
		System.out.printf("%-20s%s\n", "Runner Name", runner2LastName + "," + runner2FirstName);
		System.out.printf("\n%-20s%d:%06.3f\n", "Split One", runner2Mile1FinalMins, runner2Mile1FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Two", runner2Mile2FinalMins, runner2Mile2FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Three", runner2Mile3FinalMins, runner2Mile3FinalSecs);
		System.out.printf("\n%-20s%d:%06.3f\n", "Total Time", runner2TotalMins, runnner2TotalSecs);

		// runner three

		// getting first and last name runner
		System.out.print("\n\nPlease enter Name of Runner3(First name Last name): ");
		fullName = in.nextLine();
		String runner3FirstName = fullName.substring(0, fullName.indexOf(" "));
		String runner3LastName = fullName.substring(fullName.indexOf(" ") + 1);
		// getting mile one numbers
		System.out.print(runner3FirstName + ", please eneter your Mile 1 Time (mm:ss.sss): ");
		String runner3Mile1 = in.nextLine();
		colon = runner3Mile1.indexOf(":");
		int runner3Mile1Minutes = Integer.parseInt(runner3Mile1.substring(0, colon));
		double runner3Mile1Seconds = Double.parseDouble(runner3Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(runner3FirstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner3Mile2 = in.nextLine();
		int runner3Mile2Minutes;
		double runner3Mile2Seconds;
		colon = runner3Mile2.indexOf(":");
		runner3Mile2Minutes = Integer.parseInt(runner3Mile2.substring(0, colon));
		runner3Mile2Seconds = Double.parseDouble(runner3Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(runner3FirstName + ", please eneter your total time(mm:ss.sss):");
		String runner3Mile3 = in.nextLine();
		int runner3Mile3Minutes;
		double runner3Mile3Seconds;
		colon = runner3Mile3.indexOf(":");
		runner3Mile3Minutes = Integer.parseInt(runner3Mile3.substring(0, colon));
		runner3Mile3Seconds = Double.parseDouble(runner3Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner3Mile1Sec = runner3Mile1Minutes * SECONDS_IN_MINUTE + runner3Mile1Seconds;
		double runner3Mile2Sec = runner3Mile2Minutes * SECONDS_IN_MINUTE + runner3Mile2Seconds;
		double runner3Mile3Sec = runner3Mile3Minutes * SECONDS_IN_MINUTE + runner3Mile3Seconds;

		// finding mile times values
		double runner3Mile2SecTime = runner3Mile2Sec - runner3Mile1Sec;
		double runner3Mile3SecTime = runner3Mile3Sec - runner3Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner3Mile1FinalMins = (int) (runner3Mile1Sec / SECONDS_IN_MINUTE);
		double runner3Mile1FinalSecs = runner3Mile1Sec % SECONDS_IN_MINUTE;
		// mile 2
		int runner3Mile2FinalMins = (int) (runner3Mile2SecTime / SECONDS_IN_MINUTE);
		double runner3Mile2FinalSecs = runner3Mile2SecTime % SECONDS_IN_MINUTE;
		// mile 3
		int runner3Mile3FinalMins = (int) (runner3Mile3SecTime / SECONDS_IN_MINUTE);
		double runner3Mile3FinalSecs = runner3Mile3SecTime % SECONDS_IN_MINUTE;
		// total time
		int runner3TotalMins = (int) (runner3Mile3Sec / SECONDS_IN_MINUTE);
		double runnner3TotalSecs = runner3Mile3Sec % SECONDS_IN_MINUTE;
		// Printing stuff
		System.out.println("\n\nRunner Three Breakdown");
		System.out.println("######################\n");
		System.out.printf("%-20s%s\n", "Runner Name", runner3LastName + "," + runner3FirstName);
		System.out.printf("\n%-20s%d:%06.3f\n", "Split One", runner3Mile1FinalMins, runner3Mile1FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Two", runner3Mile2FinalMins, runner3Mile2FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Three", runner3Mile3FinalMins, runner3Mile3FinalSecs);
		System.out.printf("\n%-20s%d:%06.3f\n", "Total Time", runner3TotalMins, runnner3TotalSecs);

		// getting first and last name runner 4

		System.out.print("\n\nPlease enter Name of Runner4(First name Last name): ");
		fullName = in.nextLine();
		String runner4FirstName = fullName.substring(0, fullName.indexOf(" "));
		String runner4LastName = fullName.substring(fullName.indexOf(" ") + 1);
		// getting mile one numbers
		System.out.print(runner4FirstName + ", please eneter your Mile 1 Time (mm:ss.sss): ");
		String runner4Mile1 = in.nextLine();
		colon = runner4Mile1.indexOf(":");
		int runner4Mile1Minutes = Integer.parseInt(runner4Mile1.substring(0, colon));
		double runner4Mile1Seconds = Double.parseDouble(runner4Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(runner4FirstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner4Mile2 = in.nextLine();
		int runner4Mile2Minutes;
		double runner4Mile2Seconds;
		colon = runner4Mile2.indexOf(":");
		runner4Mile2Minutes = Integer.parseInt(runner4Mile2.substring(0, colon));
		runner4Mile2Seconds = Double.parseDouble(runner4Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(runner4FirstName + ", please eneter your total time(mm:ss.sss):");
		String runner4Mile3 = in.nextLine();
		int runner4Mile3Minutes;
		double runner4Mile3Seconds;
		colon = runner4Mile3.indexOf(":");
		runner4Mile3Minutes = Integer.parseInt(runner4Mile3.substring(0, colon));
		runner4Mile3Seconds = Double.parseDouble(runner4Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner4Mile1Sec = runner4Mile1Minutes * SECONDS_IN_MINUTE + runner4Mile1Seconds;
		double runner4Mile2Sec = runner4Mile2Minutes * SECONDS_IN_MINUTE + runner4Mile2Seconds;
		double runner4Mile3Sec = runner4Mile3Minutes * SECONDS_IN_MINUTE + runner4Mile3Seconds;

		// finding mile times values
		double runner4Mile2SecTime = runner4Mile2Sec - runner4Mile1Sec;
		double runner4Mile3SecTime = runner4Mile3Sec - runner4Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner4Mile1FinalMins = (int) (runner4Mile1Sec / SECONDS_IN_MINUTE);
		double runner4Mile1FinalSecs = runner4Mile1Sec % SECONDS_IN_MINUTE;
		// mile 2
		int runner4Mile2FinalMins = (int) (runner4Mile2SecTime / SECONDS_IN_MINUTE);
		double runner4Mile2FinalSecs = runner4Mile2SecTime % SECONDS_IN_MINUTE;
		// mile 3
		int runner4Mile3FinalMins = (int) (runner4Mile3SecTime / SECONDS_IN_MINUTE);
		double runner4Mile3FinalSecs = runner4Mile3SecTime % SECONDS_IN_MINUTE;

		// total time
		int runner4TotalMins = (int) (runner4Mile3Sec / SECONDS_IN_MINUTE);
		double runnner4TotalSecs = runner4Mile3Sec % SECONDS_IN_MINUTE;

		// Printing stuff
		System.out.println("\n\nRunner Four Breakdown");
		System.out.println("######################\n");
		System.out.printf("%-20s%s\n", "Runner Name", runner4LastName + "," + runner4FirstName);
		System.out.printf("\n%-20s%d:%06.3f\n", "Split One", runner4Mile1FinalMins, runner4Mile1FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Two", runner4Mile2FinalMins, runner4Mile2FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Three", runner4Mile3FinalMins, runner4Mile3FinalSecs);
		System.out.printf("\n%-20s%d:%06.3f\n", "Total Time", runner4TotalMins, runnner4TotalSecs);

		// runner 5
		System.out.print("\n\nPlease enter Name of Runner5(First name Last name): ");
		fullName = in.nextLine();
		String runner5FirstName = fullName.substring(0, fullName.indexOf(" "));
		String runner5LastName = fullName.substring(fullName.indexOf(" ") + 1);
		// getting mile one numbers
		System.out.print(runner5FirstName + ", please eneter your Mile 1 Time (mm:ss.sss): ");
		String runner5Mile1 = in.nextLine();
		colon = runner5Mile1.indexOf(":");
		int runner5Mile1Minutes = Integer.parseInt(runner5Mile1.substring(0, colon));
		double runner5Mile1Seconds = Double.parseDouble(runner5Mile1.substring(colon + 1));

		// getting mile two numbers
		System.out.print(runner5FirstName + ", please eneter your time to end of mile 2(mm:ss.sss): ");
		String runner5Mile2 = in.nextLine();
		int runner5Mile2Minutes;
		double runner5Mile2Seconds;
		colon = runner5Mile2.indexOf(":");
		runner5Mile2Minutes = Integer.parseInt(runner5Mile2.substring(0, colon));
		runner5Mile2Seconds = Double.parseDouble(runner5Mile2.substring(colon + 1));

		// getting mile 3 numbers
		System.out.print(runner5FirstName + ", please eneter your total time(mm:ss.sss):");
		String runner5Mile3 = in.nextLine();
		int runner5Mile3Minutes;
		double runner5Mile3Seconds;
		colon = runner5Mile3.indexOf(":");
		runner5Mile3Minutes = Integer.parseInt(runner5Mile3.substring(0, colon));
		runner5Mile3Seconds = Double.parseDouble(runner5Mile3.substring(colon + 1));

		// finding totals in seconds
		double runner5Mile1Sec = runner5Mile1Minutes * SECONDS_IN_MINUTE + runner5Mile1Seconds;
		double runner5Mile2Sec = runner5Mile2Minutes * SECONDS_IN_MINUTE + runner5Mile2Seconds;
		double runner5Mile3Sec = runner5Mile3Minutes * SECONDS_IN_MINUTE + runner5Mile3Seconds;

		// finding mile times values
		double runner5Mile2SecTime = runner5Mile2Sec - runner5Mile1Sec;
		double runner5Mile3SecTime = runner5Mile3Sec - runner5Mile2Sec;

		// making the time minutes and seconds
		// mile 1
		int runner5Mile1FinalMins = (int) (runner5Mile1Sec / SECONDS_IN_MINUTE);
		double runner5Mile1FinalSecs = runner5Mile1Sec % SECONDS_IN_MINUTE;
		// mile 2
		int runner5Mile2FinalMins = (int) (runner5Mile2SecTime / SECONDS_IN_MINUTE);
		double runner5Mile2FinalSecs = runner5Mile2SecTime % SECONDS_IN_MINUTE;
		// mile 3
		int runner5Mile3FinalMins = (int) (runner5Mile3SecTime / SECONDS_IN_MINUTE);
		double runner5Mile3FinalSecs = runner5Mile3SecTime % SECONDS_IN_MINUTE;
		// total time
		int runner5TotalMins = (int) (runner5Mile3Sec / SECONDS_IN_MINUTE);
		double runnner5TotalSecs = runner5Mile3Sec % SECONDS_IN_MINUTE;

		// Printing stuff
		System.out.println("\n\nRunner Five Breakdown");
		System.out.println("######################\n");
		System.out.printf("%-20s%s\n", "Runner Name", runner5LastName + "," + runner5FirstName);
		System.out.printf("\n%-20s%d:%06.3f\n", "Split One", runner5Mile1FinalMins, runner5Mile1FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Two", runner5Mile2FinalMins, runner5Mile2FinalSecs);
		System.out.printf("%-20s%d:%06.3f\n", "Split Three", runner5Mile3FinalMins, runner5Mile3FinalSecs);

		System.out.printf("\n%-20s%d:%06.3f\n", "Total Time", runner5TotalMins, runnner5TotalSecs);

		System.out.printf("\n\n%-25s*****Summary of the Five Runners******\n", "");
		System.out.printf("\n%-20s%15s%15s%15s%15s\n\n", "Runner Name", "Split One", "Split Two", "Split Three",
				"Total Time");

		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f%8d:%06.3f\n", runner1LastName + "," + runner1FirstName,
				runner1Mile1FinalMins, runner1Mile1FinalSecs, runner1Mile2FinalMins, runner1Mile2FinalSecs,
				runner1Mile3FinalMins, runner1Mile3FinalSecs, runner1TotalMins, runnner1TotalSecs);

		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f%8d:%06.3f\n", runner2LastName + "," + runner2FirstName,
				runner2Mile1FinalMins, runner2Mile1FinalSecs, runner2Mile2FinalMins, runner2Mile2FinalSecs,
				runner2Mile3FinalMins, runner2Mile3FinalSecs, runner2TotalMins, runnner2TotalSecs);

		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f%8d:%06.3f\n", runner3LastName + "," + runner3FirstName,
				runner3Mile1FinalMins, runner3Mile1FinalSecs, runner3Mile2FinalMins, runner3Mile2FinalSecs,
				runner3Mile3FinalMins, runner3Mile3FinalSecs, runner3TotalMins, runnner3TotalSecs);

		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f%8d:%06.3f\n", runner4LastName + "," + runner4FirstName,
				runner4Mile1FinalMins, runner4Mile1FinalSecs, runner4Mile2FinalMins, runner4Mile2FinalSecs,
				runner4Mile3FinalMins, runner4Mile3FinalSecs, runner4TotalMins, runnner4TotalSecs);

		System.out.printf("%-20s%8d:%06.3f%8d:%06.3f%8d:%06.3f%8d:%06.3f\n", runner5LastName + "," + runner5FirstName,
				runner5Mile1FinalMins, runner5Mile1FinalSecs, runner5Mile2FinalMins, runner5Mile2FinalSecs,
				runner5Mile3FinalMins, runner5Mile3FinalSecs, runner5TotalMins, runnner5TotalSecs);

		in.close();

	}

}
