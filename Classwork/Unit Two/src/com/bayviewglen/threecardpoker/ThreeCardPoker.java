package com.bayviewglen.threecardpoker;

//http://www.vidpoker.com/threecardpoker/index.htm

import java.util.Scanner;

public class ThreeCardPoker {

	public static final int NUM_SUITS = 4;
	public static final int NUM_FACES = 13;
	public static final int PP_FLUSH_ANTE = 4;
	public static final int PP_STRAIGHT_ANTE = 6;
	public static final int PP_THREE_OF_A_KIND_ANTE = 30;
	public static final int PP_STRAIGHT_FLUSH_ANTE = 40;
	public static final int STRAIGHT_ANTE = 1;
	public static final int THREE_OF_A_KIND_ANTE = 4;
	public static final int STRAIGHT_FLUSH_ANTE = 5;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int playerWallet = 500;

		boolean isGameOver = false;
		boolean isRoundOver = false;

		while (!isGameOver) {
			isRoundOver = false;
			String playerHand = "";
			String dealerHand = "";
			String allCards = "";
			boolean isValidCards = false;
		//	while (isValidCards) {
				String playerCard1 = getCard();
				String playerCard2 = getCard();
				String playerCard3 = getCard();

				playerHand += playerCard1 + " " + playerCard2 + " " + playerCard3;

				String dealerCard1 = getCard();
				String dealerCard2 = getCard();
				String dealerCard3 = getCard();

				dealerHand += dealerCard1 + " " + dealerCard2 + " " + dealerCard3;
				//isValidCards = validateCard(playerCard1,playerCard2,playerCard2,dealerCard1,dealerCard2,dealerCard3);
				
			//}

			int anteWager = getAnteWager(in, playerWallet);
			playerWallet -= anteWager;
			int pairPlusWager = getPairPlus(in, playerWallet, anteWager);
			playerWallet -= pairPlusWager;
			while (!isRoundOver) {

				allCards = playerHand + " " + dealerHand;
				System.out.println(playerHand);

				boolean continueRound = continueRound(in, playerWallet); // improve wording of this

				if (continueRound) {
					playerWallet -= anteWager;
					anteWager *= 2; // if they want to continue they must bet the same amount as their ante bet
					// checks if dealer has queenHigh
					System.out.println("The dealer hand: " + dealerHand);
					boolean isDealerActive = queenHigh(dealerCard1, dealerCard2, dealerCard3); // if the dealer does not
																								// have queen high

					int anteWinnings = 0;
					if (!isDealerActive) { // if the dealer does not have queen high
						System.out.println("The dealer does not have queen high");
						anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
						System.out.println("You got: " + anteWinnings + " from the ante bonus");
						anteWinnings += anteWager * 2;
						System.out.println("You won: " + anteWinnings + " from the ante winnings");
						int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2, playerCard3);
						System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
						playerWallet += (pairPlusWinnings + anteWinnings);
						System.out.println("you have: $" + playerWallet);

						isGameOver = playNextRound(in, playerWallet);
						isRoundOver = true;
					} else {
						int winner = checkWinner(playerCard1, playerCard2, playerCard3, dealerCard1, dealerCard2,
								dealerCard3);
						if (winner == 1) {
							anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
							System.out.println("You got: " + anteWinnings + " from the ante bonus");
							anteWinnings += anteWager * 2;
							System.out.println("You won: " + anteWinnings + " from the ante winnings");
							int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2,
									playerCard3);
							System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
							System.out.println("you have: $" + (playerWallet + pairPlusWinnings + anteWinnings));
							playerWallet += (pairPlusWinnings + anteWinnings);
							isGameOver = playNextRound(in, playerWallet);
							isRoundOver = true;
						} else if (winner == 2) {
							anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
							System.out.println("You got: " + anteWinnings + " from the ante bonus");
							System.out.println("You won: " + anteWinnings + " from the ante winnings");
							int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2,
									playerCard3);
							System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
							System.out.println("you have: $" + (playerWallet + pairPlusWinnings + anteWinnings));
							playerWallet += (pairPlusWinnings + anteWinnings);
							isGameOver = playNextRound(in, playerWallet);
							isRoundOver = true;
						} else {
							anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
							System.out.println("You got: " + anteWinnings + " from the ante bonus");
							anteWinnings += anteWager;
							System.out.println("You won: " + anteWinnings + " from the ante winnings");
							int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2,
									playerCard3);
							System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
							System.out.println("you have: $" + (playerWallet + pairPlusWinnings + anteWinnings));
							playerWallet += (pairPlusWinnings + anteWinnings);
							isGameOver = playNextRound(in, playerWallet);
							isRoundOver = true;
						}
					}

				} else if (!continueRound && pairPlusWager > 0) {
					int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2, playerCard3);
					System.out.println("you won: $" + pairPlusWinnings + " from the Pair Plus");
					System.out.println("you have: $" + (playerWallet + pairPlusWinnings));
					isGameOver = playNextRound(in, playerWallet);
					isRoundOver = true;
				} else {
					isGameOver = playNextRound(in, playerWallet);
					isRoundOver = true;
				}
			}
		}

	}

	private static int checkWinner(String playerCard1, String playerCard2, String playerCard3, String dealerCard1,
			String dealerCard2, String dealerCard3) {

		int playerHandCode = checkHand(playerCard1, playerCard2, playerCard3);
		int dealerHandCode = checkHand(dealerCard1, dealerCard2, dealerCard3);
		/*
		 * 0 = push 1 = player 2 = dealer
		 */

		if (playerHandCode > dealerHandCode) {
			System.out.println("player won");
			return 1;
		} else if (playerHandCode < dealerHandCode) {
			System.out.println("Dealer won");
			return 2;
		} else {
			System.out.println("It was a push");
			return 0;
		}

	}

	// checks if the dealer has queen high or above
	private static boolean queenHigh(String dealerCard1, String dealerCard2, String dealerCard3) {
		if (checkFace(dealerCard1) >= 12 || checkFace(dealerCard2) >= 12 || checkFace(dealerCard2) >= 12) {
			return true;
		} else {
			return false;
		}
	}

	private static int checkHand(String Card1, String Card2, String Card3) {
		int handValue = 0;
		String card1Suit = Card1.substring(Card1.length() - 1);
		String card2Suit = Card2.substring(Card2.length() - 1);
		String card3Suit = Card3.substring(Card3.length() - 1);

		int card1Face = checkFace(Card1);
		int card2Face = checkFace(Card2);
		int card3Face = checkFace(Card3);

		if (card1Face == card2Face || card1Face == card3Face || card2Face == card3Face) {
			// System.out.println("you have a pair");
			handValue = 1;
		} else if (card1Suit.equals(card2Suit) && card2Suit.equals(card3Suit)) {
			// System.out.println("you have a flush");
			handValue = 2;
		} else if (isStraight(card1Face, card2Face, card3Face)) {
			// System.out.println("you have a straight");
			handValue = 3;

		} else if (card1Face == card2Face && card2Face == card3Face) {
			// System.out.println("you have a three of a kind");
			handValue = 4;
		} else if (card1Suit.equals(card2Suit) && card2Suit.equals(card3Suit)
				&& isStraight(card1Face, card2Face, card3Face)) {
			// System.out.println("you have a straight flush");
			handValue = 5;
		} else {
			// System.out.println("you don't have anything");
			handValue = 0;
			// if they have nothing return 0
		}
		return handValue;
	}

	private static int anteBonus(int anteWager, String playerCard1, String playerCard2, String playerCard3) {

		int handCode = checkHand(playerCard1, playerCard2, playerCard3);

		if (handCode == 3) { // straight
			System.out.println("You have a straight");
			return STRAIGHT_ANTE * anteWager;
		} else if (handCode == 4) { // 3 of a kind
			System.out.println("You have 3 of a kind");
			return THREE_OF_A_KIND_ANTE * anteWager;
		} else if (handCode == 5) { // straight flush
			System.out.println("You have a straight flush");
			return STRAIGHT_FLUSH_ANTE * anteWager;
		} else {
			return 0;
		}

	}

	private static boolean playNextRound(Scanner in, int playerWallet) {

		// add a display table
		if (playerWallet == 0) {
			System.out.println("you are out of money");
			return true;
		}
		System.out.print("Play Next Round? (Y/N): ");

		boolean isValidInput = false;
		while (!isValidInput) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("y"))
				return false;
			else if (temp.equals("no") || temp.equals("n"))
				return true;
			else
				System.out.print("Play Next Round? (Y/N): ");
		}

		return false;
	}

	/**
	 * 
	 * @param pairPlusWager
	 * @param playerCard1
	 * @param playerCard2
	 * @param playerCard3
	 * @return amount of money won from the pair pluse
	 * 
	 */

	private static int pairPlusWinnings(int pairPluseWager, String playerCard1, String playerCard2,
			String playerCard3) {

		int handCode = checkHand(playerCard1, playerCard2, playerCard3);

		if (handCode == 3) { // straight
			return PP_STRAIGHT_ANTE * pairPluseWager;

		} else if (handCode == 4) { // 3 of a kind
			return PP_THREE_OF_A_KIND_ANTE * pairPluseWager;
		} else if (handCode == 5) { // straight flush
			System.out.println("You have a straight flush");
			return PP_STRAIGHT_FLUSH_ANTE * pairPluseWager;
		} else if (handCode == 2) { // flush
			System.out.println("You have a flush");
			return PP_FLUSH_ANTE * pairPluseWager;
		} else if (handCode == 1) { // pair
			System.out.println("You have a pair");
			return pairPluseWager;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param playerCard
	 * @return the face of the inputed card
	 * 
	 */
	private static int checkFace(String playerCard) {
		int cardFace = 0;
		try {
			cardFace = Integer.parseInt(playerCard.substring(0, playerCard.length() - 1));
		} catch (Exception ex) {
			if (playerCard.substring(0, playerCard.length() - 1).equals("J")) {
				cardFace = 11;
			} else if (playerCard.substring(0, playerCard.length() - 1).equals("Q")) {
				cardFace = 12;
			} else if (playerCard.substring(0, playerCard.length() - 1).equals("K")) {
				cardFace = 13;
			} else {
				cardFace = 14;
			}
		}
		return cardFace;
	}

	/**
	 * 
	 * @param card1Face
	 * @param card2Face
	 * @param card3Face
	 * @return if it is a straight
	 * 
	 */
	private static boolean isStraight(int card1Face, int card2Face, int card3Face) {
		int min = Math.min(card1Face, Math.min(card2Face, card3Face));
		int max = Math.max(card1Face, Math.max(card2Face, card3Face));
		return max - min == 2 && card1Face != card2Face && card3Face != card3Face && card2Face != card3Face;
	}

	private static boolean continueRound(Scanner in, int playerWallet) {
		System.out.print("Would you like to bet or fold (b/f): ");

		boolean validInput = false;

		while (!validInput) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("bet") || temp.equals("b"))
				return true;
			else if (temp.equals("fold") || temp.equals("f"))
				return false;
			else
				System.out.print("Would you like to bet or fold (b/f): ");
		}
		return false;

	}

	private static int getPairPlus(Scanner in, int playerWallet, int anteWager) {

		if (playerWallet == 0) {
			System.out.println("you do not have enough money for a pair plus");
			return 0;
		} else {
			System.out.print("Please enter a pair plus wager ");
		}
		boolean isValid = false;
		while (!isValid) {
			try {
				int x = Integer.parseInt(in.nextLine());

				if (x <= playerWallet - anteWager) {
					return x;
				} else {
					System.out.print("Please enter a pair plus wager ");
				}

			} catch (Exception ex) {
				System.out.print("Please enter a pair plus wager ");
			}
		}
		return 0;
	}

	private static int getAnteWager(Scanner in, int playerWallet) {
		System.out.print("Please enter an ante wager ");
		boolean isValid = false;
		while (!isValid) {
			try {
				int x = Integer.parseInt(in.nextLine());
				if (x <= playerWallet) {
					return x;
				} else {
					System.out.print("Please enter an ante wager ");
				}

			} catch (Exception ex) {
				System.out.print("Please enter an ante wager ");
			}
		}
		return 0;
	}

	public static String getCard() {
		return getFace() + getSuit();
	}

	public static String getFace() {
		int x = (int) (Math.random() * NUM_FACES) + 2;

		if (x <= 10)
			return "" + x;
		else if (x == 11)
			return "J";
		else if (x == 12)
			return "Q";
		else if (x == 13)
			return "K";
		else
			return "A";

	}

	public static String getSuit() {
		int x = (int) (Math.random() * NUM_SUITS);
		if (x == 0)
			return "S";
		else if (x == 1)
			return "D";
		else if (x == 1)
			return "H";
		else
			return "C";
	}

}
