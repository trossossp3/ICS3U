package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		
		//any time we dont know the amount of iterations use while
		/*
		boolean isDone = false;
		
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		while(!isDone) {
			System.out.print("Enter an int: ");
			int x = in.nextInt();
			if(x%2==0) {
				sum+=x;
			}else{
				isDone = true;
			}
		}
		System.out.println("the sum is: "+sum);
		*/
		
			
		boolean isDone = false;
		
		
		Scanner in = new Scanner(System.in);
		int x;
		for(int sum = 0;!isDone;x=in.nextInt()) {
			System.out.print("Enter an int: ");
			
			if(x%2==0) {
				sum+=x;
			}else{
				isDone = true;
			}
			
			System.out.println("the sum is: "+sum);
		}
	}
		
	

}
