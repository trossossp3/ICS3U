package com.bayviewglen.daythree;

public class BayviewGlenPools {
	public static void main(String[] args) {
		double length = 0;
		double width = 0;
		double shallowDepth = 0;
		double deepDepth = 0;
		double shallowLength = 0;
		double transHypo = 0;
		double price = 0;

		// transition section finding lengths
		double transHeight = deepDepth - shallowDepth;
		double xTransLength = Math.sqrt(Math.pow(transHypo, 2) - Math.pow(transHeight, 2));

		// deep end volume
		double deepLength = length - shallowLength - xTransLength;
		double deepVolume = deepDepth * deepLength * width;

		// shallow end volume
		double shallowVolume = shallowLength * shallowDepth * width;

		// transition volume
		double transRectVolume = xTransLength * deepDepth * width;
		double transTriangleVolume = ((xTransLength * transHeight) / 2) * width;
		double transVolume = transRectVolume - transTriangleVolume;

		// total volume
		double totalVolume = transVolume + shallowVolume + deepVolume;

		// deep SA
		double deepSidesSA = (deepDepth * deepLength) * 2; // not finished
		double deepBottomSA = deepLength * width;
		double deepBackWallSA = width * deepDepth;
		double deepSA = deepBackWallSA + deepBottomSA + deepSidesSA;
		
		//shallow SA
		double shallowSidesSA = (shallowLength * shallowDepth) * 2; // two sides
		double shallowFrontSA = shallowDepth * width;
		double shallowBottomSA = shallowLength * width;
		double shallowSA = shallowSidesSA + shallowFrontSA + shallowBottomSA;
		
		//trans SA
		
		double transSidesSA = (deepDepth*xTransLength) - (0.5*(xTransLength*transHeight)) *2;
		double transBottomSA = transHypo * width;
		double transSA = transBottomSA * transSidesSA;
		
		//total SA
		
		double totalSA = deepSA + shallowSA + transSA;
		
		//
		
	}

}
