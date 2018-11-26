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

	public static void main(String[] args) {
		boolean x = isStraight(2,14,3);
	System.out.println(x);
	}
}