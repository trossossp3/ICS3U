package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleTwo {
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		System.out.println("Size: " + words.size());
		
		words.add("dogs");
		words.add("cat");
		words.add("bird"+ words.get(0));
		
		System.out.println(words);
		
		System.out.println("size: " + words.size());
	}

}
