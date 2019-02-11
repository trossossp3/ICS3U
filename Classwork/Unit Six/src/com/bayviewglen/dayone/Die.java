package com.bayviewglen.dayone;

public class Die {

	private int numSides;
	private int topSide;
	
	public Die(){
		this.numSides = 6;
	}
	
	public Die(int numSides){
		if(numSides >2) {
			this.numSides = numSides;
		}else {
			throw new IllegalArgumentException("NO");
		}
	}
	
	public void roll(){
		topSide = (int)(Math.random()*numSides + 1);
	}
	
	public int getTopSide(){
		return topSide;
	}
	
	public boolean equals(Die die){
		return this.topSide == die.topSide;
	}

}
