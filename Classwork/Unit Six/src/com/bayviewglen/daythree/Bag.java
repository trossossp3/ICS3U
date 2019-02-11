package com.bayviewglen.daythree;

public class Bag {
	private static final int DEFAULT_CAPACITY=10;
	
	private int[] data;
	private int manyItems;
	/*default contructor*/
	public Bag() {
		data = new int[DEFAULT_CAPACITY];
	}
	
	public Bag(int capacity) {
		data = new int[capacity];
		manyItems = 0;
	}
	//copy contructor - it will make a copy of the bag that got passed in
	public Bag(Bag bag) {
		this.data = new int[bag.data.length];
		this.manyItems = bag.manyItems;
		for(int i = 0; i<bag.manyItems; i++) {
			this.data[i] = bag.data[i];
			
		}
	}
	
	public void add(int el) {
		data[manyItems++]=el;
	}
	
	public int size() {
		return manyItems;
	}
	
	public int countOccurances(int target) {
		int count = 0;
		for(int i=0;i<manyItems;i++) {
			if(data[i]==target) {
				count++;
			}
		}
		return count;
	}
	
	public boolean remove(int target) {
		for(int i=0;i<manyItems;i++) {
			if(data[i]==target) {
			data[i] = data[--manyItems]; // the minus 1 happens last
			return true;			
			}
		}
		return false;
	}
	
	
}
