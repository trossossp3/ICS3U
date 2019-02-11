package com.bayviewglen.dayone;

import java.util.Comparator;

public class Player {
	private String playerName;
	private Dice dice;
	private int numPairs;
	
	public Player(String playerName) {
		this.playerName = playerName;
		this.numPairs = 0;
		this.dice = Dice.getInstance();
	}

	public void incrementNumPairs(){
		numPairs++;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public int getNumPairs() {
		return numPairs;
	}
	
	/* True if you got a pair */
	public boolean takeTurn(){
		dice.roll();
		if (dice.isPair()){
			incrementNumPairs();
			return true;
		}
		else
			return false;
	}
		
	public String toString(){
		return playerName + ": " + numPairs;
	}
	
	public Dice getDice(){
		return dice;
	}

	
	public int compare(Player p1, Player p2) {
		return p2.numPairs - p1.numPairs;
	}
	
}