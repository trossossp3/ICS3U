package com.bayviewglen.dayfive;

public class Dog {
	private boolean hasSpots;
	public Dog() {
		hasSpots = false;
	}
	
	public void addSpots() {
		hasSpots = true;
	}
	
	public String display() {
		return hasSpots? "This dogs has spots" : "this dog does not have spots";
			}
}
