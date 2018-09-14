package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkTwo {
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		System.out.println("insert mark");
		int mark = in.nextInt();
		System.out.println("what was the test out of?");
		int total = in.nextInt();
		
		System.out.println("your mark was: "  + mark /total*100 + "%");
	}

}
