package com.bayviewglen.dayone;

import java.util.Comparator;
/* 
Used to Sort the ArrayList of Players
*/
public class PlayerSort implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		return p2.getNumPairs() - p1.getNumPairs();
	}

}
