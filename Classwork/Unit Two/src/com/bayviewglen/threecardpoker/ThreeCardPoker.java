package com.bayviewglen.threecardpoker;

//http://www.vidpoker.com/threecardpoker/index.html

//does the ante winnigns include your bet
// so if u bet 100 are the winnings 200

import java.util.Scanner;

/**
 * Name: ThreeCardPoker
 * 
 * @author Trent Rossos
 * 
 *         Description: This is a 3 card poker simulator
 * 
 */

public class ThreeCardPoker {
	public static final int MIN_BET = 50;
	public static final int MAX_BET = 100;
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

		while (!isGameOver) {
			boolean isRoundOver = false;

			String playerHand = "";
			String playerCard1 = "";
			String playerCard2 = "";
			String playerCard3 = "";
			String dealerCard1 = "";
			String dealerCard2 = "";
			String dealerCard3 = "";
			String dealerHand = "";

			Boolean isDuplicate = false;
			while (!isDuplicate) {
				playerCard1 = getCard();
				if (isUnique(playerHand, playerCard1)) {
					playerHand += playerCard1 + " ";
					isDuplicate = true;
				}
			}
			isDuplicate = false;
			while (!isDuplicate) {
				playerCard2 = getCard();
				if (isUnique(playerHand, playerCard2)) {
					playerHand += playerCard2 + " ";
					isDuplicate = true;
				}
			}
			isDuplicate = false;
			while (!isDuplicate) {
				playerCard3 = getCard();
				if (isUnique(playerHand, playerCard3)) {
					playerHand += playerCard3 + " ";
					isDuplicate = true;
				}
			}
			isDuplicate = false;
			while (!isDuplicate) {
				dealerCard1 = getCard();
				if (isUnique(playerHand, dealerHand, dealerCard1)) {
					dealerHand += dealerCard1 + " ";
					isDuplicate = true;
				}
			}
			isDuplicate = false;
			while (!isDuplicate) {
				dealerCard2 = getCard();
				if (isUnique(playerHand, dealerHand, dealerCard2)) {
					dealerHand += dealerCard2 + " ";
					isDuplicate = true;
				}
			}
			isDuplicate = false;
			while (!isDuplicate) {
				dealerCard3 = getCard();
				if (isUnique(playerHand, dealerHand, dealerCard3)) {
					dealerHand += dealerCard3 + " ";
					isDuplicate = true;
				}
			}

			System.out.println("You have: $" + playerWallet);
			int anteWager = getAnteWager(in, playerWallet);
			if (anteWager == 0) {
				isGameOver = true;
				break;
			}

			playerWallet -= anteWager;

			int pairPlusWager = getPairPlus(in, playerWallet);
			playerWallet -= pairPlusWager;

			while (!isRoundOver) {

				System.out.println(playerHand);

				boolean continueRound = continueRound(in, playerWallet); // improve wording of this

				if (continueRound) {
					playerWallet -= anteWager;
					anteWager *= 2; // if they want to continue they must bet the same amount as their ante bet
					// checks if dealer has queenHigh
					System.out.println("The dealer hand: " + dealerHand);
					boolean isDealerActive = queenHigh(dealerCard1, dealerCard2, dealerCard3); // if the dealer
																								// does not
																								// have queen
																								// high

					int anteWinnings = 0;
					if (!isDealerActive) { // if the dealer does not have queen high
						System.out.println("The dealer does not have queen high");
						// anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
						// System.out.println("You got: " + anteWinnings + " from the ante bonus");

						System.out.println("You got: " + anteWager + " from the ante returned ante wager");
						int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2, playerCard3);
						System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
						playerWallet += (pairPlusWinnings + anteWinnings);
						System.out.println("you have: $" + playerWallet);

						isGameOver = playNextRound(in, playerWallet);
						isRoundOver = true;
					} else {
						int winner = checkWinner(playerCard1, playerCard2, playerCard3, dealerCard1, dealerCard2,
								dealerCard3);
						if (winner == 1) { // player won
							// anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
							// System.out.println("You got: " + anteWinnings + " from the ante bonus");
							anteWinnings += anteWager * 2;
							System.out.println("You won: " + anteWinnings + " from the ante winnings");
							int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2,
									playerCard3);
							System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
							System.out.println("you have: $" + (playerWallet + pairPlusWinnings + anteWinnings));
							playerWallet += (pairPlusWinnings + anteWinnings);
							isGameOver = playNextRound(in, playerWallet);
							isRoundOver = true;
						} else if (winner == 2) { // dealer won

							// anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
							// System.out.println("You got: " + anteWinnings + " from the ante bonus");
							System.out.println("You won: " + anteWinnings + " from the ante winnings");
							int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1, playerCard2,
									playerCard3);
							System.out.println("You won: " + pairPlusWinnings + " from the pair Plus Winnings");
							System.out.println("you have: $" + (playerWallet + pairPlusWinnings + anteWinnings));
							playerWallet += (pairPlusWinnings + anteWinnings);
							isGameOver = playNextRound(in, playerWallet);
							isRoundOver = true;
						} else {
							// anteWinnings = anteBonus(anteWager, playerCard1, playerCard2, playerCard3);
							// System.out.println("You got: " + anteWinnings + " from the ante bonus");
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
					// int pairPlusWinnings = pairPlusWinnings(pairPlusWager, playerCard1,
					// playerCard2, playerCard3);
					// System.out.println("you won: $" + pairPlusWinnings + " from the Pair Plus");
					System.out.println("you have: $" + (playerWallet));
					isGameOver = playNextRound(in, playerWallet);
					isRoundOver = true;
				} else {
					System.out.println("you have: $" + (playerWallet));
					isGameOver = playNextRound(in, playerWallet);
					isRoundOver = true;
				}
			}
		}
	}

	public static boolean isUnique(String playerHand, String dealerHand, String card) {
		return playerHand.indexOf(card) == -1 && dealerHand.indexOf(card) == -1;
	}

	public static boolean isUnique(String playerHand, String card) {
		return playerHand.indexOf(card) == -1;
	}

	/**
	 * This method is used to return the winner of the round, the player or dealer
	 * 
	 * @param playerCard1
	 * @param playerCard2
	 * @param playerCard3
	 * @param dealerCard1
	 * @param dealerCard2
	 * @param dealerCard3
	 * @return the winner of the round
	 * 
	 */
	public static int checkWinner(String playerCard1, String playerCard2, String playerCard3, String dealerCard1,
			String dealerCard2, String dealerCard3) {

		int playerHandRanking = checkHand(playerCard1, playerCard2, playerCard3);
		int dealerHandRanking = checkHand(dealerCard1, dealerCard2, dealerCard3);
		/*
		 * 0 = push 1 = player 2 = dealer
		 */

		if (playerHandRanking > dealerHandRanking) {
			System.out.println("player won");
			return 1;
		} else if (playerHandRanking < dealerHandRanking) {
			System.out.println("Dealer won");
			return 2;
		} else {

			int winner = checkHigherHand(playerCard1, playerCard2, playerCard3, dealerCard1, dealerCard2, dealerCard3,
					playerHandRanking, dealerHandRanking);
			if (winner == 1) {
				System.out.println("player won");
				return 1;
			} else if (winner == 2) {
				System.out.println("Dealer won");
				return 2;
			} else {
				System.out.println("It was a push");
				return 0;
			}

		}

	}

	/**
	 * This method is used to see who has a higher hand when the player and dealer
	 * have the same hand-rankings
	 * 
	 * @param playerCard1
	 * @param playerCard2
	 * @param playerCard3
	 * @param dealerCard1
	 * @param dealerCard2
	 * @param dealerCard3
	 * @param playerHandRanking
	 * @param dealerHandRanking
	 * @return checks who has a better hand
	 * 
	 * 
	 */
	public static int checkHigherHand(String playerCard1, String playerCard2, String playerCard3, String dealerCard1,
			String dealerCard2, String dealerCard3, int playerHandRanking, int dealerHandRanking) {

		// player =0
		// dealer =1
		// push = 2
		int playerHighCard = 0;
		int dealerHighCard = 0;

		if (playerHandRanking == 1 && dealerHandRanking == 1) {
			int playerCardValue1 = checkFace(playerCard1);
			int playerCardValue2 = checkFace(playerCard2);
			int playerCardValue3 = checkFace(playerCard3);

			if (playerCardValue1 == playerCardValue2) {
				playerHighCard = playerCardValue1;
			} else if (playerCardValue1 == playerCardValue3) {
				playerHighCard = playerCardValue1;
			} else {
				playerHighCard = playerCardValue2;
			}

			int dealerCardValue1 = checkFace(dealerCard1);
			int dealerCardValue2 = checkFace(dealerCard2);
			int dealerCardValue3 = checkFace(dealerCard3);

			if (dealerCardValue1 == dealerCardValue2) {
				dealerHighCard = dealerCardValue1;
			} else if (dealerCardValue1 == dealerCardValue3) {
				dealerHighCard = dealerCardValue1;
			} else {
				dealerHighCard = dealerCardValue2;
			}

			if (dealerHighCard > playerHighCard) {
				return 2;
			} else if (dealerHighCard < playerHighCard) {
				return 1;
			} else {
				return 0;
			}
		} else {
			playerHighCard = getHighCard(playerCard1, playerCard2, playerCard3);
			dealerHighCard = getHighCard(dealerCard1, dealerCard2, dealerCard3);
			if (dealerHighCard > playerHighCard) {
				return 2;
			} else if (dealerHighCard < playerHighCard) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	/**
	 * This method is used to find the greatest card value out of three cards
	 * 
	 * @param Card1
	 * @param Card2
	 * @param Card3
	 * @return the highest of the three card values
	 * 
	 */
	public static int getHighCard(String Card1, String Card2, String Card3) {
		int first = checkFace(Card1);
		int second = checkFace(Card2);
		int third = checkFace(Card3);
		if (first > second && first > third) {
			return first;
		} else if (second > first && second > third) {
			return second;
		} else if (third > first && third > second) {
			return third;
		}
		return 0;

	}

	/**
	 * This method is used to determine if the dealer has a hand of at least queen
	 * high
	 * 
	 * @param dealerCard1
	 * @param dealerCard2
	 * @param dealerCard3
	 * @return boolean if the dealer has at least a queen high
	 * 
	 */
	public static boolean queenHigh(String dealerCard1, String dealerCard2, String dealerCard3) {
		int handValue = checkHand(dealerCard1, dealerCard2, dealerCard3);
		if (handValue == 0) {
			if (checkFace(dealerCard1) >= 12 || checkFace(dealerCard2) >= 12 || checkFace(dealerCard3) >= 12) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	/**
	 * This method is used to determine the hand ranking of the inputed three
	 * string. An int value is assigned to each hand ranking: pair = 1, flush = 2,
	 * straight = 3, three of a kind = 4, straight flush = 5
	 * 
	 * @param card1
	 * @param card2
	 * @param card3
	 * @return int the hand ranking
	 * 
	 */
	public static int checkHand(String card1, String card2, String card3) {
		int handValue = 0;
		String card1Suit = card1.substring(card1.length() - 1);
		String card2Suit = card2.substring(card2.length() - 1);
		String card3Suit = card3.substring(card3.length() - 1);

		int card1Face = checkFace(card1);
		int card2Face = checkFace(card2);
		int card3Face = checkFace(card3);

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

	/**
	 * This method is used to determine the ante bonus
	 * 
	 * @param anteWager
	 * @param playerCard1
	 * @param playerCard2
	 * @param playerCard3
	 * @return int the ante bonus
	 * 
	 */
	public static int anteBonus(int anteWager, String Card1, String Card2, String Card3) {

		int handCode = checkHand(Card1, Card2, Card3);

		if (handCode == 3) { // straight
			System.out.println("You have a straight");
			return STRAIGHT_ANTE * anteWager + anteWager;
		} else if (handCode == 4) { // 3 of a kind
			System.out.println("You have 3 of a kind");
			return THREE_OF_A_KIND_ANTE * anteWager + anteWager;
		} else if (handCode == 5) { // straight flush
			System.out.println("You have a straight flush");
			return STRAIGHT_FLUSH_ANTE * anteWager + anteWager;
		} else {
			return 0;
		}

	}

	/**
	 * This method determines if the player can and/or wants to play the next round
	 * 
	 * @param in
	 * @param playerWallet
	 * @return boolean if the can and/or wants to play next round
	 * 
	 */

	public static boolean playNextRound(Scanner in, int playerWallet) {

		if (playerWallet < MIN_BET) {
			System.out.println("you are out of money");
			return true;
		}
		System.out.print("Play Next Round? (Y/N): ");

		boolean isValidInput = false;
		while (!isValidInput) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("y")) {
				System.out.println("******************");
				return false;
			} else if (temp.equals("no") || temp.equals("n"))
				return true;
			else
				System.out.print("Play Next Round? (Y/N): ");
		}

		return false;
	}

	/**
	 * This method determines the pair plus winnings
	 * 
	 * @param pairPlusWager
	 * @param playerCard1
	 * @param playerCard2
	 * @param playerCard3
	 * @return int pair plus winnings
	 * 
	 */

	public static int pairPlusWinnings(int pairPluseWager, String playerCard1, String playerCard2, String playerCard3) {

		int handCode = checkHand(playerCard1, playerCard2, playerCard3);

		if (handCode == 3) { // straight
			System.out.println("You has a straight");
			return PP_STRAIGHT_ANTE * pairPluseWager;

		} else if (handCode == 4) { // 3 of a kind
			System.out.println("You have three of a kind");
			return PP_THREE_OF_A_KIND_ANTE * pairPluseWager + pairPluseWager;
		} else if (handCode == 5) { // straight flush
			System.out.println("You have a straight flush");
			return PP_STRAIGHT_FLUSH_ANTE * pairPluseWager + pairPluseWager;
		} else if (handCode == 2) { // flush
			System.out.println("You have a flush");
			return PP_FLUSH_ANTE * pairPluseWager + pairPluseWager;
		} else if (handCode == 1) { // pair
			System.out.println("You have a pair");
			return pairPluseWager * 2;
		} else {
			return 0;
		}
	}

	/**
	 * This method is used to determine the face value of a card
	 * 
	 * @param card
	 * @return int face value
	 * 
	 */
	public static int checkFace(String card) {
		int cardFace = 0;
		try {
			cardFace = Integer.parseInt(card.substring(0, card.length() - 1));
		} catch (Exception ex) {
			if (card.substring(0, card.length() - 1).equals("J")) {
				cardFace = 11;
			} else if (card.substring(0, card.length() - 1).equals("Q")) {
				cardFace = 12;
			} else if (card.substring(0, card.length() - 1).equals("K")) {
				cardFace = 13;
			} else {
				cardFace = 14;
			}
		}
		return cardFace;
	}

	/**
	 * This method is used to determine if three card values are in sequence
	 * 
	 * @param card1Face
	 * @param card2Face
	 * @param card3Face
	 * @return boolean if it is a straight
	 * 
	 */
	public static boolean isStraight(int card1Face, int card2Face, int card3Face) {

		int min = Math.min(card1Face, Math.min(card2Face, card3Face));
		int max = Math.max(card1Face, Math.max(card2Face, card3Face));
		if (max - min == 2 && card1Face != card2Face && card3Face != card1Face && card2Face != card3Face) {
			return true;
		} else {
			if (card1Face == 14) {
				card1Face = 1;
			}
			if (card2Face == 14) {
				card2Face = 1;
			}
			if (card3Face == 14) {
				card3Face = 1;
			}
			min = Math.min(card1Face, Math.min(card2Face, card3Face));
			max = Math.max(card1Face, Math.max(card2Face, card3Face));
			if (max - min == 2 && card1Face != card2Face && card3Face != card1Face && card2Face != card3Face) {
				return true;
			}
			return false;
		}
	}

	/**
	 * This method determines if the player would like to place a play wager or fold
	 * 
	 * @param in
	 * @param playerWallet
	 * @return boolean if the player would like to bet or fold
	 * 
	 */
	public static boolean continueRound(Scanner in, int playerWallet) {
		System.out.print("Would you like to bet your play wager or fold (b/f): ");

		boolean validInput = false;
		if (playerWallet * 2 < MIN_BET) {
			System.out.println("You do not have enough money to bet");
			validInput = false;
		} else {
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
		return false;
	}

	/**
	 * This method determines if the player would like to play Pair plus and gets
	 * their wager
	 * 
	 * @param in
	 * @param playerWallet
	 * @param anteWager
	 * @return int pair plus wager
	 * 
	 */
	public static int getPairPlus(Scanner in, int playerWallet) {

		boolean wantPP = true;
		boolean isValid = false;

		if (playerWallet - MIN_BET <= 0) {
			System.out.println("You are not able to play Pair Plus and place a play wager");
			return 0;
		}
		System.out.print("Do you want to play Pair Plus (Y/N): ");
		while (!isValid) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("y")) {
				wantPP = true;
				isValid = true;
			} else if (temp.equals("no") || temp.equals("n")) {
				wantPP = false;
				isValid = true;
			} else {
				System.out.print("Do you want to play Pair Plus (Y/N): ");
			}
		}
		if (wantPP) {
			if (playerWallet < MIN_BET) {
				System.out.println("you do not have enough money for a pair plus");
				return 0;
			} else {
				System.out.print("Please enter a pair plus wager between $50-$100: ");

				isValid = false;
				while (!isValid) {
					try {
						int x = Integer.parseInt(in.nextLine());

						if (x >= MIN_BET && x <= MAX_BET) {
							return x;
						} else {
							System.out.print("Please enter a pair plus wager between $50-$100: ");
						}

					} catch (Exception ex) {
						System.out.print("Please enter a pair plus wager between $50-$100: ");
					}
				}
			}
		} else {
			return 0;
		}
		return 0;

	}

	/**
	 * This method gets the player's ante wager
	 * 
	 * @param in
	 * @param playerWallet
	 * @return int ante wager
	 * 
	 */

	public static int getAnteWager(Scanner in, int playerWallet) {

		if (playerWallet < MIN_BET * 2) {
			System.out.println("You do not have enough money for a play bet");
			System.out.println("You lost!");
			return 0;
		}
		System.out.print("Please enter an ante wager between $50-$100: ");
		boolean isValid = false;
		while (!isValid) {
			try {
				int x = Integer.parseInt(in.nextLine());

				if (x * 2 <= playerWallet && x > 0 && x <= MAX_BET && x >= MIN_BET) {
					return x;
				} else if (x * 2 > playerWallet) {
					System.out.println("You will not be able to make a play wager at that amount");
					System.out.print("Please enter an ante wager between $50-$100: ");
				}

				else {
					System.out.print("Please enter an ante wager between $50-$100: ");
				}

			} catch (Exception ex) {
				System.out.print("Please enter an ante wager between $50-$100: ");
			}
		}

		return 0;
	}

	/**
	 * This method creates a playing card
	 * 
	 * @return a card with suit and face
	 * 
	 */

	public static String getCard() {
		return getFace() + getSuit();
	}

	/**
	 * This method generates a face for a card
	 * 
	 * @return int card face
	 * 
	 */
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

	/**
	 * This method generates a suit for a card
	 * 
	 * @return card suit
	 */
	public static String getSuit() {
		int x = (int) (Math.random() * NUM_SUITS);
		if (x == 0)
			return "S";
		else if (x == 1)
			return "D";
		else if (x == 2)
			return "H";
		else
			return "C";
	}

}
