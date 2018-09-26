package com.bayviewglen.dayone;

public class ExampleOne {
	public static void main(String[] args) {
		
		// A string is a sequence of characters
		// A string of characters
		//think a string of beads or sequence of beds on a String
		
		String str = "this is a string";
		
		System.out.println(str.length()); // not asking for the index but the amount of characters
		System.out.println(str.substring(1,4)); // the upper bound is exclusive
		System.out.println(str.substring(10)); //starts at position 10 and prints rest
		
		System.out.println(str.indexOf("is")); // looks for first occurrence
		System.out.println(str.indexOf("bat")); // returns -1 because it is not part of the string
		
		System.out.println("hello".compareTo("hello")); // if it is true return 0
		System.out.println("hi".compareTo("hello")); //returns for because it returns the difference between the ascii value of i-e
		System.out.println("hello".compareTo("hi")); //returns -4 because -4 is the difference between e-i
		
		System.out.println('e'-'i');
		
		String a = new String("apple"); // use new to create new object
		String b = new String("apple");
		
		System.out.println(a==b); //returns false because the adress is different
		System.out.println(a.equals(b));
		
		String c = "bear"; //when it sees a new string literal it will store in same location
		String d = "bear";		// string literal
		System.out.println(c==d); //returns true because they are string literals and stored in same spot
		
	}

}
