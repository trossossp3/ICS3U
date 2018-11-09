package com.bayviewglen.threecardpoker;

public class test {
	public static void main(String[] args) {

		pairPlusWinnings(10, "10C 10D 10H");
	}

	private static void pairPlusWinnings(int pairPlusWager, String playerHand) {
		String card1Suit = "";
		String card2Suit = "";
		String card3Suit = "";

		int suitIndex1 = 0;
		int suitIndex2 = 0;
		int suitIndex3 = 0;

		for (int i = 0; i < playerHand.length(); i++) {
			if (playerHand.charAt(i) == 'S' || playerHand.charAt(i) == 'C' || playerHand.charAt(i) == 'D'
					|| playerHand.charAt(i) == 'H' && suitIndex2 == 0 && suitIndex3 == 0) {
				card1Suit += playerHand.charAt(i);
				suitIndex1 = i;
			}
			if (playerHand.charAt(i) == 'S' || playerHand.charAt(i) == 'C' || playerHand.charAt(i) == 'D'
					|| playerHand.charAt(i) == 'H' && suitIndex1 != 0 && suitIndex3 == 0) {
				card2Suit += playerHand.charAt(i);
				suitIndex2 = i;
			}
			if (playerHand.charAt(i) == 'S' || playerHand.charAt(i) == 'C' || playerHand.charAt(i) == 'D'
					|| playerHand.charAt(i) == 'H' && suitIndex1 != 0 && suitIndex2 != 0) {
				card3Suit += playerHand.charAt(i);
				suitIndex3 = i;
			}
		}
		System.out.println(card1Suit);
		System.out.println(card2Suit);
		System.out.println(card3Suit);
	}
}
