package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class CrossCountry {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// getting first and last name runner
		System.out.print("Please enter Name of Runner(First name Last name): ");
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
		
		//making the time minutes and seconds
			//mile 1
		int runner1Mile1FinalMins =  (int) (runner1Mile1Sec/60);
		double runner1Mile1FinalSecs = runner1Mile1Sec%60;
			//mile 2
		int runner1Mile2FinalMins =  (int) (runner1Mile2SecTime/60);
		double runner1Mile2FinalSecs = runner1Mile2SecTime%60;
			//mile 3
		int runner1Mile3FinalMins =  (int) (runner1Mile3SecTime/60);
		double runner1Mile3FinalSecs = runner1Mile3SecTime%60;
			
		
		
		//Printing stuff
		System.out.println("\n\n\nRunner One Breakdown");
		System.out.println("#################\n");
		System.out.printf("Runner: %s, %s\n", lastName, firstName);
		System.out.printf("-----------------------------------\n","");
		System.out.printf(":%1sSplit 1%2s:",  "",""); 
		System.out.printf("%1sSplit 2%1s:",  "",""); 
		System.out.printf("%1sSplit 3%1s:\n",  "","");		
		
		System.out.printf(":%1s%d:%.2f%2s:","",runner1Mile1FinalMins, runner1Mile1FinalSecs, ""); 
		System.out.printf("%2s%d:%.2f%2s:","",runner1Mile2FinalMins, runner1Mile1FinalSecs, ""); 
		System.out.printf("%2s%d:%.2f%1s:\n","",runner1Mile3FinalMins, runner1Mile3FinalSecs, ""); 
		System.out.printf("-----------------------------------\n",args);
		System.out.printf("Total Time: %d:%.2f",runner1Mile3Minutes, runner1Mile3Seconds);
		
		
		
		
		
	}

}
