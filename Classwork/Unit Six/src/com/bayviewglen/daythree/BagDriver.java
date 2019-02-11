package com.bayviewglen.daythree;

public class BagDriver {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		b1.add(3);
		b1.add(5);
		b1.add(23);
		b1.add(4);
		b1.add(24);
		Bag b2 = new Bag(5);
		b2.add(4);
		Bag b3 = new Bag(b1);
		
		b3.add(4);
		b3.add(4);
		
		System.out.println(b1.countOccurances(4));
		System.out.println(b2.countOccurances(4));
		System.out.println(b3.countOccurances(4));
				
	}
}
