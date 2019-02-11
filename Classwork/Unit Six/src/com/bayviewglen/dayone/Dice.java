package com.bayviewglen.dayone;
/* The Dice class is using the Singleton Design Pattern
 * Ensures that there is only 1 instance of the class 
 * The constructor is private
 * There is a method called getInstance() that will
 * call the private is there is not an instance of the class yet
 */
public class Dice {
	private Die[] dieArray;
	private static Dice dice;
	
	private Dice(){
		this.dieArray = new Die[2];
		this.dieArray[0] = new Die();
		this.dieArray[1] = new Die();
	}
	
	public static Dice getInstance(){
		if (dice == null)
			dice = new Dice();
		
		return dice;
	}
	
	public void roll(){
		for (Die d : dieArray){
			d.roll();
		}
	}
	
	public String displayRoll(){
		String s = "";
		for (Die d : dieArray){
			s += d.getTopSide() + " ";
		}
		
		return s;
	}
	
	public boolean isPair(){
		return dieArray[0].equals(dieArray[1]);
	}

}