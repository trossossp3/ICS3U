package com.bayviewglen.daythree;

public class BayviewGlenPools {
	public static void main(String[] args) {
		double length = 0; double width = 0;
		double shallowDepth =0;
		double deepDepth =0;
		double shallowLength = 0;
		double transLength =0 ;
		double price = 0;
		double deepLength = length - shallowLength - transLength;
		double transHeight = deepDepth - shallowDepth;
		
		double deepVolume = deepDepth * deepLength;
		double shallowVolume = shallowLength * shallowDepth;
		double transVolume = (transLength * deepDepth) - ((length - shallowLength - deepLength)*transHeight)/2;
		double volume = transVolume + shallowVolume + deepVolume;
		
		
		double deepSA = (deepDepth * deepLength) * 2; //not finished
		
		
	}

}
