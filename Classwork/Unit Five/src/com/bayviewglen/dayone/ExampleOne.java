package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleOne {
	public static void main(String[] args) {		
		/*
		  arraylist is a list implemented with an array
		
			things a list can do
				add
				remove
				get	
				set
				size
				
			list must store object types
			
			ArrayList<Integer> ints = new ArrayList<Integer>();
			
			Size is dynamic
			
		*/
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		System.out.println("Size: " + ints.size());
		//add(obj) adds to the end of the list
		ints.add(7);
		ints.add(10);
		ints.add(-6);
		System.out.println(ints);
		
		//this does not mean the size of the array is 3
		//it actually is probably not	
		System.out.println("Size: " + ints.size());
	}

}
