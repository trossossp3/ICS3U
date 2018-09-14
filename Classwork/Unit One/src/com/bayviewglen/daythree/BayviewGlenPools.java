package com.bayviewglen.daythree;

public class BayviewGlenPools {
	public static void main(String[] args) {
		double length = 15;
		double width = 5;
		double shallowDepth = 2;
		double deepDepth = 4;
		double shallowLength = 9;
		double transHypo = 5;
		double price = 2.4;

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
		double deepSidesSA = deepDepth * deepLength * 2; 
		double deepBottomSA = deepLength * width;
		double deepBackWallSA = width * deepDepth;
		double deepSA = deepBackWallSA + deepBottomSA + deepSidesSA;
		
		// shallow SA
		double shallowSidesSA = (shallowLength * shallowDepth) * 2; // two sides
		double shallowFrontSA = shallowDepth * width;
		double shallowBottomSA = shallowLength * width;
		double shallowSA = shallowSidesSA + shallowFrontSA + shallowBottomSA;
		
		// transition SA

		double transSidesSA = ((deepDepth * xTransLength) - (xTransLength * transHeight/2)) * 2;
		double transBottomSA = transHypo * width;
		double transSA = transBottomSA + transSidesSA;
		double totalSA = deepSA + shallowSA + transSA;
		
		

		// final steps
		System.out.println("90% of pool filled ≈ " + (double)Math.round((totalVolume * 0.9)*100)/100 + " meters cubed");
		
		System.out.println("the amount of liner needed ≈ " + (double)Math.round(totalSA*100)/100 + " meters squared");
		
		System.out.println("total cost ≈ " + "$" + (double)Math.round((totalSA * price)*100)/100);
		
		
		

	}

}
