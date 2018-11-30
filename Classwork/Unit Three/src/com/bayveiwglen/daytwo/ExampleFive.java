package com.bayveiwglen.daytwo;

public class ExampleFive {
	public static void main(String[] args) {
		String[] words = {"apple", "grape", "pine", "table", "table"};
		
		int maxIndex = getMaxWordFirstOccurance(words);
		System.out.println("The word with largest value is " + words[maxIndex] + " at index "+ maxIndex);
	
		maxIndex = getMaxWordlastOccurance(words);
		System.out.println("The word with largest value is " + words[maxIndex] + " at index "+ maxIndex);
	}

	private static int getMaxWordlastOccurance(String[] words) {
		int maxIndex =0;
		for(int i =1; i< words.length;i++) {
			if(words[i].compareTo(words[maxIndex]) >= 0) { // the >= will return the last occurance
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static int getMaxWordFirstOccurance(String[] words) {
		int maxIndex =0;
		for(int i =1; i< words.length;i++) {
			if(words[i].compareTo(words[maxIndex]) > 0) { // the >= will return the last occurance
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
