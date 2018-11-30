package com.bayveiwglen.daytwo;

public class ExampleFour {
	public static void main(String[] args) {
		
			
			String[] arr = {"apple", "grape", "pine", "table"};
			
			int totalChars = getTotalCharacters(arr);
			
			System.out.println("The number of chars in array of the array is: " + totalChars);
		}

		public static int getTotalCharacters(String[] words) {
			int totalChars = 0;
			
			for(String s: words) {
				totalChars+=s.length();
			}
			return totalChars;
		}

	}

