package com.bayviewglen.threecardpoker;

public class test {
	public static boolean isValidCard(String[] arr, int numElements) {
		for (int i = 0; i < arr.length-1; i++) {
	        for (int j = i+1; j < arr.length; j++) {
	             if (arr[i] == arr[j]) {
	                 return false;
	             }
	        }
	    }              
	    return true;     
	}

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

	public static void main(String[] args) {
		String[] arr = {"10D", "QC", "10D"};		
		System.out.println(isValidCard(arr , 3));
	}
}