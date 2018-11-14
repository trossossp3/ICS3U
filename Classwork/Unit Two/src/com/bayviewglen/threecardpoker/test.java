package com.bayviewglen.threecardpoker;

public class test {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 5;
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		System.out.println(max - min == 2 && a != b && a != c && b != c);
		System.out.println(queenHigh("2S", "2H", "QS"));
		String[] arr = {"2S","2S"};
		System.out.println(isValidCard(arr));
		
	}

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

	private static boolean queenHigh(String dealerCard1, String dealerCard2, String dealerCard3) {
		if (checkFace(dealerCard1) >= 12 || checkFace(dealerCard2) >= 12 || checkFace(dealerCard3) >= 12) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isValidCard(String[] allCards) {
		boolean isValid = true;
		for (int i = 0; i < allCards.length - 1; i++) {
			if (checkFace(allCards[i]) == checkFace(allCards[i + 1])) {
				return false;
			}
		}
		return true;
	}
}