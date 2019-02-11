package com.bayviewglen.dayone;

public class ICSGame {

	public static void main(String[] args) {
		Die die1 = new Die();
		Die die2 = new Die(6);
		
		int numPairs = 0;
		for (int i = 0; i<20; i++){
			die1.roll();
			die2.roll();
			System.out.println("Die 1: " + die1.getTopSide());
			System.out.println("Die 2: " + die2.getTopSide());
			if (die1.equals(die2))
				numPairs++;
		}
		
		System.out.println("Number of Pairs: " + numPairs);
	}


}
