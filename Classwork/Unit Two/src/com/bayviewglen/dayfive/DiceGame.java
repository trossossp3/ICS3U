package com.bayviewglen.dayfive;

import java.util.Scanner;

public class DiceGame {
	/**
	 * two player game player 1 and player 2 first to go over 50 wins option to roll
	 * 1 or 2 dice if you roll a 4 or 10 you lose 5
	 */
	public static void main(String[] args) {
		int playerOneScore = 0;
		int playerTwoScore = 0;
		final int GOAL = 50;
		final int MAX_DICE = 1000;
		Scanner in = new Scanner(System.in);
		
		
		boolean gameOver = false;
		while (!gameOver) {
			playerOneScore = playerTurn(in, "Player One", playerOneScore, MAX_DICE);
			playerTwoScore = playerTurn(in, "Player Two", playerTwoScore, MAX_DICE);

			displayScore("Player One", playerOneScore);
			displayScore("Player Two", playerTwoScore);
			System.out.println("**************************");
			if (playerOneScore > GOAL || playerTwoScore > GOAL) {
				gameOver = true;
			}

			
		}displayWinner("Player One", playerOneScore, "Player Two", playerTwoScore);
	}

	public static void displayWinner(String playerOne, int playerOneScore, String playerTwo, int playerTwoScore) {
		if (playerOneScore > playerTwoScore) {
			System.out.println(playerOne + " is the winner");
		} else if (playerOneScore < playerTwoScore) {
			System.out.println(playerTwo + " is the winner");
		} else {
			System.out.println("it is a tie");
		}

	}

	public static void displayScore(String playerName, int playerScore) {
		System.out.println(playerName + " score is: " + playerScore);

	}

	public static int playerTurn(Scanner in, String playerName, int playerScore, int maxValue) {
		System.out.print(playerName + ", how many dice would you like to roll (1 to " + maxValue + ")?");
		int numDice = getNumDice(in, maxValue);
		int currentTurn = 0;
		for (int i = 0; i < numDice; i++) {
			int currentRoll = roll();
			currentTurn += currentRoll;
			System.out.println(playerName + "rolled a " + currentRoll);
		}

		if (currentTurn == 4 || currentTurn == 10) {
			playerScore -= 5;
			System.out.println(playerName = "loses 5 points");
		} else {
			playerScore += currentTurn;
		}

		return playerScore;

	}

	public static int getNumDice(Scanner in, int maxValue) {
		int x = 0;
		boolean validInput = false;
		while (!validInput) {
			try {
				x = Integer.parseInt(in.nextLine());
				if (x < 1 || x > maxValue) {
					System.out.print("Enter an int(1 to "+ maxValue + "): ");
				}else {
					validInput = true;
				}
			} catch (Exception ex) {
				System.out.print("enter an int(1 to " + maxValue + "): ");
			}

		}

		return x;
	}

	public static int roll() {

		return (int) (Math.random() * 6) + 1;
	}

}
